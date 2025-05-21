package classes;

public class Client {
    private String name;
    private Livrare tipLivrare;
    private double costComanda;

    public Client(String name, Livrare tipLivrare, double costComanda) {
        this.name = name;
        this.tipLivrare = tipLivrare;
        this.costComanda = costComanda;
    }

    public void setTipLivrare(Livrare tipLivrare) {
        this.tipLivrare = tipLivrare;
    }

    public double getCostTotal() {
        return costComanda + tipLivrare.getCost();
    }
}
