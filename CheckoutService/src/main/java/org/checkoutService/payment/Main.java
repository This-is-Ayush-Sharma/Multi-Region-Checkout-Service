package org.checkoutService.payment;

import org.checkoutService.checkout.CheckoutService;
import org.checkoutService.checkout.CheckoutServiceImpl;
import org.checkoutService.constants.PaymentGatewayTypes;
import org.checkoutService.factories.IndianFactory;
import org.checkoutService.factories.JapaneseFactory;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutServiceIndia = new CheckoutServiceImpl(new IndianFactory(), PaymentGatewayTypes.RAZORPAY);
        checkoutServiceIndia.completeOrder(500.145);


        CheckoutService checkoutServiceJapan = new CheckoutServiceImpl(new JapaneseFactory(), PaymentGatewayTypes.LINEPAY);
        checkoutServiceJapan.completeOrder(2.455);
    }
}