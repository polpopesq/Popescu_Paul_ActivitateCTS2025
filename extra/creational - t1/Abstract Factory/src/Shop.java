import classes.factories.FurnitureFactory;
import classes.objectInterfaces.Chair;
import classes.objectInterfaces.Sofa;
import classes.objectInterfaces.Table;

public class Shop {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Shop(FurnitureFactory factory) {
        this.chair = factory.createChair();
        this.sofa = factory.createSofa();
        this.table = factory.createTable();
    }

    public void displayFurniture() {
        chair.sitOn();
        sofa.doubleSitOn();
        table.putOn();
    }
}
