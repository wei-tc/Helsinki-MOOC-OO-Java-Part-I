
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

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int addedEuros = added.euros() + this.euros();
        int addedCents = added.cents() + this.cents();
        if (addedCents > 99) {
            addedEuros += addedCents / 100;
            addedCents %= 100;
        }

        return new Money(addedEuros, addedCents);
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        int decrementedEuros = this.euros() - decremented.euros();
        int decrementedCents = this.cents() - decremented.cents();
        if (decrementedCents < 0) {
            decrementedEuros--;
            decrementedCents += 100;
        }
        if (decrementedEuros < 0) {
            return new Money(0, 0);
        }
        return new Money(decrementedEuros, decrementedCents);
    }
    
}
