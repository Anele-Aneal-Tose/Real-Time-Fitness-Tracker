package za.ac.cput.domain;

public class Device {
    private String deviceId;
    private String type;
    private boolean connectionStatus;

    public Device(String deviceId, String type){
        this.deviceId = deviceId;
        this.type = type;
        this.connectionStatus = false;
    }
    public void connect(){
        this.connectionStatus = true;
        System.out.println("Device connected");
    }
    public void syncData(){
        System.out.println("Syncing data from device");
    }
}
