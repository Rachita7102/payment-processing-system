package org.example.Payment;

import org.example.Order.Order;

public interface PaymentConfirmationService {
    public void confirmPayment(Order order);
}
