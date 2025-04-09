package singletonFactory;

import microservices.*;

import java.util.HashMap;
import java.util.Map;

public class MicroServiceFactory {
    private static final Map<String, AbstractMicroService> registry = new HashMap<>();

    private MicroServiceFactory() {}

    public static AbstractMicroService getInstance(String name, String urlAdress, ServiceType serviceType) {
        if (!registry.containsKey(name)) {
            AbstractMicroService service = switch (serviceType) {
                case FABRICATION -> new FabricationService(name, urlAdress);
                case WEATHER -> new WeatherService(name, urlAdress);
                case USER -> new UserService(name, urlAdress);
            };
            registry.put(name, service);
        }
        return registry.get(name);
    }
}
