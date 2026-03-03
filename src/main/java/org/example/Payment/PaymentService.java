package org.example.Payment;

import org.example.Order.Order;

public class PaymentService {
    private PaymentChannel paymentChannel;
    private PaymentConfirmationService confirmationService;

    public PaymentService(PaymentChannel paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public PaymentService(PaymentChannel paymentChannel, PaymentConfirmationService confirmationService) {
        this.paymentChannel = paymentChannel;
        this.confirmationService = confirmationService;
    }

    public void processPayment(Order order) {
        paymentChannel.processPayment(order);
        if (confirmationService != null) {
            confirmationService.confirmPayment(order);
        }
    }
}
