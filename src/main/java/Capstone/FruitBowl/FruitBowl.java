package Capstone.FruitBowl;

import java.util.List;

abstract class FruitBowl {
    public String take(List<String> fruits){
        return "Take " + fruits + " from the bowl and place it in ";
    }
}
