package classes;

public class AppartmentBlock extends Building {
    int habitants;

    AppartmentBlock() {}

    AppartmentBlock(int floors, int year, String name, int habitants) {
        super(floors, year, name);
        this.habitants = habitants;
    }
}
