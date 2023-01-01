package Capstone.FruitBowl;

import java.util.List;
import java.util.stream.Collectors;

public class FruitBasket extends FruitBowl {
   private List<Fruits> fruits;
   FruitBasket(List<Fruits> fb){
       this.fruits =fb;
   }
    public void firstLayer(){
        List<String> smallFruit= fruits.stream()
                .filter(f->f.size.equalsIgnoreCase("Small"))
                .map(f->f.fruit).collect(Collectors.toList());
        System.out.println(take(smallFruit)+"first layer");
        }

    public void secondLayer(){
        List<String> mediumFruit= fruits.stream()
                .filter(f->f.size.equalsIgnoreCase("Medium"))
                .map(f->f.fruit).collect(Collectors.toList());
        System.out.println(take(mediumFruit)+"second layer");
    }
    public void thirdLayer(){
        List<String> bigFruit= fruits.stream()
                .filter(f->f.size.equalsIgnoreCase("Big"))
                .map(f->f.fruit).collect(Collectors.toList());
        System.out.println(take(bigFruit)+"third layer");
    }
}
