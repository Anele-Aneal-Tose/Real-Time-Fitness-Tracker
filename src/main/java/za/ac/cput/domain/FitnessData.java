package za.ac.cput.domain;

import java.util.Date;

public class FitnessData {
    private String dataId;
    private String type;
    private double value;
    private Date timestamp;
    private Device sourceDevice;

    public FitnessData(String dataId, String type, double value, Date timestamp, Device sourceDevice){
        this.dataId = dataId;
        this.type = type;
        this.value = value;
        this.timestamp = timestamp;
        this.sourceDevice = sourceDevice;
    }
    public void track(){
        System.out.println("Tracking " + type + ": " + value);
    }
    public void process(){
        System.out.println("Processing fitness data");
    }
    public void updateDashboard(){
        System.out.println("Dashboard updated with new " + type);
    }
    public String getType() {
        return type;
    }

    public double getValue() {
        return value;
    }

    public String getId() {
        return dataId;
    }
}
