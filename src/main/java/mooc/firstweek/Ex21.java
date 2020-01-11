package mooc.firstweek;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner keyboard = new Scanner(System.in);
        int year = keyboard.nextInt();
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " is a leap year.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
