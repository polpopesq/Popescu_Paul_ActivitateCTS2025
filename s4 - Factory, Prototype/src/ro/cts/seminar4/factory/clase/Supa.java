package ro.cts.seminar4.factory.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
        this.ingrediente = ingrediente;
    }

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }

    public abstract void preparaSupa();
    public double calculeazaPret() {
        return this.gramaj / 100 * this.pretPerSutaGr / 100;
    }
}
