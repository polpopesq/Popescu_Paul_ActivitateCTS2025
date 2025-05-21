package program;

import clase.Pacient;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital();
        Pacient pacient = new Pacient("Ghita");
        Pacient pacient2 = new Pacient("Gheorghe");
        Pacient pacient3 = new Pacient("Alex");

        spital.addObserver(pacient);
        spital.addObserver(pacient2);
        spital.addObserver(pacient3);
        spital.removeObserver(pacient3);
        spital.notifyObservers("Coronavirus");
    }
}
