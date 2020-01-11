package mooc.thirdweek;

import java.util.Scanner;

//Create a program that prints the first part of a word. The program asks the user for the word and the length of the first part. Use the substring method in your program.
public class Ex53 {
    public static String firstPart(String userInput, int lengthOfWord) {
        return "Result: " +  userInput.substring(0, lengthOfWord);
    }

    public static void main(String[] args) {
        //Exercise 53: First part
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userInput = reader.nextLine();
        System.out.println("Length of last part: ");
        int lengthOfWord = reader.nextInt();
        System.out.println(firstPart(userInput, lengthOfWord));
    }
}
