package za.ac.cput.services;

import za.ac.cput.domain.Goal;
import za.ac.cput.repositories.GoalRepository;

import java.util.List;

public class GoalService {
    private final GoalRepository goalRepo;

    public GoalService(GoalRepository goalRepo) {
        this.goalRepo = goalRepo;
    }

    public Goal createGoal(Goal goal) {
        return goalRepo.save(goal);
    }

    public List<Goal> getGoalsByUserId(String userId) {
        return goalRepo.findByUserId(userId);
    }

    public Goal updateGoal(String id, Goal goal) {
        goal.setId(id);
        return goalRepo.save(goal);
    }
}

