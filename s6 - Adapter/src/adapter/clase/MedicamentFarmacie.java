package adapter.clase;

public class MedicamentFarmacie {
    private String nume;
    private String dataExpirare;
    private boolean inStoc;
    private double pret;

    public MedicamentFarmacie(String nume, String dataExpirare, boolean inStoc, double pret) {
        this.nume = nume;
        this.dataExpirare = dataExpirare;
        this.inStoc = inStoc;
        this.pret = pret;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + nume + " care expira la " + dataExpirare + " a fost vandut la pretul de " + pret);
    }
}
