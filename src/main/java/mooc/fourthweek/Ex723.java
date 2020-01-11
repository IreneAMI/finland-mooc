package mooc.fourthweek;

//Create the method public static void transfer(Account from, Account to, double howMuch)
////        in the given program body. The method transfers money from one account to another.
////        You do not need to check that the from account has enough balance.
////
////        After completing the above, make sure that your main method does the following:
////
////        Creates an account "A" with the balance of 100.0
////        Creates an account "B" with the balance of 0.0
////        Creates an account "C" with the balance of 0.0
////        Transfers 50.0 from account A to account B
////        Transfers 25.0 from account B to account C

public class Ex723 {
    public static void transfer (Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static void main(String[] args) {
        Account A = new Account("A",100);
        Account B = new Account("B",0.0);
        Account C = new Account("C",0.0);

        transfer(A,B,50);
        transfer(B,C,25);

        System.out.println(A + "\n" + B + "\n" + C); 
    }
}
