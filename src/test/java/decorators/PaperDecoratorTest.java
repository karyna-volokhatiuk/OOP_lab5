package decorators;

import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaperDecoratorTest {
    Flower flower1;
    PaperDecorator flower1_with_paper;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);

        flower1_with_paper = new PaperDecorator(flower1);
    }

    @Test
    void getPrice() {
        assertEquals(23.0, flower1_with_paper.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("Flower with paper", flower1_with_paper.getDescription());
    }
}