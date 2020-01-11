package mooc.fourthweek;

import java.util.ArrayList;

// Smart combining
//Create the method smartCombine that works like the previous combine method except that numbers can be on the list only once. This means that the method adds a new number to the list only if the list does not already contain that number.
public class Ex71 {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(first);
        mergedList.addAll(second);

        first.add(4);
        first.add(5);

        second.add(5);
        second.add(4);
        second.add(7);
        // System.out.println(first);
        //System.out.println(second);
        smartCombine(first, second);
        //smartCombine(mergedList, second);
        System.out.println("The list changed is: " + first);
        // System.out.println("The second list changed is: " + second);


    }

    private static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {
        for (int i = 0; i < second.size(); i++) {
            if (!first.contains(second.get(i))) {
                first.add(second.get(i));
            }
        }
    }
}
