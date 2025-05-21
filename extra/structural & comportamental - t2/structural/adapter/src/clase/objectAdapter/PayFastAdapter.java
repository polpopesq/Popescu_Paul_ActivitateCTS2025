package clase.objectAdapter;

public class PayFastAdapter extends InternalPaymentProcessor {
    private PayFastAPI payFastAPI;

    public PayFastAdapter(PayFastAPI payFastAPI) {
        this.payFastAPI = payFastAPI;
    }

    @Override
    public void pay(double amount) {
        payFastAPI.makeTransaction((float) amount);
    }
}
