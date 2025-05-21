package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Flyweight> activitatiStandard = new HashMap<Integer, Flyweight>();

    public int getNumber() {
        return activitatiStandard.size();
    }

    public Flyweight getActivitate(int cod) {
        return activitatiStandard.get(cod);
    }

    public void putActivitate(int cod, String locatie, String ghid, double pret, String data) {
        ActivitateTuristicaStandard activitateTuristicaStandard = new ActivitateTuristicaStandard(
                cod, locatie, ghid, pret, data
        );
        activitatiStandard.put(cod, activitateTuristicaStandard);
    }
}
