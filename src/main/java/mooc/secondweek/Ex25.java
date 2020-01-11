package mooc.secondweek;

import java.util.Scanner;
//a program that asks the user for three numbers and then prints their sum
public class Ex25 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int number3 = keyboard.nextInt();
        int sum = number1 + number2 + number3;
        System.out.println("The sum of the three numbers is: " + sum);
    }
}
