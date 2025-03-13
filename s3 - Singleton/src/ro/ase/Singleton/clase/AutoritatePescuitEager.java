package ro.ase.Singleton.clase;

//singleton with eager initialization
public class AutoritatePescuitEager {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA", "anpa.ro", 10, 100);

    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    public static AutoritatePescuitEager getInstance() {
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void angajeaza(Integer nrAngajati) {
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(Integer nrAngajati) {
        this.nrAngajati -= nrAngajati;
    }

    public void emiteAutorizatie(String numePersoana) {
        this.nrAutorizatiiEmise++;
        System.out.println("A fost emisa autorizatia de pescuit numarul "+ this.nrAutorizatiiEmise + " pentru " + numePersoana + ".");
    }

    @Override
    public String toString() {
        return "AutoritatePescuitEager{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutorizatiiEmise=" + nrAutorizatiiEmise +
                '}';
    }
}
