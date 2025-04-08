package classes.objects.Chair;

import classes.objectInterfaces.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on ArtDeco chair");
    }
}
