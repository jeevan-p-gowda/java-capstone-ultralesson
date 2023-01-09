package Capstone.FruitBowl;

public class Fruit {
    private String fruit;
    private String size;
    private String color;

    Fruit(String fruit, String size,String color){
        this.fruit=fruit;
        this.size=size;
        this.color=color;
    }
    public String getFruit(){
        return fruit;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
}

