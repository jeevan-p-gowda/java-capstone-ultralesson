package Capstone.ShoppingCart;

public class MilkOffer implements Offer {
    @Override
    public void offer(String item,int qty) {
            int i = 0;
            if (item.equalsIgnoreCase("milk") && qty >= 2) {
                for (int q = 1; q <= qty; q++) {
                    if (q % 2 == 0) {
                        i++;
                    }
                }
                System.out.println("Collect extra " +i+ " Qty of " +item+ " as an offer ");
            }
        }
    }
