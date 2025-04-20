package za.ac.cput.creational_patterns.simple_factory;

import za.ac.cput.domain.Device;
import za.ac.cput.domain.FitnessData;

import java.util.Date;
import java.util.UUID;

public class FitnessDataFactory {
    public static FitnessData createFitnessData(FitnessDataType type, double value, Device device){
        String id = UUID.randomUUID().toString();
        Date now = new Date();

        switch (type){
            case STEPS:
                return new FitnessData(id, "steps", value, now, device);
            case CALORIES:
                return new FitnessData(id, "calories", value, now, device);
            case HEART_RATE:
                return new FitnessData(id, "heart_rate", value, now, device);
            default:
                throw new IllegalArgumentException("Unsupported fitness data type: " + type);
        }
    }
}
