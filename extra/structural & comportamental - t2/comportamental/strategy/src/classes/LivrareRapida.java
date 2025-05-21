package classes;

public class LivrareRapida implements Livrare{
    int cost = 25;
    @Override
    public void livreaza() {
        System.out.println("Livram rapid");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
