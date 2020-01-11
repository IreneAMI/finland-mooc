package mooc.thirdweek;

//Greatest
//Create the method greatest, which gets three integers as parameters and then returns the greatest of them.
public class Ex45 {
    public static int greatest(int number1, int number2, int number3) {
        int greatest = -1;
        if (number1 >= number2 && number1 >= number3) {
            greatest = number1;
        }
        if (number2 >= number1 && number2 >= number3) {
            greatest = number2;
        }
        if (number3 >= number1 && number3 >= number2) {
            greatest = number3;
        } else {
            System.out.println("The numbers are equal!");
        }


        return greatest;
    }

    public static void main(String[] args) {
        int answer = greatest(9, 8, 11);
        System.out.println("Greatest: " + answer);
    }
}
