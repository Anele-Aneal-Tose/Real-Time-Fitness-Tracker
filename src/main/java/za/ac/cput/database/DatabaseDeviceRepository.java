package za.ac.cput.database;

import za.ac.cput.domain.Device;
import za.ac.cput.repositories.DeviceRepository;

import java.util.*;

public class DatabaseDeviceRepository implements DeviceRepository {
    @Override
    public void save(Device entity) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public Optional<Device> findById(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public List<Device> findAll() {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not yet implemented.");
    }
}
