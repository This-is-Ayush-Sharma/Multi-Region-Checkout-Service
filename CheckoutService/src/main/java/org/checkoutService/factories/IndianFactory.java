package org.checkoutService.factories;

import org.checkoutService.constants.PaymentMethods;
import org.checkoutService.india.IndiaInvoice;
import org.checkoutService.india.PayUGateway;
import org.checkoutService.india.RazorpayGateway;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;

public class IndianFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(PaymentMethods gatewayType) {
        switch (gatewayType){
            case RAZORPAY:
                return new RazorpayGateway();
            case PAYU:
            default:
                return new PayUGateway();
        }
    }

    public Invoice createInvoice() {
        return new IndiaInvoice();
    }
}