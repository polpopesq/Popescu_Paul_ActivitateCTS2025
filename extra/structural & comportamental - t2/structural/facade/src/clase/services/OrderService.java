package clase.services;

public class OrderService {
    public void createOrder(String productId, String customerEmail) {
        System.out.println("Comandă creată pentru produsul " + productId + " de către " + customerEmail);
    }
}

