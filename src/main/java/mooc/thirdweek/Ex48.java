package mooc.thirdweek;

import java.util.Scanner;

//First character
//Create a program that asks for the user's name and gives the first character.
public class Ex48 {
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name: ");
        String userName = reader.nextLine();
        System.out.println("First character: " + firstCharacter(userName));
    }
}
