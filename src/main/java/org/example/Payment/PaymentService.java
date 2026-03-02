package org.example.Payment;

import org.example.Order.Order;

public class PaymentService {
    private PaymentChannel paymentChannel;

    public PaymentService(PaymentChannel paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public void processPayment(Order order) {
        paymentChannel.processPayment(order);
    }
}
