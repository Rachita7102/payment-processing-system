package org.example.Payment;

import org.example.Order.Order;

public class CreditCardPayment implements PaymentChannel {
    @Override
    public void processPayment(Order order) {
        System.out.println("Processing credit card payment for order: " + order.getOrderId());
    }

}
