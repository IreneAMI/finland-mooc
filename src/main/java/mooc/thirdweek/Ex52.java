package mooc.thirdweek;

import java.util.Scanner;

//Reversing a name
//Create a program that asks for the user's name and prints it in reverse order.
public class Ex52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name:");
        String name = reader.nextLine();
        int i = name.length() - 1;

        while (i >= 0) {
            System.out.print(name.charAt(i));
            i--;
        }
    }
}