package ro.cts.program;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabrica = new FabricaPacienti();

        try {
            PacientAbstract pacientAbstract = fabrica.getPacient("123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        PacientAbstract pacient1= fabrica.getPacient("Gigel", "123123", "gigel@mail.co");
        PacientAbstract pacient2 = fabrica.getPacient("Matei", "00003", "matei@mail.co");
        PacientAbstract pacient3 = fabrica.getPacient("Ion", "987432", "ion@mail.co");

        Spitalizare spitalizare1 = new Spitalizare(5, 7, 12);
        Spitalizare spitalizare2 = new Spitalizare(5, 2, 10);
        Spitalizare spitalizare3 = new Spitalizare(1, 6, 15);
        Spitalizare spitalizare4 = new Spitalizare(2, 4, 8);


        pacient1.afiseazaPacient(spitalizare1);
        pacient2.afiseazaPacient(spitalizare2);

        try {
            fabrica.getPacient("ioana", "0123", "ioana@gmail.com").afiseazaPacient(spitalizare3);
            fabrica.getPacient("0123").afiseazaPacient(spitalizare4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //ideea e ca pacientii sa ramana o singura data in memorie iar spitalizarea de mai multe ori si fabrica se ocupa de tot
    }
}
