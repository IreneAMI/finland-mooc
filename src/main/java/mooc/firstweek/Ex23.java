package mooc.firstweek;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            double temperature = Double.parseDouble(keyboard.nextLine());
            if (!(temperature < -30 || temperature > 40)) {
                Graph.addNumber(temperature);
            }
        }
    }
}
