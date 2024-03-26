public class MyObject {
    private String oem;
    private String model;
    private String launch_announced;
    private String launch_status;
    private String body_dimensions;
    private String body_weight;
    private String body_sim;
    private String display_type;
    private String display_size;
    private String display_resolution;
    private String feature_sensors;
    private String platform_os;
    // Add other fields as needed

    // Constructor
    //All column attributes
    public MyObject(String oem, String model, String launch_announced, String launch_status,          String body_dimensions, String body_weight, String body_sim, String display_type, String        display_size, String display_resolution, String features_sensors, String platform_os) {
        this.oem = oem;
        this.model = model;
        // Initialize other fields
    }

    // Getters and setters
    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getModel() {
        return field2;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Add getters and setters for other fields
}
