package adapter.clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul a carui reteta a fost prezentata este achizitionat la pretul de " + pret);
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    private void prezintaReteta() {
        System.out.println("Este prezentata reteta pt medicamentul " + nume);
    }
}
