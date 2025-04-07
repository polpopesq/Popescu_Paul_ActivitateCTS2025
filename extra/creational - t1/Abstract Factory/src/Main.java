import classes.AgentieFactory;
import classes.PachetTransport;
import classes.PachetTuristic;
import classes.TipPachet;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = AgentieFactory.createPackage(TipPachet.CAZARE, 0);
        PachetTransport pachetTransport = (PachetTransport) AgentieFactory.createPackage(TipPachet.TRANSPORT, 20);

        System.out.println(pachetCazare);
        System.out.println(pachetTransport);

        pachetCazare.description();
        pachetTransport.catiKm();
    }
}