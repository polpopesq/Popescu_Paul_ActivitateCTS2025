package classes;

public class NightVision extends AbstractModule {

    private double visionUpgrade;
    private String technology;

    NightVision(String name, double powerUsage, double visionUpgrade, String technology) {
        super(name, powerUsage);
        this.visionUpgrade = visionUpgrade;
        this.technology = technology;
    }
}
