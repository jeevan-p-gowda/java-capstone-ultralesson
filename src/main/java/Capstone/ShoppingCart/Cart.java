package Capstone.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cart {
    List<Products> prod;
    List<Integer> allPrice=new ArrayList<>();
    int totalAmount;
    Scanner sc;

    Cart(List<Products> prod,Scanner sc) {
        this.prod = prod;
        this.sc = sc;
    }
    public void getDetails() {
        System.out.println("-:Available items for shopping:-\n" +
                prod.stream().collect(Collectors.toList()));
    }

   public void addItem() {
        for (int q = 0; q <= prod.size() - 1; q++) {
            String item = prod.stream().map(i -> i.item).collect(Collectors.toList()).get(q);
            System.out.printf("Enter Qty for %s to add: ", item);
             int qty=sc.nextInt();

                    int price = prod.stream()
                    .filter(i -> i.item.equalsIgnoreCase(item))
                    .map(i -> i.price * qty).collect(Collectors.toList()).get(0);
            allPrice.add(price);

            Offers offer=new Offers();
            offer.checkOffer(item,qty);

            System.out.printf("%s Qty-%s Price-Rs.%s%n\n",item,qty,price);
        }
    }
    public void totalAmount(){
        totalAmount = allPrice.stream()
                .reduce((value, combinedvalue) -> {
                    return combinedvalue + value;
                }).get();
        System.out.println("Total amount : Rs "+totalAmount);
    }
    public void payableAmount (Payment method){
        method.pay(totalAmount);
    }

}






