package org.example.Payment;

import org.example.Order.Order;

public class CardPayment implements PaymentChannel, PaymentConfirmationService {
    @Override
    public void processPayment(Order order) {

    }

    @Override
    public void confirmPayment(Order order) {

    }
}
