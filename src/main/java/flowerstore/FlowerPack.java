package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }

    public FlowerPack(Flower flower, int amount){
        this.flower = flower;
        this.amount = amount;
    }

    @Override
    public String getDescription() {
        return "Flower pack ";
    }
}
