package mooc.secondweek;

import java.util.Scanner;
//Sum of the powers
public class Ex35 {
    public static void main(String[] args) {
        System.out.println("Introduce the number: ");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        System.out.println("Introduce the power: ");
        int power = reader.nextInt();
        Math.pow(number, power);
        int result = (int)Math.pow(number, power); //command returns a number of double type (i.e. floating point number).
        // A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3).
        System.out.println("The result is: ");
        System.out.println(result);
    }
}

