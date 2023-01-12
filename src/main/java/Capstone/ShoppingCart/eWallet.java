package Capstone.ShoppingCart;

public class eWallet implements Pay {
    Discount discount;
    public eWallet(Discount discount) {
        this.discount = discount;
    }
    public void pay(int totalAmount) {
        System.out.printf("Amount payable through eWallet: Rs.%s",
                totalAmount-discount.getDiscountPrice(totalAmount));
    }
}