package za.ac.cput.database;

import za.ac.cput.domain.FitnessData;
import za.ac.cput.repositories.FitnessDataRepository;

import java.util.*;

public class DatabaseFitnessDataRepository implements FitnessDataRepository {
    @Override
    public void save(FitnessData entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<FitnessData> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<FitnessData> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
