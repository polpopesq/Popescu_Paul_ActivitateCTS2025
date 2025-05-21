package clase;

public class SpitalProxy implements IPacient{
    private Pacient pacient;

    public SpitalProxy(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internare() {
        if(pacient.eAsigurat()) {
            pacient.internare();
        } else {
            System.out.println("Nu putem interna pacientul " + pacient.getNume() + " deoarece nu are asigurare.");
        }
    }
}
