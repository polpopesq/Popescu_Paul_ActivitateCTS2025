package classes;

import java.util.HashMap;
import java.util.Map;

public class DroneConnection implements IDroneConnection {
    @Override
    public void checkConnections() {
        connections.forEach((key, value) -> {
            System.out.printf("Connection established for key: %s value: %s\n", key, value);
        });
    }
    private final String droneId;

    private DroneConnection(String droneId) {
        this.droneId = droneId;
    }

    private static Map<String, DroneConnection> connections = new HashMap<>();

    public static DroneConnection getInstance(String droneId) {
        if(!connections.containsKey(droneId)) {
            connections.put(droneId, new DroneConnection(droneId));
        }
        return connections.get(droneId);
    }
}
