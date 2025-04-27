package za.ac.cput.database;

import za.ac.cput.domain.Report;
import za.ac.cput.repositories.ReportRepository;

import java.util.*;

public class DatabaseReportRepository implements ReportRepository {
    @Override
    public void save(Report entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<Report> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<Report> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
