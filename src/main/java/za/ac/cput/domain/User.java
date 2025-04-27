package za.ac.cput.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String email;
    private String password;
    private String role;
    private List<Device> connectedDevices = new ArrayList<>();
    private List<Goal> goals = new ArrayList<>();
    private List<FitnessData> fitnessData = new ArrayList<>();
    private List<Report> reports = new ArrayList<>();

    public User(String userId, String email, String password, String role){
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public  void login(){
        System.out.println("Logging in via OAuth 2.0 and MFA");
    }
    public void setGoal(Goal goal){
        if (goals.size() < 5) goals.add(goal);
    }
    public void connectDevice(Device device){
        if (connectedDevices.size() < 3) connectedDevices.add(device);
    }
    public void requestReport(String period, String format){
        Report report = new Report(UUID.randomUUID().toString(), period, format, this);
        report.generate();
        reports.add(report);
    }
    public List<Device> getConnectedDevices(){
        return connectedDevices;
    }
    public List<FitnessData> getFitnessData(){
        return fitnessData;
    }
    public List<Goal> getGoals() {
        return goals;
    }

    public String getId() {
        return userId;
    }

//    public String getName() {
//        return name;
//    }
}

class Trainer extends User {
    private List<User> clients = new ArrayList<>();
    public Trainer(String userId, String email, String password){
        super(userId, email, password, "Trainer");
    }
    public void viewClientData(User client){
        //Placeholder for consent check
        System.out.println("Viewing fitness data of client: " + client);
    }
    public void requestConsent(User client){
        System.out.println("Requesting consent from client");
    }
}
