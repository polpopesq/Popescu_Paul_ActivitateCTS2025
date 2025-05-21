package program;

import clase.ActivitateTuristicaStandard;
import clase.FlyweightFactory;
import clase.RezervareUnica;

public class Main {
    public static void main(String[] args) {
        //info standard se salveaza in cache (factory) si rezervarile individuale sunt obiecte separate;
        FlyweightFactory factory = new FlyweightFactory();
        factory.putActivitate(1, "Barcelona", "Maria Teresa", 230.5, "23/09/2025");
        factory.putActivitate(2, "Roma", "Lorenzo Fiumicino", 190.5, "19/09/2025");

        RezervareUnica rezervareUnica = new RezervareUnica("Popescu Ion", 5);
        RezervareUnica rezervareUnica1 = new RezervareUnica("Ionescu Marcel", 8);
        RezervareUnica rezervareUnica2 = new RezervareUnica("Preda Marin", 2);

        System.out.println("Rezervari: ");
        ActivitateTuristicaStandard activitate1 = (ActivitateTuristicaStandard) factory.getActivitate(1);
        ActivitateTuristicaStandard activitate2 = (ActivitateTuristicaStandard) factory.getActivitate(2);

        activitate1.descriere(rezervareUnica);
        activitate2.descriere(rezervareUnica2);
        activitate1.descriere(rezervareUnica1);
    }
}
