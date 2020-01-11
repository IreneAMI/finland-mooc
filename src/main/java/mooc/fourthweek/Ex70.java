package mooc.fourthweek;

import java.util.ArrayList;
import java.util.Arrays;

//Combining ArrayLists
//Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) that inserts the items in a list called second to a list called first. The order of the items can be anything and the same item can appear in the list more than once.
public class Ex70 {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(first);
        mergedList.addAll(second);


        first.add(4);
        first.add(3);

        second.add(5);
        second.add(10);
        second.add(7);

        combine(first, second);

        System.out.println(first); // prints [4, 3, 5, 10, 7]

        System.out.println(second); // prints [5, 10, 7]
        combine(mergedList, second);

        System.out.println(mergedList);

    }

    private static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);

    }
}
