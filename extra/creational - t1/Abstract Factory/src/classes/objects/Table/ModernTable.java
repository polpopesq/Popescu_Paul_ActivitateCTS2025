package classes.objects.Table;

import classes.objectInterfaces.Table;

public class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Putting something on this Modern table");
    }
}
