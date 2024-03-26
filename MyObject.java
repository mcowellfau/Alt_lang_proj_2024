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

    // Constructor
    //All column attributes
    public MyObject(String oem, String model, String launch_announced, String launch_status,          String body_dimensions, String body_weight, String body_sim, String display_type, String        display_size, String display_resolution, String features_sensors, String platform_os) {
        this.oem = oem;
        this.model = model;
        // Initialize other fields
    }

    // Getters
    public String getOem() {
        return oem;
    }

    public String getModel() {
        return model;
    }

    public String getAnnounced() {
        return launch_announced;
    }
    
    public String getStatus() {
        return launch_status;
    }

    public String getDimensions() {
        return body_dimensions;
    }

    public String getWeight() {
        return body_weight;
    }

    public String getSim() {
        return body_sim;
    }

   public String getDisplayType() {
        return display_type;
    }

  public String getDisplaySize() {
      return display_size;
  }

  public String DisplayRes() {
      return display_resolution;
  }

  public String getFeature() {
      return feature_sensors;
  }

  public String getPlatform() {
      return platform_os;
  }

    //Setters
    public void setOem(String oem) {
        this.oem = oem;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
