package mooc.thirdweek;
//Recurring word
//Create a program that asks the user to input words until the user gives the same word twice.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        System.out.print("Type the word: ");
        String word = reader.nextLine();
        while (!words.contains(word)) {
            words.add(word);
            System.out.print("Type the word: ");
            word = reader.nextLine();
        }
        System.out.println("You wrote the word" + " \"" + word + "\"" + " twice");
    }
}

