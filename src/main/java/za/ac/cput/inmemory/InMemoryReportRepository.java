package za.ac.cput.inmemory;

import za.ac.cput.domain.Report;
import za.ac.cput.repositories.ReportRepository;

import java.util.*;

public class InMemoryReportRepository implements ReportRepository {
    private final Map<String, Report> storage = new HashMap<>();

    @Override
    public void save(Report entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<Report> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Report> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
