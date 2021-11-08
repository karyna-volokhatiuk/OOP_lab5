package ordering;

import delivery.PostDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import payment.CreditCardPaymentStrategy;
import users.Sender;
import users.User;

public enum QuickOrder {
    Rose_Bucket, Chamomile_Bucket, Tulip_Bucket;

    public static MyOrder createOrder(QuickOrder quickOrder){
        MyOrder order;
        FlowerPack flowerPack;
        FlowerBucket flowerBucket;

        Flower flower;
        FlowerType flowerType;

        if (quickOrder == Rose_Bucket) {
            flower = new Flower(FlowerType.Rose);
        } else if (quickOrder == Chamomile_Bucket){
            flower = new Flower(FlowerType.Chamomile);
        } else {
            flower = new Flower(FlowerType.Tulip);
        }

        flower.setPrice(50);
        flower.setColor(new int[] {255, 255, 255});
        flower.setSepalLength(25);

        flowerPack = new FlowerPack(flower, 151);

        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);

        order = new MyOrder();
        order.addItem(flowerBucket);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new CreditCardPaymentStrategy());

        User user = new Sender();

        order.addUser(user);
        order.order();

        return order;
    }

}
