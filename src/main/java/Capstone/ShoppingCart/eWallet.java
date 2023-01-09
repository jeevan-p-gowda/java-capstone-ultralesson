package Capstone.ShoppingCart;

public class eWallet implements Pay {
    @Override
    public void pay(int totalAmount) {
        System.out.println("Total amount: Rs."+ totalAmount);
        if(totalAmount >100){
            double payable = totalAmount - totalAmount * 0.05;
            System.out.println("Amount payable through eWallet: Rs "+payable);
        }
        else{
            System.out.println("Amount payable through eWallet: Rs "+ totalAmount);
        }
    }
}
