package mooc.firstweek;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        if (number > 0) {
            System.out.println("The number is positive!");
        }
        else{
            System.out.println("The number is negative!");
        }
    }
}
