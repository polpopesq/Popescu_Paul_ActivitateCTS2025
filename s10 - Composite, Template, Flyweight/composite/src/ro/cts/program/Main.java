package ro.cts.program;

import ro.cts.clase.Departament;
import ro.cts.clase.Sectie;
import ro.cts.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura departament1 = new Departament("pediatrie", 34);
        Structura departament2 = new Departament("icu", 23);
        Structura departament3 = new Departament("general", 45);

        Sectie sectie1 = new Sectie("Sectia 1");
        Sectie sectie2 = new Sectie("Sectia 2");
        Sectie sectie3 = new Sectie("Sectia 3");
        Sectie sectie4 = new Sectie("Sectia 4");

        try {
            departament3.adaugaStructura(departament1);
            departament3.adaugaStructura(departament2);
            departament2.adaugaStructura(sectie1);
            departament3.adaugaStructura(sectie2);
            departament2.adaugaStructura(sectie3);
            departament1.adaugaStructura(sectie4);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        departament3.afiseazaDescriere();

    }
}
