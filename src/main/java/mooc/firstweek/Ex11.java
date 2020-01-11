package mooc.firstweek;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number1 = keyboard.nextInt();
        int number2 = keyboard.nextInt();
        int max = Math.max(number1, number2);
        System.out.println(max);
    }
}
