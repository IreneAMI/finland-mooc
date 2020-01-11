package mooc.thirdweek;

import java.util.ArrayList;
import java.util.Scanner;

//Is the number more than once in the list?
//Create the method moreThanOnce that gets a list of integers and an integer (i.e. number) as parameter. If the number appears on the list more than once the method returns true and otherwise false.
public class Ex68 {
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int occurence = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                occurence++;
            }
        }
        return (occurence > 1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once.");
        }
    }
}

