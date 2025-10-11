package org.checkoutService.japan;

import org.checkoutService.interfaces.Invoice;

public class JapaneseInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Japanese Invoice...");
    }
}
