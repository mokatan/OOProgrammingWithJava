/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtstart){
        this.balance = balanceAtstart;
    }
    
    public String toString(){
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical(){
        if (this.balance - 2.5 >= 0) {
            this.balance -= 2.5;
        }
    }
    
    public void payGourmet(){
        if (this.balance - 4 >= 0) {
            this.balance -= 4;
        }
    }
    
    public void loadMoney(double amount){
        if (amount > 0) {
            double check = this.balance + amount;
            if (check > 150) {
                this.balance = 150;
            }
            else{
                this.balance += amount;
            }
        }
    }
    
}
