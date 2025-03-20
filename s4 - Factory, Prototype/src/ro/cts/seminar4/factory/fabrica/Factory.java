package ro.cts.seminar4.factory.fabrica;

import ro.cts.seminar4.factory.clase.Supa;
import ro.cts.seminar4.factory.clase.SupaCiuperci;
import ro.cts.seminar4.factory.clase.SupaLegume;
import ro.cts.seminar4.factory.clase.SupaVita;

public class Factory {
    private int gramaj;
    private double pretPerSutaGr;

    public Factory(int gramaj, double pretPerSutaGr) {
        this.gramaj = gramaj;
        this.pretPerSutaGr = pretPerSutaGr;
    }

    public Supa getSupa(TipSupa tip, String ingrediente, double extraSupa) {
        return switch (tip) {
            case CIUPERCI -> new SupaCiuperci(gramaj, pretPerSutaGr, ingrediente, extraSupa);
            case LEGUME -> new SupaLegume(gramaj, pretPerSutaGr, ingrediente, extraSupa);
            case VITA -> new SupaVita(gramaj, pretPerSutaGr, ingrediente, extraSupa);
            default -> null;
        };
    }
}
