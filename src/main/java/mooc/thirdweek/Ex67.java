package mooc.thirdweek;

import java.util.ArrayList;

public class Ex67 {
    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        double avg = average(list);
        for (int i = 0; i < list.size(); i++) {
            variance = variance + Math.pow(list.get(i) - avg, 2);
        }
        return variance / (list.size() - 1);
    }

    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
            average = (sum / list.size());
        }
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}

