package org.example;

import org.example.Order.Order;
import org.example.Payment.CreditCardPayment;
import org.example.Payment.PaymentService;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(new Order("123", 100.0));
    }
}