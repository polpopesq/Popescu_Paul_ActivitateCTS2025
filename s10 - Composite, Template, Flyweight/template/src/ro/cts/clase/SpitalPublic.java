package ro.cts.clase;

public class SpitalPublic extends TemplateInternare{
    private String nume;

    public SpitalPublic(String nume) {
        this.nume = nume;
    }

    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getStare();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Nu avem paturi suficiente in spitalul " + nume);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.toString() + " a fost internat la un spital privat.");
    }
}
