package payment;

public class CreditCardPaymentStrategy implements Payment{
    public String pay(double price){
        return "Payment was made with a credit card. Price: " + price;
    }
}
