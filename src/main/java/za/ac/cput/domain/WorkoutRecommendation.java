package za.ac.cput.domain;

public class WorkoutRecommendation implements Cloneable {
    private String recommendationId;
    private String workoutType;
    private String intensity;

    public WorkoutRecommendation(String id, String type, String intensity){
        this.recommendationId = id;
        this.workoutType = type;
        this.intensity = intensity;
    }
    public void generateRecommendation(){
        System.out.println("Generated " + intensity + "workout of type: " + workoutType);
    }
    public void adjustIntensity(String newIntensity){
        this.intensity = newIntensity;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getId() {
        return recommendationId;
    }
}
