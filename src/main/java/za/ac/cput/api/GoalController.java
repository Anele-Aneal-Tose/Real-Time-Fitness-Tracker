package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Goal;
import za.ac.cput.services.GoalService;

import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {
    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @PostMapping
    public ResponseEntity<Goal> createGoal(@RequestBody Goal goal) {
        return ResponseEntity.ok(goalService.createGoal(goal));
    }

    @GetMapping("/user/{userId}")
    public List<Goal> getGoalsByUser(@PathVariable String userId) {
        return goalService.getGoalsByUserId(userId);
    }

    @PutMapping("/{id}")
    public Goal updateGoal(@PathVariable String id, @RequestBody Goal goal) {
        return goalService.updateGoal(id, goal);
    }
}

