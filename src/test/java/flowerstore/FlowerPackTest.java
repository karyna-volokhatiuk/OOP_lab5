package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower1, flower2, flower3;
    private FlowerPack pack1, pack2, pack3;

    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);

        pack1 = new FlowerPack(flower1, 177);

        flower2 = new Flower(FlowerType.Tulip);
        flower2.setPrice(5);

        pack2 = new FlowerPack(flower2, 115);

        flower3 = new Flower(FlowerType.Rose);
        flower3.setPrice(30);
        flower3.setColor(new int[] {115, 145, 53});
        flower3.setSepalLength(50);

        pack3 = new FlowerPack(flower3, 57);
    }

    @Test
    void getPrice() {
        assertEquals(pack1.getAmount()* pack1.getFlower().getPrice(), pack1.getPrice());
        assertEquals(pack2.getAmount()* pack2.getFlower().getPrice(), pack2.getPrice());
        assertEquals(pack3.getAmount()* pack3.getFlower().getPrice(), pack3.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(flower1, pack1.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(115, pack2.getAmount());
    }

    @Test
    void setFlower() {
        assertEquals(flower1, pack1.getFlower());
        pack1.setFlower(flower3);
        assertEquals(flower3, pack1.getFlower());
    }

    @Test
    void setAmount() {
        assertEquals(177, pack1.getAmount());
        pack1.setAmount(539);
        assertEquals(539, pack1.getAmount());
    }

    @Test
    void testToString() {
        assertEquals("FlowerPack(flower=Flower(price=30.0, sepalLength=50.0, color=[115, 145, 53], flowerType=Rose), amount=57)", pack3.toString());
    }
}
