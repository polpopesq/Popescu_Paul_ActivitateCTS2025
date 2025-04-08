import classes.IRezervare;
import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(2, "Paul", "20:00");
        IRezervare rezervare2 = rezervare.copiere();
        System.out.println(rezervare2);
        System.out.println(rezervare);
    }
}