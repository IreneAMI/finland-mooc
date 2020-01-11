package mooc.secondweek;

import java.util.Scanner;
//a program that calculates the sum 1+2+3+…+n where n is a number entered by the user.
public class Ex32 {
    public static void main(String[] args) {
        System.out.println("Introduce the number: ");
        Scanner reader = new Scanner(System.in);
        int limit = reader.nextInt();
        int sum = 0;
        int helperVariable = 0;
        while (helperVariable <= limit) {
            sum = helperVariable + sum;
            helperVariable++;

        }
        System.out.println(sum);
    }
}