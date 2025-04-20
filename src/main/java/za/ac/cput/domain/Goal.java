package za.ac.cput.domain;

import java.util.Date;

public class Goal {
    private String goalId;
    private double target;
    private Date deadline;
    private double progress;

    public Goal(String goalId, double target, Date deadline){
        this.goalId = goalId;
        this.target = target;
        this.deadline = deadline;
        this.progress = 0.0;
    }
    public void calculateProgress(double value){
        this.progress += value;
    }
    public void notifyAchievement(){
        if (progress >= target){
            System.out.println("Goal Achieved!");
        }
    }
}
