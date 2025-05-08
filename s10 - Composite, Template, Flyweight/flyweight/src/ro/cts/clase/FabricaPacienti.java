package ro.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacienti {
    Map<String, PacientAbstract> pacienti = new HashMap<>();

    public PacientAbstract getPacient(String nrTel) throws Exception{
        PacientAbstract pacient = pacienti.get(nrTel);
        if(pacient == null) {
            throw new Exception("Foloseste metoda cu 3 parametri!");
        }
        return pacient;
    }

    public PacientAbstract getPacient(String nume, String nrTel, String email) {
        PacientAbstract pacient = pacienti.get(nrTel);
        if(pacient == null) {
            pacienti.put(nrTel, new Pacient(nume, nrTel, email));
        }
        return pacient;
    }
}
