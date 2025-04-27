package za.ac.cput.in_memory_test;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;
import za.ac.cput.inmemory.InMemoryUserRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//These tests only verify the in-memory behavior.
//They will pass if your repositories are implemented correctly.
//Later, you can adapt similar tests when you implement Database repositories.

public class InMemoryUserRepositoryTest {
    @Test
    public void testSaveAndFindById() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        User user = new User("U1", "Alice", "alice@example.com", "USER");
        repo.save(user);

        Optional<User> found = repo.findById("U1");
        assertTrue(found.isPresent());
        assertEquals("U1", found.get().getId());
    }

    @Test
    public void testFindAll() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        repo.save(new User("U1", "Alice", "alice@example.com", "USER"));
        repo.save(new User("U2", "Bob", "bob@example.com", "USER"));

        List<User> users = repo.findAll();
        assertEquals(2, users.size());
    }

    @Test
    public void testDelete() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        repo.save(new User("U1", "Alice", "alice@example.com", "USER"));

        repo.delete("U1");
        assertFalse(repo.findById("U1").isPresent());
    }
}
