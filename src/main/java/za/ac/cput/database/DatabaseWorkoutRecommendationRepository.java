package za.ac.cput.database;

import za.ac.cput.domain.WorkoutRecommendation;
import za.ac.cput.repositories.WorkoutRecommendationRepository;

import java.util.*;

public class DatabaseWorkoutRecommendationRepository implements WorkoutRecommendationRepository {
    @Override
    public void save(WorkoutRecommendation entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<WorkoutRecommendation> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<WorkoutRecommendation> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
