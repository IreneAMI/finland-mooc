package mooc.firstweek;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        if (age >= 18) {
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority!");
        }
    }
}
