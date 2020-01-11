package mooc.secondweek;

import java.util.Scanner;

//Loops, ending and remembering - 36.1 Reading numbers
public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type numbers: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        float sum = 0; //// i made sum float type to avoid confusion in program and recognize the result
        int counter = 0;
        int counterEven = 0;
        int counterOdd = 0;
        float average;
        while (!(number == -1)) {
            sum = sum + number;
            counter++;
            average = sum / counter;
            number = reader.nextInt();
            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is: " + sum); //36.2 The sum of the numbers- print the sum of the numbers entered by the user (without the number -1)
                System.out.println("How many numbers: " + counter); //36.3 Summing and counting the numbers- the program should print how many numbers the user typed (without the number -1).
                System.out.println("Average: " + average); //36.4 Counting the average -the program should print the average of the numbers the user typed (without the number -1).
                System.out.println("Even numbers: " + counterEven);
                System.out.println("Odd numbers: " + counterOdd); // 36.5 Even and odd numbers - the program should print the number of even and odd numbers that the user typed (without the number -1).
            }
        }
    }
}


