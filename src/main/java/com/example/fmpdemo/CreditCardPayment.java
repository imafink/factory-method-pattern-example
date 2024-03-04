package com.example.fmpdemo;

public class CreditCardPayment implements PaymentMethod {

    // Implementation of the processPayment method defined in the PaymentMethod interface
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }    
}