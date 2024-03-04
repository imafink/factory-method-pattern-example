package com.example.fmpdemo;

public class DebitCardPayment implements PaymentMethod {

    // Implementation of the processPayment method defined in the PaymentMethod interface
    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment");
    }    
}