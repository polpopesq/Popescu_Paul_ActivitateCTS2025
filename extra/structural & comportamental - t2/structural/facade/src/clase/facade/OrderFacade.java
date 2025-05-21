package clase.facade;

import clase.services.*;

public class OrderFacade {
    private InventoryService inventory;
    private OrderService order;
    private CustomerService customer;
    private PaymentService payment;
    private NotificationService notification;

    public OrderFacade(InventoryService inventory, OrderService order, CustomerService customer, PaymentService payment, NotificationService notification) {
        this.inventory = inventory;
        this.order = order;
        this.customer = customer;
        this.payment = payment;
        this.notification = notification;
    }

    public void placeOrder(String productId, String customerEmail, double price) {
        if(inventory.isInStock(productId)) {
            customer.getOrCreateCustomer(customerEmail);
            order.createOrder(productId, customerEmail);
            payment.processPayment(customerEmail, price);
            notification.sendConfirmationEmail(customerEmail);
        }
        else {
            System.out.println("Product not in stock");
        }
    }
}