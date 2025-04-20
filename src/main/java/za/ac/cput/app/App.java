package za.ac.cput.app;

import za.ac.cput.creational_patterns.abstract_factory.Button;
import za.ac.cput.creational_patterns.abstract_factory.LightUIFactory;
import za.ac.cput.creational_patterns.abstract_factory.Theme;
import za.ac.cput.creational_patterns.abstract_factory.UIFactory;
import za.ac.cput.creational_patterns.builder.GoalBuilder;
import za.ac.cput.creational_patterns.factory_method.ReportGenerator;
import za.ac.cput.creational_patterns.factory_method.WeeklyReportGenerator;
import za.ac.cput.creational_patterns.simple_factory.FitnessDataFactory;
import za.ac.cput.creational_patterns.simple_factory.FitnessDataType;
import za.ac.cput.creational_patterns.singleton.DatabaseConnection;
import za.ac.cput.domain.*;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // ===== SIMPLE FACTORY USAGE =====
        Device wearable = new Device("dev01", "wearable");
        FitnessData stepsData = FitnessDataFactory.createFitnessData(FitnessDataType.STEPS, 6500, wearable);
        stepsData.track();
        stepsData.updateDashboard();

        // ===== BUILDER USAGE =====
        Goal goal = new GoalBuilder()
                .setGoalId("goal01")
                .setTarget(10000)
                .setDeadline(new Date())
                .setProgress(0)
                .build();
        goal.calculateProgress(4000);
        goal.notifyAchievement();

        // ===== PROTOTYPE USAGE =====
        try {
            WorkoutRecommendation original = new WorkoutRecommendation("rec1", "cardio", "medium");
            WorkoutRecommendation copy = (WorkoutRecommendation) original.clone();
            original.generateRecommendation();
            copy.adjustIntensity("high");
            copy.generateRecommendation();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // ===== FACTORY METHOD USAGE =====
        User user = new User("user1", "user@example.com", "password", "FitnessEnthusiast");
        ReportGenerator weeklyGen = new WeeklyReportGenerator();
        Report weeklyReport = weeklyGen.createReport(user, "weekly", "pdf");
        weeklyReport.generate();
        weeklyReport.export();

        // ===== ABSTRACT FACTORY USAGE =====
        UIFactory lightFactory = new LightUIFactory();
        Button lightButton = lightFactory.createButton();
        Theme lightTheme = lightFactory.createTheme();
        lightButton.render();
        lightTheme.apply();

        // ===== SINGLETON USAGE =====
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM fitness_data");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM goals");
        System.out.println("Same instance: " + (db1 == db2));
    }
}
