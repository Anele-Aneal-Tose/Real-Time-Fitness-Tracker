package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.WorkoutRecommendation;
import za.ac.cput.services.WorkoutRecommendationService;

import java.util.List;

@RestController
@RequestMapping("/api/recommendations")
public class WorkoutRecommendationController {
    private final WorkoutRecommendationService recommendationService;

    @Autowired
    public WorkoutRecommendationController(WorkoutRecommendationService service) {
        this.recommendationService = service;
    }

    @PostMapping
    public WorkoutRecommendation generate(@RequestBody WorkoutRecommendation rec) {
        return recommendationService.generateRecommendation(rec);
    }

    @GetMapping
    public List<WorkoutRecommendation> getAll() {
        return recommendationService.getAllRecommendations();
    }

    @GetMapping("/{id}")
    public WorkoutRecommendation getById(@PathVariable String id) {
        return recommendationService.getRecommendation(id)
                .orElseThrow(() -> new RuntimeException("Recommendation not found"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        recommendationService.deleteRecommendation(id);
    }
}
