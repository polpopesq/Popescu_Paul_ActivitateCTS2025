package ro.cts.seminar4.factory.clase;

public class SupaCiuperci extends Supa {

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de ciuperci cu " + cantitateCiuperci + " grame ciuperci este gata!");
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + super.getPretPerSutaGr() * (cantitateCiuperci / 100);
    }
}
