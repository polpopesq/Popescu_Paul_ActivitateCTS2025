package classes;

public abstract class Building {
    int floors;
    int year;
    String name;

    Building(int floors, int year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }
    Building() {}
}
