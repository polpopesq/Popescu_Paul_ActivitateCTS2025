package program;

import clase.Component;
import clase.Optiune;
import clase.Subcategorie;

public class Main {
    public static void main(String[] args) {
        Component main = new Subcategorie("main");
        Component subcategorie1 = new Subcategorie("subcategorie1");
        Component subcategorie2 = new Subcategorie("subcategorie2");
        Component subcategorie3 = new Subcategorie("subcategorie3");
        main.adaugaComponent(subcategorie1);
        main.adaugaComponent(subcategorie2);
        main.adaugaComponent(subcategorie3);
        Component optiune1 = new Optiune("optiune1");
        subcategorie1.adaugaComponent(optiune1);
        Component optiune2 = new Optiune("optiune2");
        subcategorie1.adaugaComponent(optiune2);
        Component optiune3 = new Optiune("optiune3");
        subcategorie2.adaugaComponent(optiune3);

        main.descriere();
    }
}
