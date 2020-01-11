package mooc.firstweek;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        System.out.println("Enter the password: ");
        Scanner keyboard = new Scanner(System.in);
        String password = keyboard.nextLine();
        while (!password.equals("carrot")) {
            System.out.println("Wrong!");
            password = keyboard.nextLine();
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
