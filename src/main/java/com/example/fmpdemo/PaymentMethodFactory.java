package com.example.fmpdemo;

// This class represents a factory for creating payment methods.
public class PaymentMethodFactory {

    // This method creates a payment method based on the provided type.
    public PaymentMethod createPaymentMethod(String type) {
        // If the type is null, return null.
        if (type == null) {
            return null;
        } 
        // If the type is "CASH", create a CashPayment object and return it.
        else if (type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        } 
        // If the type is "DEBIT_CARD", create a DebitCardPayment object and return it.
        else if (type.equalsIgnoreCase("DEBIT_CARD")) {
            return new DebitCardPayment();
        } 
        // If the type is "CREDIT_CARD", create a CreditCardPayment object and return it.
        else if (type.equalsIgnoreCase("CREDIT_CARD")) {
            return new CreditCardPayment();
        } 
        // If the type is not recognized, return null.
        else {
            return null;
        }
    }
}