package ro.cts.program;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Popica Benzina", 5);
        Pacient pacient2 = new Pacient("Gheorghe Motorina", 2);

        TemplateInternare spital = new SpitalPublic("Spitalul 9");
        spital.internare(pacient);
        spital.internare(pacient2);
        TemplateInternare spital2 = new SpitalPrivat();
        spital2.internare(pacient);
        spital2.internare(pacient2);
    }
}
