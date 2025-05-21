package clase;

public class Pacient implements Observer {
    private String name;

    public Pacient(String name) {
        this.name = name;
    }

    @Override
    public void notifyObserver(String virus) {
        System.out.println("Pacient " + name + " was notified about the virus " + virus);
    }
}
