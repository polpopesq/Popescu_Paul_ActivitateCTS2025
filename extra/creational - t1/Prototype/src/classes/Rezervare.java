package classes;

public class Rezervare implements IRezervare {

    int nrPersoane;
    String nume;
    String ora;

    public Rezervare(int nrPersoane, String nume, String ora) {
        //simulam un proces costisitor...
        try {
            Thread.sleep(2000);
        } catch(Exception e) {
            e.printStackTrace();
        }
        this.nrPersoane = nrPersoane;
        this.nume = nume;
        this.ora = ora;
    }

    //constructor lightweight
    public Rezervare() {

    }

    @Override
    public IRezervare copiere() {
        Rezervare rezervare = new Rezervare();
        rezervare.nrPersoane = nrPersoane;
        rezervare.nume = nume;
        rezervare.ora = ora;
        return rezervare;
    }
}
