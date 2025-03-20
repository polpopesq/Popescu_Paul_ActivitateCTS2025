package ro.cts.seminar4.factory.clase;

public class SupaLegume extends Supa {
    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + gramajCrutoane * super.getPretPerSutaGr() * 2 / 100;//crutoanele costa dublu
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de legume cu " + gramajCrutoane + " grame crutoane este gata!");
    }
}
