package mooc.thirdweek;

import java.util.Scanner;

// Palindrome
//Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward).
//The method can use the method reverse (from assignment number 56. Reversing text) as a helper. The method type is boolean, so it returns either true (the string is a palindrome) or false (the string is not a palindrome).
public class Ex69 {
    public static String reverse(String text) {
        String help = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            help = help + text.charAt(i);
        }
        return help;
    }

    public static boolean palindrome(String text) {
        String reversed = reverse(text);
        for (int i = 0; i < text.length(); i++) {
            if (reversed.charAt(i) != text.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");

        }
    }
}
