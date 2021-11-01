package ordering;

import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment.Payment;

import java.util.LinkedList;

@Getter @Setter @ToString
public class MyOrder {
    LinkedList<Item> items = new LinkedList<>();
    Payment paymentStrategy;
    Delivery deliveryStrategy;

    public double calculateTotalPrice(){
        double price = 0;
        for (Item item : items){
            price += item.getPrice();
        }
        return price;
    }

    public void processOrder(){
        deliver();
        pay();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public String deliver(){
        return deliveryStrategy.deliver(items);
    }

    public String pay(){
        double price = calculateTotalPrice();
        return paymentStrategy.pay(price);
    }

}
