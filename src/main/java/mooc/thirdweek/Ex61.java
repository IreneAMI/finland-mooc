package mooc.thirdweek;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

//Amount of items in a list
//Create the method public static int countItems(ArrayList<String> list) that returns the number of the items in the list.

public class Ex61 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
        System.out.println("Now, there are this many items in the list:");
        removeFirst(list);
        System.out.println(countItems(list));
    }

    private static int countItems(List<String> list) {
        return list.size();
    }

//Inside the method, it is possible to influence the items in the parameter list. In the following example, the method removeFirst --as the name suggests-- removes the first string from the list.
//What would happen if the list was empty?

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);  // removes the first item (indexed 0)
    }
}