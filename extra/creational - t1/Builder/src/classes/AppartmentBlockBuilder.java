package classes;

public class AppartmentBlockBuilder extends BuildingBuilder<AppartmentBlockBuilder> {
    AppartmentBlock appartmentBlock = new AppartmentBlock();

    public AppartmentBlockBuilder() {}

    public AppartmentBlockBuilder setHabitants(int habitants) {
        appartmentBlock.habitants = habitants;
        return this;
    }
    @Override
    public Building build() {
        return appartmentBlock;
    }

    @Override
    protected AppartmentBlockBuilder self() {
        return this;
    }
}
