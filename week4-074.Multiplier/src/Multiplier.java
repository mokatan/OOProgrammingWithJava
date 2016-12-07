/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class Multiplier {
    private int mynumber;
    
    public Multiplier(int number){
        this.mynumber = number; 
    }
    
    public int multiply(int otherNumber){
        return this.mynumber * otherNumber;
    }
    
}
