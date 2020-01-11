package mooc.secondweek;

import java.util.Scanner;

//Many prints - the main program should ask the user how many times the text should be printed (meaning how many times the method is called).
public class Ex38 {
    public static void main(String[] args) {

        // ask the user how many times the text should be printed
        System.out.println("How many times? ");
        Scanner reader = new Scanner(System.in);
        int limit = reader.nextInt();
        int counter = 0;
        while (counter < limit) {
            counter++;
            printText();
        }
        // use the while structure to call the printText method several times
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
