package mooc.secondweek;
//40.1 Guessing a number game

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Ex41 {
    static Scanner reader = new Scanner(System.in);

    private static void drawNumber(int number) {
        System.out.print("Guess the number: ");
        int guessingNumber = reader.nextInt();
        int tempCount = 0;
        boolean foundNumber = false;
        while (!foundNumber) {
            if (number >= 0 || number <= 100) {
                if (number == guessingNumber) {
                    System.out.println("Congratulations! Your guess is correct!");
                    foundNumber = true;
                    break;
                }
                if (number > guessingNumber) {
                    tempCount++;
                    System.out.println("The number is higher, " + "guesses made :" + tempCount);
                } else {
                    tempCount++;
                    System.out.println("The number is lesser, " + "guesses made :" + tempCount);
                }
                guessingNumber = reader.nextInt();
            }
        }
    }

    public static void main(String[] args) {

        drawNumber(55);
    }
}
