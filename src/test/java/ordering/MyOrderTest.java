package ordering;

import delivery.PostDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.CreditCardPaymentStrategy;
import users.Sender;
import users.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyOrderTest {
    MyOrder order;
    FlowerBucket flowerBucket;

    @BeforeEach
    void setUp() {
        order = new MyOrder();
        FlowerPack flowerPack;

        Flower flower = new Flower(FlowerType.Rose);

        flower.setPrice(50);
        flower.setColor(new int[] {255, 255, 255});
        flower.setSepalLength(25);

        flowerPack = new FlowerPack(flower, 151);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);

        order = new MyOrder();
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(0, order.calculateTotalPrice());
        order.addItem(flowerBucket);
        assertEquals(7550, order.calculateTotalPrice());
    }

    @Test
    void removeItem() {
        order.addItem(flowerBucket);
        assertTrue(order.getItems().contains(flowerBucket));
        order.removeItem(flowerBucket);
        assertFalse(order.getItems().contains(flowerBucket));
    }

    @Test
    void deliver() {
        order.addItem(flowerBucket);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        assertEquals("Delivery was made with a post. Items: [FlowerBucket(flowerPacks=[FlowerPack(flower=Flower(price=50.0, sepalLength=25.0, color=[255, 255, 255], flowerType=Rose), amount=151)])]", order.deliver());
    }

    @Test
    void pay() {
        order.addItem(flowerBucket);
        order.setPaymentStrategy(new CreditCardPaymentStrategy());
        assertEquals("Payment was made with a credit card. Price: 7550.0", order.pay());
    }

}