package classes;

public class PachetTransport implements PachetTuristic {
    private int km;

    public PachetTransport(int km) {
        this.km = km;
    }

    @Override
    public void description() {
        System.out.println("Pachet Transport cu " + km + " km");
    }

    public void catiKm() {
        System.out.println("cati km? : " + km);
    }
}
