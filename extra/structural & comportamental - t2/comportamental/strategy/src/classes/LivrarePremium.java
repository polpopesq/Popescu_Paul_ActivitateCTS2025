package classes;

public class LivrarePremium implements Livrare{
    int cost = 40;
    @Override
    public void livreaza() {
        System.out.println("Livram premium");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
