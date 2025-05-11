package za.ac.cput.services;

import za.ac.cput.domain.Device;
import za.ac.cput.repositories.DeviceRepository;

import java.util.List;
import java.util.Optional;

public class DeviceService {
    private final DeviceRepository deviceRepo;

    public DeviceService(DeviceRepository deviceRepo) {
        this.deviceRepo = deviceRepo;
    }

    public Device registerDevice(Device device) {
        return deviceRepo.save(device);
    }

    public Optional<Device> getDevice(String id) {
        return deviceRepo.findById(id);
    }

    public List<Device> getAllDevices() {
        return deviceRepo.findAll();
    }

    public void deleteDevice(String id) {
        deviceRepo.delete(id);
    }
}
