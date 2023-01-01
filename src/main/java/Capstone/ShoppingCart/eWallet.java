package Capstone.ShoppingCart;

public class eWallet implements Payment {
    @Override
    public void pay(int amount) {
        if(amount>100){
            double payable = amount - amount * 0.05;
            System.out.println("Amount payable through eWallet: Rs "+payable);
        }
        else{
            System.out.println("Amount payable through eWallet: Rs "+amount);
        }
    }
}
