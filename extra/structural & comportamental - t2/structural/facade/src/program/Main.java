package program;

import clase.facade.OrderFacade;
import clase.services.*;

public class Main {
    public static void main(String[] args) {
        //facade class does all the complex things and contains all the subclasses
        OrderFacade facade = new OrderFacade(
                new InventoryService(),
                new OrderService(),
                new CustomerService(),
                new PaymentService(),
                new NotificationService()
        );

        facade.placeOrder("A6XI42BRB2D", "mail@gmail.com", 331.5);
    }
}
