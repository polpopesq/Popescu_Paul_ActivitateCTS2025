package classes;

public class ExtraBattery extends AbstractModule {
    private int kwh;
    private String type;

    ExtraBattery(String name, double powerUsage, int kwh, String type) {
        super(name, powerUsage);
        this.kwh = kwh;
        this.type = type;
    }
}
