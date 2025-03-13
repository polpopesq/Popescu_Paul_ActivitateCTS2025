package main;

import ro.ase.Singleton.clase.AutoritatePescuitEager;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();

        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.concediaza(5);

        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("ANPPA");
        autoritatePescuitEager.setWebsite("anppa.ro");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Popescu Paul");
        System.out.println(autoritatePescuitEager);

        AutoritatePescuitEager autoritate2 = AutoritatePescuitEager.getInstance();

        autoritate2.emiteAutorizatie("Petrisor Lucas");
        System.out.println(autoritate2);
    }
}