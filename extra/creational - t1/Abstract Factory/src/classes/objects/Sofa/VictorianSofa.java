package classes.objects.Sofa;

import classes.objectInterfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void doubleSitOn() {
        System.out.println("Two people are sitting on Victorian sofa");
    }
}
