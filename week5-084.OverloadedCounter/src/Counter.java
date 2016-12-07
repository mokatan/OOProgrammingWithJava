/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehmet
 */
public class Counter {
    private int startingValue;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check){
        this.startingValue = 0;
        this.check = check;
    }
    
    public Counter(){
        this.startingValue = 0;
        this.check = false;
    }
    
    public int value(){
        return startingValue;
    }
    
    public void increase(){
        startingValue++;
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount > 0) {
            startingValue += increaseAmount;
        }
    }
    
    public void decrease(){
        if (this.check) {
            if (this.startingValue -1 < 0) {
                this.startingValue = 0;
            }
            else{
                this.startingValue--;
            }
        }
        else{
            this.startingValue--;
        }
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount > 0){
            if (this.check) {
                if (this.startingValue - decreaseAmount < 0) {
                    this.startingValue = 0;
                }
                else{
                    this.startingValue -= decreaseAmount;
                }
            }
            else{
                this.startingValue -= decreaseAmount;
            }
        }
    }
}
