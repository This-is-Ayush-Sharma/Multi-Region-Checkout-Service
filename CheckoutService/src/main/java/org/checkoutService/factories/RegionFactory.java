package org.checkoutService.factories;

import org.checkoutService.constants.PaymentMethods;
import org.checkoutService.interfaces.Invoice;
import org.checkoutService.interfaces.PaymentGateway;

public interface RegionFactory {
    PaymentGateway createPaymentGateway(PaymentMethods gatewayType);
    Invoice createInvoice();
}
