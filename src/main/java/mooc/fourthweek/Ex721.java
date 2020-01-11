package mooc.fourthweek;

//Accounts
//You are handed a ready-made class Account along with your exercise files. The object of the class Account represents a bank account that has a balance (meaning some amount of money).
public class Ex721 {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);

        System.out.println(bartosAccount);

        bartosAccount.deposit(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
    }
}
