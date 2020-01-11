package mooc.secondweek;

import java.util.Scanner;
// a program that asks the user for the first number and the last number and then prints all numbers between those two.
public class Ex31 {
    public static void main(String[] args) {
        System.out.println("First: ");
        Scanner reader = new Scanner(System.in);
        int first = reader.nextInt();
        System.out.println("Last: ");
        int last = reader.nextInt();
        for (int i = first + 1; i <= last - 1; i++) {
            System.out.println(i);
            if (first > last) {
                break;
            }
        }
    }
}
