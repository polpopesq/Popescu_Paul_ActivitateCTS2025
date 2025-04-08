import classes.factories.FurnitureFactory;
import classes.factories.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Shop modernFurnitureShop = new Shop(factory);

        modernFurnitureShop.displayFurniture();
        System.out.println();

        FurnitureFactory victorianFurnitureFactory = new ModernFurnitureFactory();
        Shop victorianShop = new Shop(victorianFurnitureFactory);
        victorianShop.displayFurniture();
    }
    //the point here is to show that shop does not care of the style of the furniture
    //it just knows the factory produces furniture but which style, that is specified in main
}
