package mooc.thirdweek;

import java.util.ArrayList;
import java.util.List;

//Remove last
//Create the method public static void removeLast(ArrayList<String> list), which removes the last item from the list.
public class Ex62 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
        System.out.println("Now, there are this many items in the list:");
        removeLast(list);
    }

    private static int countItems(List<String> list) {
        return list.size();
    }

    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size() - 1);
    }
}
