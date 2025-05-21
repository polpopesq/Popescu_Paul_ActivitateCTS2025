package clase;

public class InternareSpitalStat extends Internare{
    @Override
    protected void analizeazaStarePacient(String numePacient) {
        System.out.println("Se analizeaza starea pacientului " + numePacient);
    }

    @Override
    protected boolean verificaDisponibilitateSalon(boolean arePile) {
        if (arePile) {
            System.out.println("Salon disponibil");
        } else {
            System.out.println("Salon non disponible pas, nu te internam, du-te la privat...");
        }
        return arePile;
    }

    @Override
    protected void emiteFisaInternare(String numePacient) {
        System.out.println("Se emite fisa de internare pentru pacientul " + numePacient);
    }
}
