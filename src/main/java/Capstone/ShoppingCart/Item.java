package Capstone.ShoppingCart;

public class Item {
    private String item;
    private int quantity;
    private int cost;

    Item(String item, int quantity, int cost) {
        this.item = item;
        this.quantity = quantity;
        this.cost = cost;
    }
    public String getItem(){
        return item;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getCost(){
        return cost;
    }
    public void increaseQuantityBy(int quantity) {
        this.quantity += quantity;
    }
    public Integer getProductTotalCost() {
        return cost * quantity;
    }
    @Override
    public String toString() {
        return String.format("%s Qty-%s Rs.%s%n",this.item,this.quantity,this.cost);
    }
}
