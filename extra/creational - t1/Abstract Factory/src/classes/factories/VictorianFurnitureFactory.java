package classes.factories;

import classes.objectInterfaces.Chair;
import classes.objectInterfaces.Sofa;
import classes.objectInterfaces.Table;
import classes.objects.Chair.VictorianChair;
import classes.objects.Sofa.VictorianSofa;
import classes.objects.Table.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
