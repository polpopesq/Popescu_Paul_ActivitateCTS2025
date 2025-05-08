package ro.cts.clase;

public class Spitalizare {
    private int nrSalon;
    private int zileSpitalizare;
    private int nrPat;

    public Spitalizare(int nrSalon, int zileSpitalizare, int nrPat) {
        this.nrSalon = nrSalon;
        this.zileSpitalizare = zileSpitalizare;
        this.nrPat = nrPat;
    }

    @Override
    public String toString() {
        return "Spitalizare{" +
                "nrSalon=" + nrSalon +
                ", zileSpitalizare=" + zileSpitalizare +
                ", nrPat=" + nrPat +
                '}';
    }
}
