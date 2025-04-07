package Lazy;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private DatabaseConnection() {}

    public static synchronized DatabaseConnection getInstance() {//thread safe
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
