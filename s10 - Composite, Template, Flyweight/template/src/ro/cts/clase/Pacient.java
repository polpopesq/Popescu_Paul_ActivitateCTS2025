package ro.cts.clase;

public class Pacient {
    private String nume;
    private int stare;

    public Pacient(String nume, int stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public int getStare() {
        return stare;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stare=" + stare +
                '}';
    }
}
