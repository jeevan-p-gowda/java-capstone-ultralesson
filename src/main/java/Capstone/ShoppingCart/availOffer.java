package Capstone.ShoppingCart;

import java.util.List;

public class availOffer implements Offer {
    private String currentOfferItem="milk";
    public String getCurrentOfferItem(){
        return currentOfferItem;
    }
        public void offer(List<Item> item){
            Integer addedQty = item.stream().filter(i -> i.getItem().equalsIgnoreCase(getCurrentOfferItem()))
                    .map(i -> i.getQuantity()).toList().get(0);
                int offerQty = 0;
                if(addedQty>=2){
                for (int q = 1; q <= addedQty; q++) {
                    if (q % 2 == 0) {
                        offerQty++;
                    }
                }
                System.out.printf("Collect extra %s Qty of %s as an offer%n",offerQty,getCurrentOfferItem());
            }

        }
    }