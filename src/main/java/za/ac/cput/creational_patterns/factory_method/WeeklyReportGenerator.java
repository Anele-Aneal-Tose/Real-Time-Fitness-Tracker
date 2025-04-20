package za.ac.cput.creational_patterns.factory_method;

import za.ac.cput.domain.Report;
import za.ac.cput.domain.User;

import java.util.UUID;

public class WeeklyReportGenerator implements ReportGenerator {
    public Report createReport(User user, String period, String format){
        return new Report(UUID.randomUUID().toString(), "weekly", format, user);
    }
}
class MonthlyReportGenerator implements ReportGenerator {
    public Report createReport(User user, String period, String format){
        return new Report(UUID.randomUUID().toString(), "monthly", format, user);
    }
}
