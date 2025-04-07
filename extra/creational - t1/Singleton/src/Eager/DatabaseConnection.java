package Eager;

public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        return instance;
    }
}
