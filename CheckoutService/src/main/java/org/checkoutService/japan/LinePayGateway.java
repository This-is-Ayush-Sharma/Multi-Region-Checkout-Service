package org.checkoutService.japan;

import org.checkoutService.interfaces.PaymentGateway;

public class LinePayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("LinePay Processing amount = " + amount + " Yen");
    }
}
