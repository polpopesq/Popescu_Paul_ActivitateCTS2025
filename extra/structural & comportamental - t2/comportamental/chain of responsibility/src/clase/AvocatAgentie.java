package clase;

public class AvocatAgentie extends Handler {
    @Override
    public void handle(TipReclamatie tipReclamatie) {
        if(tipReclamatie == TipReclamatie.LEGALA || tipReclamatie == TipReclamatie.DESPAGUBIRE) {
            System.out.println("Rezolvat de avocat");
        } else {
            System.out.println("N-o mai rezolva nimeni pe asta...");
        }
    }
}
