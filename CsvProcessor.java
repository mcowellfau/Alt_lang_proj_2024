import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CsvProcessor {

    public static Map<Integer, Cell> readCsvAndCreateObjects(String filePath) {
        Map<Integer, Cell> cellMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowKey = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
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
                
                Cell cell = new Cell(oem, model,launchAnnounced,launchStatus, bodyDimensions, bodyWeight, bodySim, displayType, displaySize, displayResolution, featureSensors, platformOs);
                cellMap.put(rowKey++, cell); // Storing the cell object in the map with a unique key
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellMap;
    }
}
