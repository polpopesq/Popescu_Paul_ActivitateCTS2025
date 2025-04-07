package Registry;

import java.util.HashMap;
import java.util.Map;

public class ConnectionRegistry {
    private static Map<String, ConnectionRegistry> registry = new HashMap<>();
    private String clientName;

    private ConnectionRegistry(String clientName) {
        this.clientName = clientName;
    }

    public static ConnectionRegistry getInstance(String clientName) {
        if(!registry.containsKey(clientName)) {
            registry.put(clientName, new ConnectionRegistry(clientName));
        }
        return registry.get(clientName);
    }
}
