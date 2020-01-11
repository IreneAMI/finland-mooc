package mooc.firstweek;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }
}
