package Capstone.ShoppingCart;

import java.util.List;

public class Bill {
    List<Item> items;
    public Bill(List<Item> items) {
        this.items = items;
    }

    public void getAddedItemDetails(){
        System.out.println("--List of Added Items--\n"+items);
    }
    public Integer getTotalPrice(){
        return items.stream()
                .map(Item::getProductTotalCost)
                .mapToInt(i -> i).sum();
    }
}
