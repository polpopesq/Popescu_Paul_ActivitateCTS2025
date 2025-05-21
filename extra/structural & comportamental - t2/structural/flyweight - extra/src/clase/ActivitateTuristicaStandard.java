package clase;

public class ActivitateTuristicaStandard implements Flyweight {
    private int cod;
    private String locatie;
    private String ghid;
    private double pret;
    private String data;

    protected ActivitateTuristicaStandard(int cod, String locatie, String ghid, double pret, String data) {
        this.cod = cod;
        this.locatie = locatie;
        this.ghid = ghid;
        this.pret = pret;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ActivitateTuristicaStandard{" +
                "cod=" + cod +
                "locatie='" + locatie + '\'' +
                ", ghid='" + ghid + '\'' +
                ", pret=" + pret +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public void descriere(RezervareUnica rezervare) {
        System.out.println(this.toString());
        System.out.println(rezervare);
    }
}
