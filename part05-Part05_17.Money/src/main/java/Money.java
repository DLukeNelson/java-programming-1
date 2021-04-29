
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros == compared.euros) {
            return this.cents < compared.cents;
        }
        return this.euros < compared.euros;
    }
    
    public Money minus(Money decrease) {
        int cents = this.cents - decrease.cents;
        int euros = this.euros - decrease.euros;
        
        if (cents < 0) {
            euros -= 1;
            cents += 100;
        }
        
        Money newMoney;
        if (euros < 0) {
            newMoney = new Money(0, 0);
        } else {
            newMoney = new Money(euros, cents);
        }
        return newMoney;
    }
}
