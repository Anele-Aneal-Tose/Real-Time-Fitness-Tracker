package za.ac.cput.inmemory;

import za.ac.cput.domain.FitnessData;
import za.ac.cput.repositories.FitnessDataRepository;

import java.util.*;

public class InMemoryFitnessDataRepository implements FitnessDataRepository {
    private final Map<String, FitnessData> storage = new HashMap<>();

    @Override
    public void save(FitnessData entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<FitnessData> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<FitnessData> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
