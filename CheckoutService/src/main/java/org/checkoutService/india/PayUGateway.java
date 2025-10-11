package org.checkoutService.india;

import org.checkoutService.interfaces.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayU Processing amount = " + amount + " Rs");
    }
}