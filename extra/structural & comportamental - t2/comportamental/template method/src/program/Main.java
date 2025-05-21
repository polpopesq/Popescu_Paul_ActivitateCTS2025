package program;

import clase.Internare;
import clase.InternareSpitalPrivat;
import clase.InternareSpitalStat;

public class Main {
    public static void main(String[] args) {
        Internare internarePrivat = new InternareSpitalPrivat();
        Internare internareStat = new InternareSpitalStat();

        internareStat.proceseazaInternare("Gheorghe", true);
        internareStat.proceseazaInternare("Matei", false);

        internarePrivat.proceseazaInternare("Matei", false);
    }
}
