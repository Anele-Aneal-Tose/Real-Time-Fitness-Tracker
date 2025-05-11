package za.ac.cput.services;

import za.ac.cput.domain.Report;
import za.ac.cput.repositories.ReportRepository;

import java.util.List;
import java.util.Optional;

public class ReportService {
    private final ReportRepository reportRepo;

    public ReportService(ReportRepository reportRepo) {
        this.reportRepo = reportRepo;
    }

    public Report createReport(Report report) {
        return reportRepo.save(report);
    }

    public Optional<Report> getReport(String id) {
        return reportRepo.findById(id);
    }

    public List<Report> getAllReports() {
        return reportRepo.findAll();
    }

    public void deleteReport(String id) {
        reportRepo.delete(id);
    }
}
