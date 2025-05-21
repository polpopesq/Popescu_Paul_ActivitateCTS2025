package clase.services;

public class PaymentService {
    public void processPayment(String customerEmail, double amount) {
        System.out.println("Plată procesată pentru " + customerEmail + " în valoare de " + amount + " RON");
    }
}

