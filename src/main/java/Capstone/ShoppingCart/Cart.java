package Capstone.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;//hashmap

    Cart() {
        this.items = new ArrayList<>();
    }

    private Item getItemByName(String itemName) {

        List<Item> list = items.stream()
                .filter(item -> item.getItem().equalsIgnoreCase(itemName))
                .toList();

        return list.get(0);
    }

    private boolean isItemPresent(String itemName) {

        List<Item> list = items.stream()
                .filter(item -> item.getItem().equalsIgnoreCase(itemName))
                .toList();

        return list.size() == 1;
    }

   public void addItem(Item item) {

       boolean itemPresent = isItemPresent(item.getItem());

       if(itemPresent) {
           Item p = getItemByName(item.getItem());
           p.increaseQuantityBy(item.getQuantity());
       }
       else {
           items.add(item);
       }
    }

    public List<Item> getItems(){
        return items;
    }
}

//    Scanner sc=new Scanner(System.in);
//        for (int q = 0; q <= item.size() - 1; q++) {
//            String item = item.stream().map(i -> i.getItem()).toList().get(q);
//            System.out.printf("Enter Qty for %s to add: ", item);
//             int qty=sc.nextInt();
//
//                    int price = item.stream()
//                    .filter(i -> i.getItem().equalsIgnoreCase(item))
//                    .map(i -> i.getCost() * qty).toList().get(0);
//                    allPrice=new ArrayList<>();
//            allPrice.add(price);
//
//            System.out.printf("%s Qty-%s Price-Rs.%s%n\n",item,qty,price);
//        }