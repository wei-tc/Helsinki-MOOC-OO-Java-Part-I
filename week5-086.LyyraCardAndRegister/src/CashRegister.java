
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            cashInRegister += 2.5;
            economicalSold++;
            return cashGiven - 2.5;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4) {
            cashInRegister += 4;
            gourmetSold++;
            return cashGiven - 4;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.5) {
            economicalSold++;
            card.pay(2.5);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4) {
            gourmetSold++;
            card.pay(4);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
        
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
