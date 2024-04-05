public class Main {
    public static void main(String[] args) {
        String path = "path_to_your_file.csv";
        Map<Integer, Cell> cellMap = CsvProcessor.readCsvAndCreateObjects(path);
        
        // Use the cellMap as needed
    }
}
