package za.ac.cput.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.FitnessData;
import za.ac.cput.services.FitnessDataService;

import java.util.List;

@RestController
@RequestMapping("/api/fitness")
public class FitnessDataController {

    private final FitnessDataService fitnessService;

    @Autowired
    public FitnessDataController(FitnessDataService service) {
        this.fitnessService = service;
    }

    @PostMapping
    public FitnessData logData(@RequestBody FitnessData data) {
        return fitnessService.logData(data);
    }

    @GetMapping
    public List<FitnessData> getAllData() {
        return fitnessService.getAllData();
    }

    @GetMapping("/{id}")
    public FitnessData getData(@PathVariable String id) {
        return fitnessService.getData(id).orElseThrow(() -> new RuntimeException("Data not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable String id) {
        fitnessService.deleteData(id);
    }
}

