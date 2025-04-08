package classes;

public class Castle extends Building {
    int value;

    Castle(int floors, int year, String name, int value) {
        super(floors, year, name);
        this.value = value;
    }
    Castle() {}
}
