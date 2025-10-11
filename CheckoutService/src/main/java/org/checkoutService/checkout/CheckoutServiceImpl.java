package org.checkoutService.checkout;

import org.checkoutService.constants.PaymentGatewayTypes;
import org.checkoutService.factories.RegionFactory;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;

public class CheckoutServiceImpl implements CheckoutService{
    private PaymentGateway paymentGateway;
    private Invoice invoice;
    private PaymentGatewayTypes gatewayType;

    public CheckoutServiceImpl(RegionFactory regionFactory, PaymentGatewayTypes gatewayType) {
        this.paymentGateway = regionFactory.createPaymentGateway(gatewayType);
        this.gatewayType = gatewayType;
        this.invoice = regionFactory.createInvoice();
    }

    @Override
    public void completeOrder(double amount) {
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
