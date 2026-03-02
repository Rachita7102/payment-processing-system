package org.example.Payment;

import org.example.Order.Order;

public interface PaymentChannel {
    public void processPayment(Order order);
}



//PaymentService
//Paymentchannel
//order,payment

