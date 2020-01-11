package mooc.thirdweek;

import java.util.Scanner;

//Separating Characters
//Create a program that asks for the user's name and gives its characters separately
public class Ex51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the name: ");
        String userName = reader.nextLine();
        int i = 0;
        while (i < userName.length()) {
            System.out.println(i + 1 + ": " + userName.charAt(i));
            i++;
        }
    }
}
