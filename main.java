//import to read in cells.csv
import com.opencsv.CSVReader;
//imports for reading io file and data storage using hash map
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Import MyObject class from MyObject.java
import MyObject; // Replace com.example with your actual package name

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
                    MyObject obj = new MyObject(nextLine[0], nextLine[1] /* Pass other fields as arguments */);
                    // Set other fields of MyObject instance
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
            System.out.println("Field1: " + obj.getField1());
            System.out.println("Field2: " + obj.getField2());
            // Print other fields
        }
    }
}
