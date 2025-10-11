package org.checkoutService.interfaces;

public interface PaymentGateway {
    void processPayment(double amount);
}