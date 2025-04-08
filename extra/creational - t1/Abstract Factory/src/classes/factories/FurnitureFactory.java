package classes.factories;

import classes.objectInterfaces.Chair;
import classes.objectInterfaces.Sofa;
import classes.objectInterfaces.Table;

public interface FurnitureFactory {
    public Table createTable();
    public Chair createChair();
    public Sofa createSofa();
}
