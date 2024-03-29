package Capstone.ShoppingCart;

public class Delivery {
    public static void main(String[] args) {

        Item Apple = new Item("Apple", 1, 100);
        Item Milk = new Item("Milk", 1, 20);
        Item NewsPaper = new Item("NewsPaper", 1, 2);

        Cart cart=new Cart();

        cart.addItem(Apple);
        cart.addItem(Milk);
        cart.addItem(Milk);
        cart.addItem(NewsPaper);

        Bill bill = new Bill(cart.getItems());
        bill.getAddedItemDetails();


        CheckOffer checkOffer=new CheckOffer(cart.getItems());
        checkOffer.getOffer(new availOffer());

        Discount discount = new Discount();

        Payment payment = new Payment(bill);
        payment.payAmountBy(new eWallet(discount));
    }
    }

