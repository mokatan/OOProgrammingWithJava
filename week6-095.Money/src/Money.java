
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money add){
        Money money = new Money(this.euros + add.euros(), this.cents + add.cents());
        return money;
    }
    
    public boolean less(Money compared){
        boolean state = true;
        if (this.euros > compared.euros()) {
            state = false;
        }
        else if(this.euros == compared.euros()){
            if (this.cents > compared.cents()) {
                state = false;
            }
            else{
                state = true;
            }
        }
        return state;
    }
    
    public Money minus(Money decremented){
        int euro = this.euros - decremented.euros();
        int cent = this.cents - decremented.cents();
        
        if (euro < 0) {
            Money myMoney = new Money(0, 0);
            return myMoney;
        }
        else if(euro == 0){
            if (cent <= 0) {
                Money myMoney = new Money(0, 0);
                return myMoney;
            }
            else{
                Money myMoney = new Money(0, cent);
                return myMoney;
            }
        }
        else{
            if (cent < 0) {
                Money myMoney = new Money(euro - 1, 100 + cent);
                return myMoney;
            }
            else{
                Money myMoney = new Money(euro, cent);
                return myMoney;
            }
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
