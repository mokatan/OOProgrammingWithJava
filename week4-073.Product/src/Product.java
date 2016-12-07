/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class Product {
    private double productPrice;
    private String productName;
    private int productAmount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.productName = nameAtStart;
        this.productPrice = priceAtStart;
        this.productAmount = amountAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.productName + ", price" + this.productPrice + ", amount" + this.productAmount);
    }
}
