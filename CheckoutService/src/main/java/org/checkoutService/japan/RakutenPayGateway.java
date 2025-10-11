package org.checkoutService.japan;

import org.checkoutService.interfaces.PaymentGateway;

public class RakutenPayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("RakutenPay Processing amount = " + amount + " Yen");
    }
}
