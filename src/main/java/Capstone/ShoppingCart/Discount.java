package Capstone.ShoppingCart;

public class Discount {
    private double discountPercent;
    private double discountPrice;

    public Discount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setDiscountPrice(int totalPrice) {
        this.discountPrice = getDiscountPercent() * totalPrice;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public double getDiscountedPrice(int totalAmount) {
        if (totalAmount > 100) {
            setDiscountPrice(totalAmount);
            return totalAmount - getDiscountPrice();
        } else {

        }
        return 0;
    }
}
