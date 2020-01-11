package mooc.firstweek;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius = keyboard.nextInt();
        double circumferince = 2 * Math.PI * radius;
        System.out.println(circumferince);
    }
}
