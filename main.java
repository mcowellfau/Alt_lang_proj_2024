import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String csvFile = "cells.csv";
        Map<Integer, MyObject> map = new HashMap<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;
            int lineNumber = 0;
            while ((nextLine = reader.readNext()) != null) {
                // Assuming each line has 12 columns
                if (nextLine.length == 12) {
                    // Replace missing or "-" values with null
                    for (int i = 0; i < nextLine.length; i++) {
                        if (nextLine[i].isEmpty() || nextLine[i].equals("-")) {
                            nextLine[i] = null;
                        }
                    }

                    // Transform data in appropriate columns
                    // For example, in the body_weight column, extract the numeric value
                    if (nextLine[5] != null && nextLine[5].contains("g")) {
                        String weight = nextLine[5].replaceAll("[^\\d]", ""); // Extract numeric part
                        nextLine[5] = weight.isEmpty() ? null : weight; // Assign null if no numeric part found
                    }

                    // Create a MyObject instance using the values from the CSV
                    MyObject obj = new MyObject(nextLine[0], nextLine[1], nextLine[2], nextLine[3],
                                                nextLine[4], nextLine[5], nextLine[6], nextLine[7],
                                                nextLine[8], nextLine[9], nextLine[10], nextLine[11]);
                    // Store the MyObject instance in the HashMap
                    map.put(lineNumber, obj);
                    lineNumber++;
                } else {
                    System.err.println("Invalid number of columns in CSV file.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Now you have a map with line numbers as keys and MyObject instances as values
        // You can access the objects by their line numbers
        for (Map.Entry<Integer, MyObject> entry : map.entrySet()) {
            System.out.println("Line number: " + entry.getKey());
            MyObject obj = entry.getValue();
            // Do something with the MyObject instance
            System.out.println("OEM: " + obj.getOem());
            System.out.println("Model: " + obj.getModel());
            // Print other fields
        }
    }
}

