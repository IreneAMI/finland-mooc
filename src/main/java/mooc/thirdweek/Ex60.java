package mooc.thirdweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Words in alphabetical order
//Create a similar program as the previous one, but in which the words are printed in alphabetical order.
public class Ex60 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                break;
            } else {
                words.add(word);
            }
            Collections.sort(words);
        }
        System.out.println("The alphabetical order of the words you typed: ");
        for (String typed : words) {
            System.out.println(typed);
        }
    }
}
