package ro.cts.seminar4.factory.clase;

public class SupaVita extends Supa{
    public double pretSmantana;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretSmantana;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de vita cu extra smantana este gata si costa " + pretSmantana);
    }
}
