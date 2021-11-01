package flowerstore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;


@Getter @Setter @ToString
public class Flower extends Item{
    private double price;
    private double sepalLength;
    private int[] color;

    private FlowerType flowerType;

    public void setColor(int[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    @Override
    public String getDescription() {
        return "Flower ";
    }
}
