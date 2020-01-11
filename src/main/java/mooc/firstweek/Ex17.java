package mooc.firstweek;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        if (number1 < number2) {
            System.out.println("The greatest number is: " + number2);
        } else {
            if (number1 == number2) {
                System.out.println("The numbers are equal!");
            } else {
                System.out.println("The greatest number is: " + number1);
            }
        }
    }
}
