package clase;

public class OperatorCallCenter extends Handler {
    @Override
    public void handle(TipReclamatie tipReclamatie) {
        if(tipReclamatie == TipReclamatie.MINORA) {
            System.out.println("Rezolvat de operator call center");
        } else {
            super.getNextHandler().handle(tipReclamatie);
        }
    }
}
