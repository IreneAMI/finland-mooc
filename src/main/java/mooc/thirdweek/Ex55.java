package mooc.thirdweek;
//A word inside a word
//Create a program that asks the user for two words. Then the program tells if the second word is included in the first word.
// Use String method indexOf in your program.

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the 1st word: ");
        String first = reader.nextLine();
        System.out.println("Type the 2nd word: ");
        String second = reader.nextLine();
        if (first.indexOf(second) >= 0) {
            System.out.println("The word " + second + " is found in the word " + first + ".");
        } else {
            System.out.println("The word " + second + " is not found in the word " + first + ".");
        }
    }
}
