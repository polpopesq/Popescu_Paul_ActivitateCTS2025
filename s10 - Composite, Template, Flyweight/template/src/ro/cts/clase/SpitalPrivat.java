package ro.cts.clase;

public class SpitalPrivat extends TemplateInternare {
    @Override
    int analizareDificultate(Pacient pacient) {
        return pacient.getStare();
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Paturile sunt suficiente");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Fisa de internare a fost emisa pentru pacientul " + pacient.toString());
    }
}
