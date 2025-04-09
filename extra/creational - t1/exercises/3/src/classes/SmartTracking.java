package classes;

public class SmartTracking extends AbstractModule {
    private int version;
    private double range;

    SmartTracking(String name, double powerUsage, int version, double range) {
        super(name, powerUsage);
        this.version = version;
        this.range = range;
    }
}
