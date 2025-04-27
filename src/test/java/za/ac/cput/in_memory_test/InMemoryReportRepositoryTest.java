//import org.junit.jupiter.api.Test;
//import za.ac.cput.domain.Report;
//import za.ac.cput.domain.User;
//import za.ac.cput.inmemory.InMemoryReportRepository;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class InMemoryReportRepositoryTest {
//
//    @Test
//    public void testSaveAndFindById() {
//        // Create a User object
//        User user = new User("U1", "John Doe", new User());
//
//        // Create Report with correct parameters
//        InMemoryReportRepository repo = new InMemoryReportRepository();
//        Report report = new Report("R1", "Weekly Summary", "PDF", user);
//
//        // Save the report to the repository
//        repo.save(report);
//
//        // Find the report by ID
//        Optional<Report> found = repo.findById("R1");
//
//        // Assert that the report is found and its ID matches
//        assertTrue(found.isPresent());
//        assertEquals("R1", found.get().getId());
//    }
//
//    @Test
//    public void testFindAll() {
//        // Create a User object
//        User user = new User("U1", "John Doe");
//
//        // Create the repository and save reports
//        InMemoryReportRepository repo = new InMemoryReportRepository();
//        repo.save(new Report("R1", "Weekly Summary", "PDF", user));
//        repo.save(new Report("R2", "Monthly Summary", "Excel", user));
//
//        // Retrieve all reports and assert they are correctly saved
//        assertEquals(2, repo.findAll().size());
//    }
//}
