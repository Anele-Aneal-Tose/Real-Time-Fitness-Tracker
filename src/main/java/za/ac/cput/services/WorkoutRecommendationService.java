package za.ac.cput.services;

import za.ac.cput.domain.WorkoutRecommendation;
import za.ac.cput.repositories.WorkoutRecommendationRepository;

import java.util.List;
import java.util.Optional;

public class WorkoutRecommendationService {
    private final WorkoutRecommendationRepository recommendationRepo;

    public WorkoutRecommendationService(WorkoutRecommendationRepository recommendationRepo) {
        this.recommendationRepo = recommendationRepo;
    }

    public WorkoutRecommendation generateRecommendation(WorkoutRecommendation rec) {
        return recommendationRepo.save(rec);
    }

    public Optional<WorkoutRecommendation> getRecommendation(String id) {
        return recommendationRepo.findById(id);
    }

    public List<WorkoutRecommendation> getAllRecommendations() {
        return recommendationRepo.findAll();
    }

    public void deleteRecommendation(String id) {
        recommendationRepo.delete(id);
    }
}
