package program;

import classes.Client;
import classes.LivrarePremium;
import classes.LivrareRapida;
import classes.LivrareStandard;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ivan", new LivrarePremium(), 200);
        Client client1 = new Client("Yolanda", new LivrareRapida(), 300);
        Client client2 = new Client("Madrid", new LivrareStandard(), 100);

        System.out.println(client.getCostTotal());
        System.out.println(client1.getCostTotal());
        System.out.println(client2.getCostTotal());
    }
}