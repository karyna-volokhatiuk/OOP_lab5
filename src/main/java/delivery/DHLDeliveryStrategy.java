package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {

    public String deliver(List<Item> items){
        return "Delivery was made with DHL. Items: " + items.toString();
    }
}
