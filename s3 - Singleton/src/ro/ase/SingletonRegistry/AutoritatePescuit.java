package ro.ase.SingletonRegistry;

import java.util.Date;
import java.util.Map;

//lazy initialization, thread safe (synchronized)
public class AutoritatePescuit {
    private String website;
    private String denumire;
    private int nrAngajati;
    private Map<String, Autorizatie> registry;
    private static AutoritatePescuit instance = null;

    private AutoritatePescuit(String website, String denumire, int nrAngajati, Map<String, Autorizatie> registru) {
        this.website = website;
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
        this.registry = registru;
    }

    public static synchronized AutoritatePescuit getInstance(String website, String denumire, int nrAngajati, Map<String, Autorizatie> registru) {
        if(instance == null) {
            instance = new AutoritatePescuit(website, denumire, nrAngajati, registru);
        }
        return instance;
    }

    public Autorizatie emiteAutorizatie(String numePersoana) {
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(registry.size() + 1, numePersoana, new Date().toString()));
        }
        return registry.get(numePersoana);
    }

    @Override
    public String toString() {
        return "AutoritatePescuit{" +
                "website='" + website + '\'' +
                ", denumire='" + denumire + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", registry=" + registry +
                '}';
    }
}
