package ro.cts.clase;

public abstract class TemplateInternare {
    //grija mare!!!!
    public final void internare(Pacient pacient) {
        if (analizareDificultate(pacient) < 3) {
            System.out.println("Nu necesita internare.");
        } else {
            System.out.println("Necesita internare.");
            verificareDisponibilitate();
            emitereFisa(pacient);
        }
    }

    abstract int analizareDificultate(Pacient pacient);
    abstract void verificareDisponibilitate();
    abstract void emitereFisa(Pacient pacient);
}
