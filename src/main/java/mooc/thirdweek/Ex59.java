package mooc.thirdweek;
//Words in reverse order
//Create a program that asks the user to input words, until the user gives an empty string.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (!word.isEmpty()) {
                words.add(word);
            } else {
                break;
            }
            Collections.reverse(words);
        }
        System.out.println("The reverse order of the words you typed: ");
        for (String typed : words) {
            System.out.println(typed);
        }
    }
}