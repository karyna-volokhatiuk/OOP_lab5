package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class FlowerTest {
    private Flower flower1, flower2, flower3;
    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);
        flower1.setSepalLength(25);

        flower2 = new Flower(FlowerType.Tulip);
        flower2.setPrice(5);
        flower2.setSepalLength(15);

        flower3 = new Flower(FlowerType.Rose);
        flower3.setPrice(30);
        flower3.setSepalLength(50);
    }

    @Test
    void getPrice() {
        assertEquals(10, flower1.getPrice());
        assertEquals(5, flower2.getPrice());
        assertEquals(30, flower3.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.Chamomile, flower1.getFlowerType());
        assertEquals(FlowerType.Tulip, flower2.getFlowerType());
        assertEquals(FlowerType.Rose, flower3.getFlowerType());
    }

    @Test
    void getSepalLength() {
        assertEquals(25, flower1.getSepalLength());
        assertEquals(15, flower2.getSepalLength());
        assertEquals(50, flower3.getSepalLength());
    }

    @Test
    void getColor() {
        int[] color = {204, 153, 255};

        flower1.setColor(color);
        flower2.setColor(color);
        flower3.setColor(color);

        assertArrayEquals(flower1.getColor(), color);

        color = new int[]{255, 0, 255};
        assertFalse(Arrays.equals(flower2.getColor(), color));
        assertArrayEquals(flower2.getColor(), new int[] {204, 153, 255});

        color = new int[]{204, 153, 255};
        assertArrayEquals(flower2.getColor(), color);
        color[2] = 43;
        assertFalse(Arrays.equals(flower2.getColor(), color));
    }

    @Test
    void testToString() {
        assertEquals("Flower(price=10.0, sepalLength=25.0, color=null, flowerType=Chamomile)", flower1.toString());

    }

}