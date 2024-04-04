import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String inputCsvFile = "D:\\COP4020\\Alt_lang_Cowell2024\\Alt_lang_proj_2024\\cells.csv"; // Adjust the path to your original CSV file
        String outputCsvFile = "path_to_your_destination_file/cleaned_cells.csv"; // Adjust the path to your destination CSV file

        // Reading and processing the CSV file
        List<MyObject> dataList = readAndProcessCsv(inputCsvFile);

        // Writing the cleaned data to a new CSV file
        writeCleanedCsv(dataList, outputCsvFile);
    }

    private static List<MyObject> readAndProcessCsv(String filePath) {
        List<MyObject> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip the header row

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",", -1); // Split the line into parts, including trailing empty strings
                
                // Process each value based on column-specific rules
                String oem = validateAndTransformOem(values[0]);
                String model = validateAndTransformModel(values[1]);
                Integer launchAnnounced = validateAndTransformLaunchAnnounced(values[2]);
                String launchStatus = validateAndTransformLaunchStatus(values[3]);
                String bodyDimensions = validateAndTransformbodyDimensions(values[4]);
                Float bodyWeight = validateAndTransformbodyWeight(values[5]);
                String bodySim = validateAndTransformbodySim(values[6]);
                String displayType = validateAndTransformdisplayType(values[7]);
                Float displaySize = validateAndTransformdisplaySize(values[8]);
                String displayResolution = validateAndTransformdisplayResolution(values[9]);
                String featureSensors = validateAndTransformfeatureSensors(values[10]);
                String platformOS = validateAndTransformplatformOS(values[11]);
                // Continue processing other fields as necessary...
                
                // Create a new MyObject instance with the processed values
                MyObject object = new MyObject(oem, model, launchAnnounced, launchStatus, bodyDimensions, bodyWeight, bodySim, displayType,displaySize,displayResolution, featureSensors, platformOS);
                dataList.add(object);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    // Validation and transformation methods for each field
    // Example: Validate and Transform OEM
    private static String validateAndTransformOem(String oem) {
        if (oem != null && oem.matches("[a-zA-Z0-9]+")) {
            return oem;
        }
        return null;
    }
    private static String validateAndTransformModel(String model) {
        if (model != null && model.matches("[a-zA-Z0-9]+")) {
            return model;
        }
        return null;
    }
    private static Integer validateAndTransformLaunchAnnounced(String launchAnnounced) {
        // Launch announced year validation: must be 4 digits
        if (launchAnnounced != null && launchAnnounced.matches("\\d{4}")) {
            return Integer.parseInt(launchAnnounced);
        }
        return null;
    }
    private static String validateAndTransformLaunchStatus(String launchStatus) {
        // Launch status validation
        if (launchStatus != null && (launchStatus.matches("\\d{4}") || "Discontinued".equals(launchStatus) || "Cancelled".equals(launchStatus))) {
            return launchStatus;
        }
        return null;
    }
    
    private static String validateAndTransformbodyDimensions(String bodyDimensions){
        return bodyDimensions;
    }

    private static Float validateAndTransformbodyWeight(String bodyWeight){
        return Float.parseFloat(bodyWeight);
    }

    private static String validateAndTransformbodySim(String bodySim){
        return bodySim;
    }

    private static String validateAndTransformdisplayType(String displayType){
        return displayType;
    }

    private static Float validateAndTransformdisplaySize(String displaySize){
        return Float.parseFloat(displaySize);
    }

    private static String validateAndTransformdisplayResolution(String displayResolution){
        return displayResolution;
    }

    private static String validateAndTransformfeatureSensors(String featureSensors){
        return featureSensors;
    }

    private static String validateAndTransformplatformOS(String platformOS){
        return platformOS;
    }
    // Implement other validation and transformation methods similarly...

    private static void writeCleanedCsv(List<MyObject> dataList, String outputPath) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(outputPath))) {
            // Write the header
            pw.println("oem,model,launch_announced,launch_status,body_dimensions,body_weight,body_sim,display_type,display_size,display_resolution,feature_sensors,platform_os");
            
            // Write the cleaned data
            for (MyObject obj : dataList) {
                // Assuming MyObject class has a method to return a CSV-formatted string
                //pw.println(obj.toCsvString());//fix this in myobject probably
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


