package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RibbonDecoratorTest {
    Flower flower1;
    RibbonDecorator flower1_with_ribbon;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);

        flower1_with_ribbon = new RibbonDecorator(flower1);
    }

    @Test
    void getPrice() {
        assertEquals(50.0, flower1_with_ribbon.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower with a ribbon", flower1_with_ribbon.getDescription());
    }
}