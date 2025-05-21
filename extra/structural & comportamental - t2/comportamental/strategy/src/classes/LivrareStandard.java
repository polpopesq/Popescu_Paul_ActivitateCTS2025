package classes;

public class LivrareStandard implements Livrare{
    int cost = 15;
    @Override
    public void livreaza() {
        System.out.println("Livram standard.");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
