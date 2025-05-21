package program;

import clase.BiletAvion;
import clase.decorator.BiletAsigurare;
import clase.decorator.BiletPrioritate;

public class Main {
    public static void main(String[] args) {
        BiletAvion biletAvion = new BiletAvion();
        //nu poate fi anulat, nu are posibilitate de prioritate
        biletAvion.descriere();

        //poate fi anulat
        BiletAvion biletAvion2 = new BiletAvion();
        BiletAsigurare biletAsigurare = new BiletAsigurare(biletAvion2);
        biletAsigurare.descriere();

        BiletPrioritate biletPrioritate = new BiletPrioritate(biletAsigurare);
        biletPrioritate.descriere();
        //NU e ideal daca ai metode noi, doar comportament!!
        //pt metode noi, folosim Strategy
    }
}
