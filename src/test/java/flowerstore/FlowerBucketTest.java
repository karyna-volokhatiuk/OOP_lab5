package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerPack pack1, pack2, pack3;
    private FlowerBucket bucket;

    @BeforeEach
    void setUp() {
        Flower flower1, flower2, flower3;

        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);
        flower2 = new Flower(FlowerType.Tulip);
        flower2.setPrice(5);
        flower3 = new Flower(FlowerType.Rose);
        flower3.setPrice(30);

        pack1 = new FlowerPack(flower1, 177);
        pack2 = new FlowerPack(flower2, 115);
        pack3 = new FlowerPack(flower3, 57);

        bucket = new FlowerBucket();
    }

    @Test
    void addFlowerPack() {
        assertTrue(bucket.getFlowerPacks().isEmpty());
        bucket.addFlowerPack(pack1);
        assertFalse(bucket.getFlowerPacks().isEmpty());
        assertEquals(new ArrayList<FlowerPack>(Arrays.asList(pack1)), bucket.getFlowerPacks());
    }

    @Test
    void getPrice() {
        assertEquals(0.0, bucket.getPrice());
        bucket.addFlowerPack(pack1);
        assertEquals(1770.0, bucket.getPrice());
        bucket.addFlowerPack(pack2);
        assertEquals(2345.0, bucket.getPrice());
        bucket.addFlowerPack(pack3);
        assertEquals(4055.0, bucket.getPrice());
    }
}