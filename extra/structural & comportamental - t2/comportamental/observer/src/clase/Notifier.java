package clase;

public interface Notifier {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String virus);
}
