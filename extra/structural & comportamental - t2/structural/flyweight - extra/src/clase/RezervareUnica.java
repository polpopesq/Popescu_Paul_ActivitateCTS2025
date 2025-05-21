package clase;

public class RezervareUnica {
    private String numeClient;
    private int nrParticipanti;

    public RezervareUnica(String numeClient, int nrParticipanti) {
        this.numeClient = numeClient;
        this.nrParticipanti = nrParticipanti;
    }

    @Override
    public String toString() {
        return "RezervareUnica{" +
                "numeClient='" + numeClient + '\'' +
                ", nrParticipanti=" + nrParticipanti +
                '}';
    }
}
