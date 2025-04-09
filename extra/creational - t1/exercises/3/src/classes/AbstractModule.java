package classes;

public abstract class AbstractModule {
    protected String name;
    protected double powerUsage;
    protected boolean isActive;

    AbstractModule(String name, double powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        isActive = false;
    }

    public void activate() {
        if (this.isActive) {
            System.out.println("Module " + this.name + " is already active");
        } else {
            this.isActive = true;
            System.out.println("Module " + this.name + " has been activated");
        }
    }

    public void deactivate() {
        if (this.isActive) {
            this.isActive = false;
            System.out.println("Module " + this.name + " has been deactivated");
        } else {
            System.out.println("Module " + this.name + " is already deactivated");
        }
    }
}
