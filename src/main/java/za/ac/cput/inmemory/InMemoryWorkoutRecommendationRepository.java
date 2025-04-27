package za.ac.cput.inmemory;

import za.ac.cput.domain.WorkoutRecommendation;
import za.ac.cput.repositories.WorkoutRecommendationRepository;

import java.util.*;

public class InMemoryWorkoutRecommendationRepository implements WorkoutRecommendationRepository {
    private final Map<String, WorkoutRecommendation> storage = new HashMap<>();

    @Override
    public void save(WorkoutRecommendation entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<WorkoutRecommendation> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<WorkoutRecommendation> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
