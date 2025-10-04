interface PaymentGateway {
    void processPayment(double amount);
}
interface Invoice {
    void generateInvoice();
}

// india implementation
class RasorpayGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("Razorpay Processing amount = " + amount);
    }
}

class PayUGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount){
        System.out.println("PayU Processing amount = " + amount);
    }
}

class IndiaInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Indian Invoice...");
    }
}

// Japanese implementation
class RakutenPayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount){
        System.out.println("RakutenPay Processing amount = " + amount);
    }
}

class LinePayGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount){
        System.out.println("LinePay Processing amount = " + amount);
    }
}

class JapaneseInvoice implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Generating Japanese Invoice...");
    }
}

// abstract factor
interface RegionFactory {
    PaymentGateway createPaymentGateway(String gatewayType);
    Invoice createInvoice();
}

// Indian factory
class IndianFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.compareTo("RasorpayGateway") == 0){
            return new RasorpayGateway();
        }
        return new PayUGateway();
    }

    public Invoice createInvoice() {
        return new IndiaInvoice();
    }
}

// Japanese factory
class JapaneseFactory implements RegionFactory {
    public PaymentGateway createPaymentGateway(String gatewayType) {
        if(gatewayType.compareTo("RakutenPayGateway") == 0){
            return new RakutenPayGateway();
        }
        return new LinePayGateway();
    }

    public Invoice createInvoice() {
        return new JapaneseInvoice();
    }
}


class CheckoutService {
    private PaymentGateway paymentGateway;
    private Invoice invoice;
    private String gatewayType;

    public CheckoutService(RegionFactory regionFactory, String gatewayType) {
        this.paymentGateway = regionFactory.createPaymentGateway(gatewayType);
        this.gatewayType = gatewayType;
        this.invoice = regionFactory.createInvoice();
    }

    public void completeOrder(double amount){
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutServiceIndia = new CheckoutService(new IndianFactory(), "RasorpayGateway");
        checkoutServiceIndia.completeOrder(500);
        
        CheckoutService checkoutServiceJapanese = new CheckoutService(new JapaneseFactory(), "RakutenPayGateway");
        checkoutServiceJapanese.completeOrder(500);
    }
}