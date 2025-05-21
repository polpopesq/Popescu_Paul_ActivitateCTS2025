package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Notifier {
    private List<Observer> observers;

    public Spital() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String virus) {
        observers.forEach(observer -> observer.notifyObserver(virus));
    }
}
