package classes.objects.Chair;

import classes.objectInterfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern chair");
    }
}
