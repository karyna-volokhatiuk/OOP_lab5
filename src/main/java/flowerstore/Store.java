package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;

@Getter @Setter @ToString
public class Store {
    HashSet<FlowerBucket> flowerBuckets = new HashSet<FlowerBucket>();

    public void addFlowerBucket(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }

    public boolean search(FlowerBucket flowerBucket){
        return flowerBuckets.contains(flowerBucket);
    }
}
