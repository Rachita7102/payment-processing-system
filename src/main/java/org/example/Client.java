package org.example;

import org.example.Order.Order;
import org.example.Payment.CreditCardPayment;
import org.example.Payment.PaymentService;
import org.example.Payment.SmsService;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditCardPayment(), new SmsService());

        //Process a payment for an order
        paymentService.processPayment(new Order("123", 100.0));
    }
}