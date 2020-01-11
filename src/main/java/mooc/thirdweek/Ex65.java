package mooc.thirdweek;

import java.util.ArrayList;

// The lengths of the Strings
//Create the method lengths that gets a list of String variables as a parameter and returns an ArrayList that contains the lengths of the Strings in the same order as the original list.
public class Ex65 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);
        System.out.println("The lengths of the Strings: " + lengths);
    }

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> len = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            //   list.get(i).length();
            String currentElement = list.get(i);
            Integer currentElementLength = currentElement.length();
            len.add(currentElementLength);
        }
        return len;
    }
}
