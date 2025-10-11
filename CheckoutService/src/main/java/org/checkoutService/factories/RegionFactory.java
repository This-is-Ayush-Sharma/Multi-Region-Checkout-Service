package org.checkoutService.factories;

import org.checkoutService.constants.PaymentGatewayTypes;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(PaymentGatewayTypes gatewayType);
    Invoice createInvoice();
}
