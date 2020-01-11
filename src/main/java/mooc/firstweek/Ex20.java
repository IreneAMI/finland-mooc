package mooc.firstweek;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        System.out.println("Type your username: ");
        Scanner keyboard = new Scanner(System.in);
        String username = keyboard.nextLine();
        System.out.println("Type your password: ");
        String password = keyboard.nextLine();
        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else {
            if (username.equals("emily") && password.equals("cat")) {
                System.out.println("You are now logged into the system!");
            } else {
                System.out.println("Your username or password was invalid!");
            }
        }
    }
}
