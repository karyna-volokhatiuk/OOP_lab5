package delivery;

import flowerstore.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    public String deliver(List<Item> items){
        return "Delivery was made with a post. Items: " + items.toString();
    }
}
