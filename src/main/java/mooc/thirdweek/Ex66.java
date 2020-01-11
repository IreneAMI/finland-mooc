package mooc.thirdweek;

import java.util.ArrayList;

//The Greatest
//Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter and then returns the greatest number in the list as a return value.
public class Ex66 {
    public static int greatest(ArrayList<Integer> list) {
        int greatest = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                greatest = list.get(i + 1);
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

}
