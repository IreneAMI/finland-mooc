package mooc.secondweek;

//40.1 a method printWhitespaces(int size) that prints the given amount of whitespaces.
//40.2 Printing a right-aligned triangle(Triangle2)
//40.3 Printing a Christmas Tree - the method xmasTree(int height) that prints a Christmas tree using the mehtods printWhitespaces and printStars.
public class Ex40 {

    private static void printStars(int amount) {
        for (int i = amount; i >= 1; i--) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printWhitespaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }

    private static void printTriangle2(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    private static void xmasTree(int height) {
        int stars = 1;
        for (int i = 1; i <= height; i++) {
            printWhitespaces(height - i);
            printStars(stars);
            stars = stars + 2;
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        //printStars(4);
        // printWhitespaces(5);
        // System.out.println();
        // printTriangle2(4);
        // printTriangle(4);
        xmasTree(10);
    }
}

