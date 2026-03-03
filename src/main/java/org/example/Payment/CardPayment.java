package org.example.Payment;

import org.example.Order.Order;

public class CardPayment implements PaymentChannel {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing card payment for order: " + order.getOrderId());
    }
}
