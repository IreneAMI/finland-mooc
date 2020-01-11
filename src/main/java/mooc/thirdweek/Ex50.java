package mooc.thirdweek;

import java.util.Scanner;

//Separating first characters
//create a program that asks for the user's name and gives its first, second and third characters separately.
public class Ex50 {

    public static void printCharacters(String name) {
        if (name.length() < 3) {
            System.out.println("");
            return;
        }
        System.out.println("1. character: " + name.charAt(0));
        System.out.println("2. character: " + name.charAt(1));
        System.out.println("3. character: " + name.charAt(2));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name: ");
        String userName = reader.nextLine();
        printCharacters(userName);
    }
}
