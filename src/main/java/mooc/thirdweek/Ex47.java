package mooc.thirdweek;

import java.util.Scanner;

//Length of a name
//Create a program that asks for the user's name and says how many characters the name contains.
public class Ex47 {
    public static int calculateCharacters(String text) {
        return text.length();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name: ");
        String userName = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(userName));
    }
}
