package mooc.thirdweek;
//Create a program that asks the user to input words until the user types in an empty String.

import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
        }

        System.out.println("You typed these words: " + words);
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}

