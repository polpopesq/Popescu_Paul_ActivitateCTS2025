package program;

import clase.objectAdapter.PayFastAPI;
import clase.objectAdapter.PayFastAdapter;

public class Main {
    public static void main(String[] args) {
        PayFastAdapter adapter = new PayFastAdapter(new PayFastAPI());
        adapter.pay(22.5);
        //pay is a method of InternalPaymentProcessor, but on the inside it is integrated with payfast's makeTransaction
    }
}
