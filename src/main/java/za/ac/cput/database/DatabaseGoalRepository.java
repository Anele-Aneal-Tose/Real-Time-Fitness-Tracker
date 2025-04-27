package za.ac.cput.database;

import za.ac.cput.domain.Goal;
import za.ac.cput.repositories.GoalRepository;

import java.util.*;

public class DatabaseGoalRepository implements GoalRepository {
    @Override
    public void save(Goal entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<Goal> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<Goal> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
