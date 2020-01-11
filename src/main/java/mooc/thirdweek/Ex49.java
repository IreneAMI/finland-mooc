package mooc.thirdweek;

import java.util.Scanner;

//Last character
//Create a program that asks for the user's name and gives the last character.
public class Ex49 {
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name: ");
        String userName = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(userName));
    }
}
