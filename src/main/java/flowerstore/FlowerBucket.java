package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket extends Item{
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        double price = 0;

        for (int i = 0; i < flowerPacks.size(); i++){
            price += flowerPacks.get(i).getPrice();
        }

        return price;
    }

    @Override
    public String getDescription() {
        return "Flower bucket ";
    }
}
