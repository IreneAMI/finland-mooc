package mooc.fourthweek;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        Scanner reader = new Scanner(System.in);
        int variable = reader.nextInt();
    }
}

