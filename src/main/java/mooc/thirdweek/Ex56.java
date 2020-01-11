package mooc.thirdweek;

import java.util.Scanner;

//create the method reverse that puts the given string in reversed order
public class Ex56 {
    public static String reverse(String text) {
        String help = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            help = help + text.charAt(i);
        }
        return help;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
