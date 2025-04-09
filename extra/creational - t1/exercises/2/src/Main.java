import microservices.AbstractMicroService;
import microservices.ServiceType;

import singletonFactory.MicroServiceFactory;

public class Main {
    public static void main(String[] args) {
        AbstractMicroService weatherService = MicroServiceFactory.getInstance("Weather API",
                "https://weather.com",
                ServiceType.WEATHER);
        weatherService.connect();
        weatherService.connect();
    }
}