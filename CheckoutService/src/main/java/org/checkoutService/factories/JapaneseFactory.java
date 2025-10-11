package org.checkoutService.factories;

import org.checkoutService.constants.PaymentGatewayTypes;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;
import org.checkoutService.japan.JapaneseInvoice;
import org.checkoutService.japan.LinePayGateway;
import org.checkoutService.japan.RakutenPayGateway;

public class JapaneseFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(PaymentGatewayTypes gatewayType) {
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
