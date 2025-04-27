package za.ac.cput.inmemory;

import za.ac.cput.domain.Goal;
import za.ac.cput.repositories.GoalRepository;

import java.util.*;

public class InMemoryGoalRepository implements GoalRepository {
    private final Map<String, Goal> storage = new HashMap<>();

    @Override
    public void save(Goal entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<Goal> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Goal> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
