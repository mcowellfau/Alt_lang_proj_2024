public class MyObject {
    private String oem;
    private String model;
    // Add other fields as needed

    // Constructor
    //All column attributes
    public MyObject(String oem, String model) {
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
