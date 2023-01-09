package Capstone.FruitBowl;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket {
    public static void main(String[] args) {

        List<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("Grapes", "Small","Green"));
        fruit.add(new Fruit("Strawberry", "Small","Red"));
        fruit.add(new Fruit("Apple", "Medium","Red"));
        fruit.add(new Fruit("Orange", "Medium","Orange"));
        fruit.add(new Fruit("WaterMelon", "Big","Green"));
        fruit.add(new Fruit("MuskMelon", "Big","Orange"));
        fruit.add(new Fruit("Papaya", "Big","Green"));

        Segregator segregator=new Segregator(fruit);

        segregator.fruitBasket(fruit);

    }
}
