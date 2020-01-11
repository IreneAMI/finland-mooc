package mooc.secondweek;
//a program that prints all whole numbers from 1 to the number the user enters.
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        System.out.print("Up to what number? ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        for (int i = 1; i<=number; i++) {
            System.out.println(i);
        }
    }
}
