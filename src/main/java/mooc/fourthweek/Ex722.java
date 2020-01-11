package mooc.fourthweek;

/*Create a program that:

Creates an account named "Matt's account" with the balance of 1000
Creates an account named "My account" with the balance of 0
Withdraws 100.0 from Matt's account
Deposits 100.0 to My account
Prints both accounts*/
public class Ex722 {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }
}
