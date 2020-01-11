package mooc.fourthweek;

import java.util.Scanner;

public class Ex784 {
    public static void main(String[] args) {
        // Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = 20;
        System.out.print("minutes: ");
        int m = 15;
        System.out.print("hours: ");
        int h = 3;

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            // like in previous but seconds taken into account
            if (seconds.getValue() == 0) {
                minutes.next();
                // if minutes become zero, advance hours
            }
            if (minutes.getValue() == 0) {
                hours.next();
            }
            i++;
        }
    }
}
