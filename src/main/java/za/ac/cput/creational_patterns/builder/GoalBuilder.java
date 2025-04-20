package za.ac.cput.creational_patterns.builder;

import za.ac.cput.domain.Goal;

import java.util.Date;

public class GoalBuilder {
    private String goalId;
    private double target;
    private Date deadline;
    private double progress;

    public GoalBuilder setGoalId(String id) {
        this.goalId = id;
        return this;
    }
    public GoalBuilder setTarget(double target) {
        this.target = target;
        return this;
    }
    public GoalBuilder setDeadline(Date deadline) {
        this.deadline = deadline;
        return this;
    }
    public GoalBuilder setProgress(double progress) {
        this.progress = progress;
        return this;
    }
    public Goal build() {
        Goal goal = new Goal(goalId, target, deadline);
        return goal;
    }
}
