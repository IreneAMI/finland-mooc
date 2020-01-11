package mooc.thirdweek;

//Average of given numbers
//method average, which calculates the average of the numbers it gets as parameters. Inside the method you should use the method sum as a helper!
public class Ex46 {
    public static double average(int number1, int number2, int number3, int number4) {
        return(number1 + number2 + number3 + number4) / 4d;
    }

    public static void main(String[] args) {
        double answer = average(1, 3, 6, 1);
        System.out.println("average: " + answer);
    }

}
