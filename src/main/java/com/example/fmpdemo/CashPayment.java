package com.example.fmpdemo;

public class CashPayment implements PaymentMethod {

    // Implementation of the processPayment method defined in the PaymentMethod interface
    @Override
    public void processPayment() {
        System.out.println("Processing cash payment");
    }
}