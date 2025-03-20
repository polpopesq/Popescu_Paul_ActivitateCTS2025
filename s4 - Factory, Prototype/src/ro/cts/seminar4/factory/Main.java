package ro.cts.seminar4.factory;

import ro.cts.seminar4.factory.clase.Supa;
import ro.cts.seminar4.factory.fabrica.Factory;
import ro.cts.seminar4.factory.fabrica.TipSupa;

public class Main {
    public static void main(String[] args) {
        int gramajFabrica1 = 200;
        double pretFabrica1 = 10.5;

        Factory fabricaSupe1 = new Factory(gramajFabrica1, pretFabrica1);

        Supa ciuperci = fabricaSupe1.getSupa(TipSupa.CIUPERCI, "ciuperci, apa, sare, piper", 15);
        Supa legume = fabricaSupe1.getSupa(TipSupa.LEGUME, "bors, apa, morcovi, ceapa, ardei, sare", 2);
        Supa vita = fabricaSupe1.getSupa(TipSupa.VITA, "apa, vita, piper boabe", 22);

        ciuperci.preparaSupa();
        legume.preparaSupa();
        vita.preparaSupa();
    }
}