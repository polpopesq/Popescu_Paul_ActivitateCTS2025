package ro.cts.seminar4.prototype;

import ro.cts.seminar4.prototype.clase.ARezervare;
import ro.cts.seminar4.prototype.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ARezervare rezervare = new Rezervare("Popescu Paul", 3, "25.03.25", "15:30");

        ARezervare rezervare2 = rezervare.copiaza();

        rezervare2.setOra("20:00");

        rezervare.descriere();
        rezervare2.descriere();
    }
}
