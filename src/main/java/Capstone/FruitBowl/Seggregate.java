package Capstone.FruitBowl;

import java.util.ArrayList;
import java.util.List;

public class Seggregate {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Grapes", "Small"));
        fruits.add(new Fruits("Strawberry", "Small"));
        fruits.add(new Fruits("Apple", "Medium"));
        fruits.add(new Fruits("Orange", "Medium"));
        fruits.add(new Fruits("WaterMelon", "Big"));
        fruits.add(new Fruits("MuskMelon", "Big"));
        fruits.add(new Fruits("Papaya", "Big"));

        FruitBasket fb=new FruitBasket(fruits);
        System.out.println("--Seggregation has been done based on size of fruit and basket layer--");
        fb.firstLayer();
        fb.secondLayer();
        fb.thirdLayer();
    }
}
