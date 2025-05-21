package clase;

public class InternareSpitalPrivat extends Internare{

    @Override
    protected void analizeazaStarePacient(String numePacient) {
        System.out.println("Se analizeaza starea pacientului " + numePacient);
    }

    @Override
    protected boolean verificaDisponibilitateSalon(boolean arePile) {
        System.out.println("Aici te primim oricum, avem locuri garla.");
        return true;
    }

    @Override
    protected void emiteFisaInternare(String numePacient) {
        System.out.println("Se emite fisa internare pentru pacientul " + numePacient);
    }
}
