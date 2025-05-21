package clase;

public class CoordonatorRelatiiClienti extends Handler{
    @Override
    public void handle(TipReclamatie tipReclamatie) {
        if(tipReclamatie == TipReclamatie.PACHET_GRESIT || tipReclamatie == TipReclamatie.LIPSA_GHID) {
            System.out.println("Rezolvat de coordonator PR");
        }
        else {
            super.getNextHandler().handle(tipReclamatie);
        }
    }
}
