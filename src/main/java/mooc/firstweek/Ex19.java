package mooc.firstweek;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String student = keyboard.nextLine();
        int number = keyboard.nextInt();
        if (number >= 0 && number <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
