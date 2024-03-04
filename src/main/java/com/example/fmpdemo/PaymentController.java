package com.example.fmpdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

@RequestMapping("/payment")
public class PaymentController {
    
    // Instance variable to hold the PaymentMethodFactory dependency
    private final PaymentMethodFactory paymentMethodFactory;

    // Constructor to inject the PaymentMethodFactory dependency
    public PaymentController(PaymentMethodFactory paymentMethodFactory) {
        this.paymentMethodFactory = paymentMethodFactory;
    }

    // Handler method for HTTP GET requests with a path variable "type"
    @GetMapping("/{type}")
    public String processPayment(@PathVariable String type) {
        // Create a PaymentMethod instance using the factory based on the type provided
        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod(type);
        
        // Process the payment using the created PaymentMethod instance
        paymentMethod.processPayment();
        return "Payment processed";
    }
}