package classes.factories;

import classes.objectInterfaces.Chair;
import classes.objectInterfaces.Sofa;
import classes.objectInterfaces.Table;
import classes.objects.Chair.ModernChair;
import classes.objects.Sofa.ModernSofa;
import classes.objects.Table.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
