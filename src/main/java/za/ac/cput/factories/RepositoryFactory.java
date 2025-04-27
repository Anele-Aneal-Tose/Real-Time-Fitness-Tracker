package za.ac.cput.factories;

import za.ac.cput.database.*;
import za.ac.cput.inmemory.*;
import za.ac.cput.repositories.*;

//StorageType is an enum (MEMORY or DATABASE) to make the choice strongly typed and safer.
//Default is set to MEMORY so when you run the app now, it uses the InMemory repositories.
//If you later want to switch to database, you simply call:
//RepositoryFactory.setStorageType(RepositoryFactory.StorageType.DATABASE);

/**
 * Example Usage:
 * UserRepository userRepo = RepositoryFactory.getUserRepository();
 * userRepo.save(new User("user1", "John Doe", "john@example.com"));
 */

public class RepositoryFactory {

    public enum StorageType {
        MEMORY,
        DATABASE
    }

    private static StorageType storageType = StorageType.MEMORY; // Default to MEMORY

    public static void setStorageType(StorageType type) {
        storageType = type;
    }

    public static UserRepository getUserRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryUserRepository();
            case DATABASE: return new DatabaseUserRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }

    public static DeviceRepository getDeviceRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryDeviceRepository();
            case DATABASE: return new DatabaseDeviceRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }

    public static FitnessDataRepository getFitnessDataRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryFitnessDataRepository();
            case DATABASE: return new DatabaseFitnessDataRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }

    public static GoalRepository getGoalRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryGoalRepository();
            case DATABASE: return new DatabaseGoalRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }

    public static ReportRepository getReportRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryReportRepository();
            case DATABASE: return new DatabaseReportRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }

    public static WorkoutRecommendationRepository getWorkoutRecommendationRepository() {
        switch (storageType) {
            case MEMORY: return new InMemoryWorkoutRecommendationRepository();
            case DATABASE: return new DatabaseWorkoutRecommendationRepository();
            default: throw new IllegalArgumentException("Unsupported storage type: " + storageType);
        }
    }
}
