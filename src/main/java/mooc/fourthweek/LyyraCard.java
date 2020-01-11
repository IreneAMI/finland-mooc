package mooc.fourthweek;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;

    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (balance >= 2.5)
            balance = balance - 2.50;
    }

    public void payGourmet() {
        if (balance >= 4.0)
            balance = balance - 4.0;
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if (balance < 150) {
                balance = balance + amount;
                if (balance >= 150) {
                    balance = 150.0;
                }
            }
        }
    }
}
