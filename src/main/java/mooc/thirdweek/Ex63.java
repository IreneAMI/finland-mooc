package mooc.thirdweek;

import java.util.ArrayList;

//Sum of the numbers
//Create the method sum, which receives a list of numbers (ArrayList<Integer>) as a parameter and then calculates the sum of the items in that list.
public class Ex63 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum is: " + sum(list));

        list.add(10);

        System.out.println("The sum is now: " + sum(list));
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}