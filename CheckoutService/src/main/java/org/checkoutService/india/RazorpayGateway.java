package org.checkoutService.india;

import org.checkoutService.interfaces.PaymentGateway;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Razorpay Processing amount = " + amount + " Rs");
    }
}
