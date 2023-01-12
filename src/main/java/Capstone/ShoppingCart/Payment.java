package Capstone.ShoppingCart;

public class Payment {
    Bill bill;
    public Payment(Bill bill) {
        this.bill = bill;
    }
    public void payAmountBy(Pay method){
        System.out.printf("Total amount is Rs:%s%n",bill.getTotalPrice());
        method.pay(bill.getTotalPrice());
    }
}
