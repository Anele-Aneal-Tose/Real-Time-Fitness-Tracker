package za.ac.cput.in_memory_test;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Goal;
import za.ac.cput.inmemory.InMemoryGoalRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryGoalRepositoryTest {
    @Test
    public void testSaveAndFindById() {
        InMemoryGoalRepository repo = new InMemoryGoalRepository();
        Goal goal = new Goal("G1", 5.0, new Date()); // ✅ Corrected constructor
        repo.save(goal);

        Optional<Goal> found = repo.findById("G1");
        assertTrue(found.isPresent());
        assertEquals("G1", found.get().getId());
    }

    @Test
    public void testFindAll() {
        InMemoryGoalRepository repo = new InMemoryGoalRepository();
        repo.save(new Goal("G1", 5.0, new Date()));
        repo.save(new Goal("G2", 10.0, new Date()));

        List<Goal> goals = repo.findAll();
        assertEquals(2, goals.size());
    }

    @Test
    public void testDelete() {
        InMemoryGoalRepository repo = new InMemoryGoalRepository();
        repo.save(new Goal("G1", 5.0, new Date()));

        repo.delete("G1");
        assertFalse(repo.findById("G1").isPresent());
    }
}
