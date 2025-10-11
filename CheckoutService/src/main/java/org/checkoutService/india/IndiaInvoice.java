package org.checkoutService.india;

import org.checkoutService.interfaces.Invoice;

public class IndiaInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Indian Invoice...");
    }
}
