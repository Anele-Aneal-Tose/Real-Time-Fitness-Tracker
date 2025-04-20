package za.ac.cput.creational_patterns.factory_method;

import za.ac.cput.domain.Report;
import za.ac.cput.domain.User;

public interface ReportGenerator {
    Report createReport(User user, String period, String format);
}
