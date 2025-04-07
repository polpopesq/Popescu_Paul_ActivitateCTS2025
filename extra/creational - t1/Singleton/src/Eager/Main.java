package Eager;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection dc = DatabaseConnection.getInstance();
        DatabaseConnection dc2 = DatabaseConnection.getInstance();
        System.out.println(dc.hashCode());
        System.out.println(dc2.hashCode());
    }
}
