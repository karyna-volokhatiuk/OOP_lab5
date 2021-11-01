package payment;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price){
        return "Payment was made with PayPal. Price: " + price;
    }
}
