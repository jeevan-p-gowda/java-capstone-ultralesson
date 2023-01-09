package Capstone.ShoppingCart;

public class CheckOffer {
    Item item;
    public CheckOffer(Item item) {
        this.item = item;
    }
    void getOffer(Offer forItem){
        forItem.offer(item.getItem(), item.getQuantity());
    }
}
