package ordering;

import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment.Payment;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter @Setter @ToString
public class MyOrder {
    ArrayList<Item> items = new ArrayList<>();
    Payment paymentStrategy;
    Delivery deliveryStrategy;

    List<User> users = new ArrayList<>();


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

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void notifyUsers(){
        for (User user : users){
            user.update();
        }
    }

    public void order(){
        processOrder();
        notifyUsers();
    }


}
