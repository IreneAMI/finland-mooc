package mooc.secondweek;

import java.util.Scanner;
//a program that calculates the factorial of the number n.
public class Ex34 {
    public static void main(String[] args) {
        System.out.println("Introduce the number: ");
        Scanner reader = new Scanner(System.in);
        int limit = reader.nextInt();
        int factorial = 1;
        int helperVariable = 1;
        while (helperVariable <= limit) {
            factorial = helperVariable * factorial;
            helperVariable++;
        }
        System.out.print("The factorial of the number introduced is: ");
        System.out.println(factorial);
    }
}
