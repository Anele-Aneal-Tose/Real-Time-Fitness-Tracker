package za.ac.cput.in_memory_test;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Device;
import za.ac.cput.domain.FitnessData;
import za.ac.cput.inmemory.InMemoryFitnessDataRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryFitnessDataRepositoryTest {
    @Test
    public void testSaveAndFindById() {
        InMemoryFitnessDataRepository repo = new InMemoryFitnessDataRepository();

        Device dummyDevice = new Device("D1", "FitBit"); // Create a simple Device
        FitnessData data = new FitnessData("FD1", "Steps", 10000, new Date(), dummyDevice);
        repo.save(data);

        Optional<FitnessData> found = repo.findById("FD1");
        assertTrue(found.isPresent());
        assertEquals("Steps", found.get().getType());
    }

    @Test
    public void testFindAll() {
        InMemoryFitnessDataRepository repo = new InMemoryFitnessDataRepository();

        Device dummyDevice1 = new Device("D1", "FitBit");
        Device dummyDevice2 = new Device("D2", "Apple Watch");

        repo.save(new FitnessData("FD1", "Steps", 10000, new Date(), dummyDevice1));
        repo.save(new FitnessData("FD2", "Calories", 500, new Date(), dummyDevice2));

        List<FitnessData> dataList = repo.findAll();
        assertEquals(2, dataList.size());
    }

    @Test
    public void testDelete() {
        InMemoryFitnessDataRepository repo = new InMemoryFitnessDataRepository();

        Device dummyDevice = new Device("D1", "FitBit");
        repo.save(new FitnessData("FD1", "Steps", 10000, new Date(), dummyDevice));

        repo.delete("FD1");
        assertFalse(repo.findById("FD1").isPresent());
    }
}
