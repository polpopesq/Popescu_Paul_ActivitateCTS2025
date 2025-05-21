package clase.classAdapter;

public class PaymentAPIAdapter extends ExternalPaymentAPI implements PaymentProcessor{
    @Override
    public void pay(double amount) {
        makeTransaction((float) amount);
    }
}
