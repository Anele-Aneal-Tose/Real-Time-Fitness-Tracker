package za.ac.cput.creational_patterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection(){
        System.out.println("DatabaseConnection initialized");
    }
    public static synchronized DatabaseConnection getInstance(){
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void query(String sql){
        System.out.println("Executing query: " + sql);
    }
}
