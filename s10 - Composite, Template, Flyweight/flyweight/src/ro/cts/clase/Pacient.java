package ro.cts.clase;

public class Pacient implements PacientAbstract{
    private String nume;
    private String nrTel;
    private String email;

    protected Pacient(String nume, String nrTel, String email) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.email = email;
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println("Pacientul " + nume + " cu nr tel " + nrTel + " si email " + email + " are spitalizarea:");
        System.out.println(spitalizare);
    }
}
