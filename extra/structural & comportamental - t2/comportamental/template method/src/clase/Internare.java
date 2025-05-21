package clase;

public abstract class Internare {
    public final void proceseazaInternare(String numePacient, boolean arePile) {
        analizeazaStarePacient(numePacient);
        if(verificaDisponibilitateSalon(arePile)) {
            emiteFisaInternare(numePacient);
        }
    }
    protected abstract void analizeazaStarePacient(String numePacient);
    protected abstract boolean verificaDisponibilitateSalon(boolean arePile);
    protected abstract void emiteFisaInternare(String numePacient);
}
