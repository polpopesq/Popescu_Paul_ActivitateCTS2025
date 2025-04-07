package classes;

public class AgentieFactory {
    public static PachetTuristic createPackage(TipPachet tipPachet, int km) {
        return switch (tipPachet) {
            case CAZARE -> new PachetCazare();
            case TRANSPORT -> new PachetTransport(km);
            case CAZARE_TRANSPORT -> new PachetCazareTransport();
        };
    }
}
