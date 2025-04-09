package classes;

//builder declares product construction steps that are common to all types of builders
//https://en.wikipedia.org/wiki/Curiously_recurring_template_pattern
public abstract class BuildingBuilder<T extends BuildingBuilder<T>> {
    Building building;

    protected BuildingBuilder(Building building) {
        this.building = building;
    }

    public T setName(String name) {
        building.name = name;
        return self();
    }

    public T setYear(int year) {
        building.year = year;
        return self();
    }

    public T setFloors(int floors) {
        building.floors = floors;
        return self();
    }

    abstract Building build();
    protected abstract T self();
}
