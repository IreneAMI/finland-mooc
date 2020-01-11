package mooc.firstweek;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name1 = keyboard.nextLine();
        int age1 = keyboard.nextInt();
        keyboard.nextLine();
        String name2 = keyboard.nextLine();
        int age2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println((name1 + " " + name2) + " are " + (age1+age2) + " years old ");
    }
}
