package Capstone.ShoppingCart;

public class Discount {
    private double discountPercent;
    private double discountPrice;

    public Discount() {
        this.discountPercent = 0.05;
    }

    public void setDiscountPrice(int totalPrice) {
        this.discountPrice = getDiscountPercent() * totalPrice;
    }


    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getDiscountPrice(int totalAmount) {
        if (totalAmount > 100) {
            setDiscountPrice(totalAmount);
            return discountPrice;
        } else {
            return 0;
        }
    }

}