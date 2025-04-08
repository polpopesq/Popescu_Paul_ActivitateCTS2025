package classes;

//builder declares product construction steps that are common to all types of builders
public abstract class BuildingBuilder<T extends BuildingBuilder<T>> {
    Building building;

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
