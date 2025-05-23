package classes;

public class CastleBuilder extends BuildingBuilder<CastleBuilder> {
    private Castle castle = new Castle();

    public CastleBuilder() {
        super(new Castle());
        this.castle = (Castle) super.building;
    }

    public CastleBuilder setValue(int value) {
        castle.value = value;
        return this;
    }

    @Override
    public Building build() {
        return castle;
    }

    @Override
    public CastleBuilder self() {
        return this;
    }
}
