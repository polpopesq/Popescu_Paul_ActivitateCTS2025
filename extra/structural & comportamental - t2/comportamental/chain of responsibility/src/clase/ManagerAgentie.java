package clase;

public class ManagerAgentie extends Handler {
    @Override
    public void handle(TipReclamatie tipReclamatie) {
        if(tipReclamatie == TipReclamatie.GRAVA) {
            System.out.println("Rezolvat de Manager agentie");
        } else {
            super.getNextHandler().handle(tipReclamatie);
        }
    }
}
