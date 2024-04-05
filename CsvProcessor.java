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
                String launchAnnounced = values[0];
                Float bodyWeight = Float.parseFloat(values[1]);
                // Parse and convert other values as necessary
                
                Cell cell = new Cell(launchAnnounced, bodyWeight);
                cellMap.put(rowKey++, cell); // Storing the cell object in the map with a unique key
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellMap;
    }
}
