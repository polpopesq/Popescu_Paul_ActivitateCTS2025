package classes;

public class GPSTracking extends AbstractModule {
    private int satellites;
    private String serviceProvider;

    GPSTracking(String name, double powerUsage, int satellites, String serviceProvider) {
        super(name, powerUsage);
        this.satellites = satellites;
        this.serviceProvider = serviceProvider;
    }
}
