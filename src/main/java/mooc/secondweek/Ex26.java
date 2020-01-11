package mooc.secondweek;

import java.util.Scanner;
//a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when user enters the number 0.
public class Ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}

