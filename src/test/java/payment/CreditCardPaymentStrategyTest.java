package payment;

import flowerstore.Flower;
import flowerstore.FlowerType;
import ordering.MyOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreditCardPaymentStrategyTest {
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

        order.setPaymentStrategy(new CreditCardPaymentStrategy());
    }

    @Test
    void pay() {
        assertEquals("Payment was made with a credit card. Price: 15.0", order.pay());
    }
}
