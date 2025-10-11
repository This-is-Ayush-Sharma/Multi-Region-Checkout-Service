package org.checkoutService.factories;

import org.checkoutService.constants.PaymentMethods;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;
import org.checkoutService.japan.JapaneseInvoice;
import org.checkoutService.japan.LinePayGateway;
import org.checkoutService.japan.RakutenPayGateway;

import static org.checkoutService.constants.PaymentMethods.LINEPAY;
import static org.checkoutService.constants.PaymentMethods.RAKUTENPAY;

public class JapaneseFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(PaymentMethods gatewayType) {
        switch (gatewayType) {
            case RAKUTENPAY:
                return new RakutenPayGateway();
            case LINEPAY:
            default:
                return new LinePayGateway();
        }
    }

    public Invoice createInvoice() {
        return new JapaneseInvoice();
    }
}
