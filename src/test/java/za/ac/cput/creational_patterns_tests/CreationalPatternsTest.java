package za.ac.cput.creational_patterns_tests;

// Unit Tests for Creational Patterns
import org.junit.jupiter.api.*;
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

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class CreationalPatternsTest {
    // SIMPLE FACTORY TEST
    @Test
    public void testSimpleFactoryCreatesStepsData() {
        Device device = new Device("d1", "wearable");
        FitnessData data = FitnessDataFactory.createFitnessData(FitnessDataType.STEPS, 5000, device);

        assertNotNull(data);
        assertEquals("steps", data.getType());
        assertEquals(5000, data.getValue());
    }
    // ===== FACTORY METHOD TEST =====
    @Test
    public void testWeeklyReportFactoryMethod() {
        User user = new User("u1", "test@mail.com", "1234", "FitnessEnthusiast");
        ReportGenerator generator = new WeeklyReportGenerator();
        Report report = generator.createReport(user, "weekly", "pdf");

        assertNotNull(report);
        assertEquals("weekly", report.getPeriod());
        assertEquals("pdf", report.getFormat());
    }
    // ===== ABSTRACT FACTORY TEST =====
    @Test
    public void testAbstractFactoryCreatesLightUIComponents() {
        UIFactory factory = new LightUIFactory();
        Button button = factory.createButton();
        Theme theme = factory.createTheme();

        assertNotNull(button);
        assertNotNull(theme);
    }
    // ===== BUILDER TEST =====
    @Test
    public void testGoalBuilderCreatesGoal() {
        Date deadline = new Date();
        Goal goal = new GoalBuilder()
                .setGoalId("g1")
                .setTarget(10000)
                .setDeadline(deadline)
                .setProgress(0)
                .build();

        assertNotNull(goal);
    }
    // ===== PROTOTYPE TEST =====
    @Test
    public void testWorkoutRecommendationClone() throws CloneNotSupportedException {
        WorkoutRecommendation original = new WorkoutRecommendation("rec1", "cardio", "medium");
        WorkoutRecommendation clone = (WorkoutRecommendation) original.clone();

        assertNotNull(clone);
        assertNotSame(original, clone);
    }
    // ===== SINGLETON TEST =====
    @Test
    public void testSingletonReturnsSameInstance() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();

        assertNotNull(conn1);
        assertSame(conn1, conn2);
    }
    // ===== USER CLASS TEST =====
    @Test
    public void testUserDeviceConnectionLimit() {
        User user = new User("u2", "x@x.com", "pass", "FitnessEnthusiast");
        user.connectDevice(new Device("d1", "wearable"));
        user.connectDevice(new Device("d2", "wearable"));
        user.connectDevice(new Device("d3", "wearable"));

        // Should not exceed 3 devices
        user.connectDevice(new Device("d4", "wearable"));

        assertEquals(3, user.getConnectedDevices().size());
    }
    // ===== GOAL RULE TEST =====
    @Test
    public void testUserGoalLimit() {
        User user = new User("u3", "y@y.com", "pass", "FitnessEnthusiast");
        for (int i = 0; i < 7; i++) {
            Goal goal = new Goal("g" + i, 1000, new Date());
            user.setGoal(goal);
        }
        assertEquals(5, user.getGoals().size());
    }
}
