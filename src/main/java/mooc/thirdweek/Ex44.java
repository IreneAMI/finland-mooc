package mooc.thirdweek;

//Least
//Create the method least, which returns the least of the numbers given as parameters.
public class Ex44 {
    public static int least(int number1, int number2) {
        int least;
        if (number1 > number2) {
            least = number2;
        } else {
            least = number1;
            System.out.println("The numbers are equals!");
        }
        return least;
    }

    public static void main(String[] args) {
        int answer = least(7, 7);
        System.out.println("Least: " + answer);
    }

}
