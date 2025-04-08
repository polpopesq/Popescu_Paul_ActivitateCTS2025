package classes.factories;

import classes.objectInterfaces.Chair;
import classes.objectInterfaces.Sofa;
import classes.objectInterfaces.Table;
import classes.objects.Chair.ArtDecoChair;
import classes.objects.Sofa.ArtDecoSofa;
import classes.objects.Table.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
