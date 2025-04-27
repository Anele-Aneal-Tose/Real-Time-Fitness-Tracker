package za.ac.cput.inmemory;

import za.ac.cput.domain.Device;
import za.ac.cput.repositories.DeviceRepository;

import java.util.*;

public class InMemoryDeviceRepository implements DeviceRepository {
    private final Map<String, Device> storage = new HashMap<>();

    @Override
    public void save(Device entity) {
        storage.put(entity.getId(), entity);
    }

    @Override
    public Optional<Device> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Device> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
