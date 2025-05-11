package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Device;
import za.ac.cput.services.DeviceService;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {
    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService service) {
        this.deviceService = service;
    }

    @PostMapping
    public Device registerDevice(@RequestBody Device device) {
        return deviceService.registerDevice(device);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAllDevices();
    }

    @GetMapping("/{id}")
    public Device getDevice(@PathVariable String id) {
        return deviceService.getDevice(id).orElseThrow(() -> new RuntimeException("Device not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteDevice(@PathVariable String id) {
        deviceService.deleteDevice(id);
    }
}
