package za.ac.cput.in_memory_test;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Device;
import za.ac.cput.inmemory.InMemoryDeviceRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryDeviceRepositoryTest {
    @Test
    public void testSaveAndFindById() {
        InMemoryDeviceRepository repo = new InMemoryDeviceRepository();
        Device device = new Device("D1", "FitBit");
        repo.save(device);

        Optional<Device> found = repo.findById("D1");
        assertTrue(found.isPresent());
        assertEquals("FitBit", found.get().getId());
    }

    @Test
    public void testFindAll() {
        InMemoryDeviceRepository repo = new InMemoryDeviceRepository();
        repo.save(new Device("D1", "FitBit"));
        repo.save(new Device("D2", "Apple Watch"));

        List<Device> devices = repo.findAll();
        assertEquals(2, devices.size());
    }

    @Test
    public void testDelete() {
        InMemoryDeviceRepository repo = new InMemoryDeviceRepository();
        repo.save(new Device("D1", "FitBit"));

        repo.delete("D1");
        assertFalse(repo.findById("D1").isPresent());
    }
}
