package Capstone.ShoppingCart;

public class Payment {
    Bill bill;
    public Payment(Bill bill) {
        this.bill = bill;
    }

    public void payAmountBy(Pay method){
        method.pay(bill.getTotalPrice());
    }
}
