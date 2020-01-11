package mooc.secondweek;

//39.1 a method printStars that prints the given amount of stars and a line break
public class Ex39 {
    private static void printStars(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //39.2 a method printSquare(int sideSize) that prints a square using our previous method printStars.
    private static void printSquare(int sideSize) {
        for (int i = 1; i <= sideSize; i++) {
            printStars(4);
        }
    }

    //39.3 a method printRectangle(int width, int height) that prints a rectangle using the printStars method.

    private static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
        }
    }

    //39.4 a method printTriangle(int size) that prints a triangle using the printStars method.
    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    public static void main(String[] args) {
        //printStars(5);
        //printStars(3);
        //printStars(9);
        //printSquare(4);
        //printRectangle(17, 3);
        printTriangle(5);
    }
}
