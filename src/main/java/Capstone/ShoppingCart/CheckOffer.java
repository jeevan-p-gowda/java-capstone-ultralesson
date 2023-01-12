package Capstone.ShoppingCart;

import java.util.List;

public class CheckOffer {
    List<Item> item;
    public CheckOffer(List<Item> item) {
        this.item = item;
    }
    void getOffer(Offer forItem){
        forItem.offer(item);
    }
}
