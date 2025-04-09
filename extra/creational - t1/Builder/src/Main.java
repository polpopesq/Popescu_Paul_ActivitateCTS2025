import classes.AppartmentBlock;
import classes.AppartmentBlockBuilder;
import classes.Building;

public class Main {
    public static void main(String[] args) {
        Building appartmentBlock =  new AppartmentBlockBuilder()
                .setName("Florica Tower")
                .setFloors(20)
                .setHabitants(60)
                .setYear(2012)
                .build();
        System.out.println(appartmentBlock);
    }
}