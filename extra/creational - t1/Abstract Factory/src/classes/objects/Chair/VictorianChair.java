package classes.objects.Chair;

import classes.objectInterfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian chair");
    }
}
