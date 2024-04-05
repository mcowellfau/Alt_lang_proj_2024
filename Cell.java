public class Cell {
    private String oem;
    private String model;
    private Integer launchAnnounced;
    private String launchStatus;
    private String bodyDimensions;
    private Float bodyWeight;
    private String bodySim;
    private String displayType;
    private Float displaySize;
    private String displayResolution;
    private String featureSensors;
    private String platformOs;
    // Constructor
    public Cell(String oem, String model, Integer launchAnnounced, String launchStatus, String bodyDimensions, Float bodyWeight, String bodySim, String displayType, Float displaySize, String displayResolution, String featureSensors, String platformOs) {
        this.oem = oem;
        this.model = model;
        this.launchAnnounced = launchAnnounced;
        this.launchStatus = launchStatus;
        this.bodyDimensions = bodyDimensions;
        this.bodyWeight = bodyWeight;
        this.bodySim = bodySim;
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.featureSensors = featureSensors;
        this.platformOs = platformOs;
    }
    //Getter Setter combination for attributes
    public String getOem() {
        return oem;
    }public void setOem(String oem) {
        this.oem = oem;
    }
    
    public String getModel() {
        return model;
    }public void setModel(String model) {
        this.model = model;
    }

    public Integer getLaunchAnnounced() {
        return launchAnnounced;
    }public void setAnnounced(Integer launchAnnounced) {
        this.launchAnnounced = launchAnnounced;
    }
    
    public String getStatus() {
        return launchStatus;
    }public void setStatusl(String launchStatus) {
        this.launchStatus = launchStatus;
    }

    public String getBodyDimensions() {
        return bodyDimensions;
    } public void setDimensions(String bodyDimensions) {
        this.bodyDimensions = bodyDimensions;
    }

    public Float getWeight() {
        return bodyWeight;
    }public void setWeight(Float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getSim() {
        return bodySim;
    } public void setSim(String bodySim) {
        this.bodySim = bodySim;
    }

    public String getDisplayType() {
        return displayType;
    }public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Float getDisplaySize() {
        return displaySize;
    }public void setDisplaySize(Float displaySize) {
        this.displaySize = displaySize;
    }
  
    public String getDisplayResolution() {
        return displayResolution;
    }public void setDisplayRes(String displayResolution) {
        this.displayResolution = displayResolution;
    }
  
    public String getFeature() {
        return featureSensors;
    } public void setFeature(String featureSensors) {
        this.featureSensors = featureSensors;
    }
  
    public String getPlatform() {
        return platformOs;
    }public void setPlatform(String platformOs) {
        this.platformOs = platformOs;
    }   
}
