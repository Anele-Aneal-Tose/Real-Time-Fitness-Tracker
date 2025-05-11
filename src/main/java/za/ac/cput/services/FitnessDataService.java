package za.ac.cput.services;

import za.ac.cput.domain.FitnessData;
import za.ac.cput.repositories.FitnessDataRepository;

import java.util.List;
import java.util.Optional;

public class FitnessDataService {

    private final FitnessDataRepository fitnessRepo;

    public FitnessDataService(FitnessDataRepository fitnessRepo) {
        this.fitnessRepo = fitnessRepo;
    }

    public FitnessData logData(FitnessData data) {
        return fitnessRepo.save(data);
    }

    public Optional<FitnessData> getData(String id) {
        return fitnessRepo.findById(id);
    }

    public List<FitnessData> getAllData() {
        return fitnessRepo.findAll();
    }

    public void deleteData(String id) {
        fitnessRepo.delete(id);
    }
}

