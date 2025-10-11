package org.checkoutService.payment;

import org.checkoutService.checkout.CheckoutService;
import org.checkoutService.checkout.CheckoutServiceImpl;
import org.checkoutService.constants.PaymentMethods;
import org.checkoutService.factories.IndianFactory;
import org.checkoutService.factories.JapaneseFactory;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutServiceIndia = new CheckoutServiceImpl(new IndianFactory(), PaymentMethods.RAZORPAY);
        checkoutServiceIndia.completeOrder(500.145);


        CheckoutService checkoutServiceJapan = new CheckoutServiceImpl(new JapaneseFactory(), PaymentMethods.LINEPAY);
        checkoutServiceJapan.completeOrder(2.455);
    }
}