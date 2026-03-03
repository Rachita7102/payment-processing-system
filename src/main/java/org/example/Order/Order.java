package org.example.Order;

public class Order {
    private String orderId;
    private double orderAmount;

    public Order(String orderId, double orderAmount) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("orderId cannot be null or empty");
        }
        if (orderAmount < 0) {
            throw new IllegalArgumentException("orderAmount cannot be negative");
        }
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        if (orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("orderId cannot be null or empty");
        }
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        if (orderAmount < 0) {
            throw new IllegalArgumentException("orderAmount cannot be negative");
        }
        this.orderAmount = orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}
