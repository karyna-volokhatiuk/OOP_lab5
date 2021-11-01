package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketDecoratorTest {
    Flower flower1;
    BasketDecorator flower1_with_backet;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);

        flower1_with_backet = new BasketDecorator(flower1);
    }

    @Test
    void getPrice() {
        assertEquals(14.0, flower1_with_backet.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower with a basket", flower1_with_backet.getDescription());
    }
}