package ro.cts.seminar4.prototype.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Generic";
        }

        if(nrPersoane > 2) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 0;
        }
        if(data.length() == 8) {
            this.data = data;
        } else {
            this.data = "20.03.2025";
        }
        this.ora = ora;
    }

    public ARezervare() {
        this.numeClient = "Anonim";
        this.nrPersoane = 2;
        this.data = "20.03.2025";
        this.ora = "14:45";
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public abstract void descriere();
    public abstract ARezervare copiaza();
}
