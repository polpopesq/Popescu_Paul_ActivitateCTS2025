package microservices;

public abstract class AbstractMicroService {
    protected String name;
    protected String urlAdress;
    protected boolean isConnected;

    public AbstractMicroService(String name, String urlAdress) {
        this.name = name;
        this.urlAdress = urlAdress;
        this.isConnected = false;
    }

    public void connect() {
        if (!this.isConnected) {
            System.out.println("Connecting to service: " + urlAdress);
            this.isConnected = true;
        } else {
            System.out.println("Service " + name + " is already connected at " + urlAdress);
        }
    }
}
