package Capstone.ShoppingCart;

public class Products {
    String item;
    private int qty;
    int price;

    Products(String item, int qty, int price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }
    public void setItem(String item){
        this.item=item;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getItem() {
        return item;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return  this.item + " Qty-" + this.qty + " Price- Rs."
                + this.price + "\n";
    }
}
