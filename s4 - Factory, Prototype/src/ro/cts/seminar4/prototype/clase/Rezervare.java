package ro.cts.seminar4.prototype.clase;

public class Rezervare extends ARezervare{
    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }

    public Rezervare() {
        super();
    }

    @Override
    public void descriere() {
        System.out.println("Rezervare la ora " + this.ora + " pentru " + this.numeClient + ", " + this.nrPersoane + " persoane.");
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.data = this.data;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.ora = this.ora;
        return rezervareNoua;
    }
}
