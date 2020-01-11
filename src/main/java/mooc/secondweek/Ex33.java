package mooc.secondweek;

import java.util.Scanner;
// The sum between two numbers
public class Ex33 {
    public static void main(String[] args) {
        System.out.println("Introduce the first number: ");
        Scanner reader = new Scanner(System.in);
        int first = reader.nextInt();
        System.out.println("Introduce the last number: ");
        int limit = reader.nextInt();
        int helperVariable = 0;
        int sum = 0;
        while (helperVariable < limit) {
            sum = first + limit + helperVariable;
            helperVariable++;
        }
        System.out.print("The sum is: ");
        System.out.println(sum);
    }
}
