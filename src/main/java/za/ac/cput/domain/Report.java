package za.ac.cput.domain;

public class Report {
    private String reportId;
    private String period;
    private String format;
    private User owner;

    public Report(String reportId, String period, String format, User owner){
        this.reportId = reportId;
        this.period = period;
        this.format = format;
        this.owner = owner;
    }
    public void generate(){
        System.out.println("Report generated for period: " + period);
    }
    public void export(){
        System.out.println("Exporting report in format: " + format);
    }
    public String getPeriod() {
        return period;
    }

    public String getFormat() {
        return format;
    }

    public String getId() {
        return reportId;
    }
}
