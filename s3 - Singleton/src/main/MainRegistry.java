package main;

import ro.ase.SingletonRegistry.AutoritatePescuit;

import java.util.HashMap;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance("anpa.ro", "ANPA", 10, new HashMap<>());

        autoritatePescuit.emiteAutorizatie("Lucas");
        autoritatePescuit.emiteAutorizatie("Lucas");

        System.out.println(autoritatePescuit);

        AutoritatePescuit autoritatePescuit1 = AutoritatePescuit.getInstance("blabla.ro", "blablabla", 10000, new HashMap<>());

        autoritatePescuit1.emiteAutorizatie("Lucas");
        autoritatePescuit1.emiteAutorizatie("Matei");

        System.out.println(autoritatePescuit);
        System.out.println(autoritatePescuit1);
    }
}
