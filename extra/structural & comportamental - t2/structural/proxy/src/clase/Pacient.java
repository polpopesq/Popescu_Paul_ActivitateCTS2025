package clase;

public class Pacient implements IPacient{
    private String nume;
    private boolean asigurat;

    public Pacient(String nume, boolean asigurat) {
        this.asigurat = asigurat;
        this.nume = nume;
    }

    public boolean eAsigurat() {
        return asigurat;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + this.nume + " a fost internat.");
    }
}
