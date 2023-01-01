package Capstone.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        List<Products> product = new ArrayList<>();
        product.add(new Products("Apple", 1, 100));
        product.add(new Products("Milk", 1, 20));
        product.add(new Products("NewsPaper", 1, 2));


        Cart cart =new Cart(product,new Scanner(System.in));
        cart.getDetails();
        cart.addItem();
        cart.totalAmount();
        cart.payableAmount(new eWallet());
        }
    }

