package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private FlowerBucket bucket1, bucket2;
    private Store store;

    @BeforeEach
    void setUp() {
        Flower flower1, flower2, flower3;
        FlowerPack pack1, pack2, pack3;

        flower1 = new Flower(FlowerType.Chamomile);
        flower1.setPrice(10);
        flower2 = new Flower(FlowerType.Tulip);
        flower2.setPrice(5);
        flower3 = new Flower(FlowerType.Rose);
        flower3.setPrice(30);

        pack1 = new FlowerPack(flower1, 177);
        pack2 = new FlowerPack(flower2, 115);
        pack3 = new FlowerPack(flower3, 57);

        bucket1 = new FlowerBucket();
        bucket1.addFlowerPack(pack1);
        bucket2 = new FlowerBucket();
        bucket2.addFlowerPack(pack2);
        bucket2.addFlowerPack(pack3);

        store = new Store();
    }

    @Test
    void addFlowerBucket() {
        assertTrue(store.getFlowerBuckets().isEmpty());
        store.addFlowerBucket(bucket1);
        assertFalse(store.getFlowerBuckets().isEmpty());
        assertTrue(store.getFlowerBuckets().contains(bucket1));
    }

    @Test
    void search() {
        store.addFlowerBucket((bucket1));
        assertTrue(store.search(bucket1));
        assertFalse(store.search(bucket2));
    }
}