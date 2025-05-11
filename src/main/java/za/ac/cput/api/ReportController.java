package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Report;
import za.ac.cput.services.ReportService;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        return reportService.createReport(report);
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    @GetMapping("/{id}")
    public Report getReport(@PathVariable String id) {
        return reportService.getReport(id).orElseThrow(() -> new RuntimeException("Report not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable String id) {
        reportService.deleteReport(id);
    }
}
