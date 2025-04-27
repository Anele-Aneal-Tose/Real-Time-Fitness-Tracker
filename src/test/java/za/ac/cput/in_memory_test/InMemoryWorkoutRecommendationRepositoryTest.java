//package za.ac.cput.in_memory_test;
//
//import org.junit.jupiter.api.Test;
//import za.ac.cput.domain.WorkoutRecommendation;
//import za.ac.cput.inmemory.InMemoryWorkoutRecommendationRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class InMemoryWorkoutRecommendationRepositoryTest {
//    @Test
//    public void testSaveAndFindById() {
//        InMemoryWorkoutRecommendationRepository repo = new InMemoryWorkoutRecommendationRepository();
//        WorkoutRecommendation recommendation = new WorkoutRecommendation("W1", "Morning Yoga");
//        repo.save(recommendation);
//
//        Optional<WorkoutRecommendation> found = repo.findById("W1");
//        assertTrue(found.isPresent());
//        assertEquals("Morning Yoga", found.get().getId());
//    }
//
//    @Test
//    public void testFindAll() {
//        InMemoryWorkoutRecommendationRepository repo = new InMemoryWorkoutRecommendationRepository();
//        repo.save(new WorkoutRecommendation("W1", "Morning Yoga"));
//        repo.save(new WorkoutRecommendation("W2", "Evening Run"));
//
//        List<WorkoutRecommendation> recommendations = repo.findAll();
//        assertEquals(2, recommendations.size());
//    }
//
//    @Test
//    public void testDelete() {
//        InMemoryWorkoutRecommendationRepository repo = new InMemoryWorkoutRecommendationRepository();
//        repo.save(new WorkoutRecommendation("W1", "Morning Yoga"));
//
//        repo.delete("W1");
//        assertFalse(repo.findById("W1").isPresent());
//    }
//}
