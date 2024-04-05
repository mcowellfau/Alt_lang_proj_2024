import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvProcessor {
    private static final String STRING_PLACEHOLDER = "Nil";
    private static final Integer INTEGER_PLACEHOLDER = -1; 
    private static final Float FLOAT_PLACEHOLDER = -1.0f;

    public static Map<Integer, Cell> readCsvAndCreateObjects(String filePath) {
        Map<Integer, Cell> cellMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowKey = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1); // Use -1 to include trailing empty strings
                // Assuming the CSV structure matches the Cell class constructor
                String oem = values[0];
                String model = values[1];
                Integer launchAnnounced = Integer.parseInt(values[2]);
                String launchStatus = values[3];
                String bodyDimensions = values[4];
                Float bodyWeight = Float.parseFloat(values[5]);
                String bodySim = values[6];
                String displayType = values[7];
                Float displaySize = Float.parseFloat(values[8]);
                String displayResolution = values[9];
                String featureSensors = values[10];
                String platformOs = values[11];
                
                Cell cell = new Cell(oem, model, launchAnnounced, launchStatus, bodyDimensions, bodyWeight, bodySim, displayType, displaySize, displayResolution, featureSensors, platformOs);
                cellMap.put(rowKey++, cell); // Storing the cell object in the map with a unique key
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellMap;
    }
    //Validation Methods
    private static String validateOem(String oem) {
        if (oem != null && !oem.trim().isEmpty()) {
            return oem; // Returns the original string, not the trimmed version
        }
        return STRING_PLACEHOLDER;
    }private static String validateModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            return model;
        }
        return STRING_PLACEHOLDER;
    }
    

}
