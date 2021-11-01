package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import ordering.MyOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostDeliveryStrategyTest {
    MyOrder order = new MyOrder();

    @BeforeEach
    void setUp() {
        Flower flower1, flower2;

        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);
        flower2 = new Flower(FlowerType.Tulip);
        flower2.setPrice(5);

        order.addItem(flower1);
        order.addItem(flower2);

        order.setDeliveryStrategy(new PostDeliveryStrategy());
    }

    @Test
    void deliver() {
        assertEquals("Delivery was made with a post. Items: [Flower(price=10.0, sepalLength=0.0, color=null, flowerType=Chamomile), Flower(price=5.0, sepalLength=0.0, color=null, flowerType=Tulip)]", order.deliver());
    }
}
