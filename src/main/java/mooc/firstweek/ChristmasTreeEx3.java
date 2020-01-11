package mooc.firstweek;

public class ChristmasTreeEx3 {
    public static void main(String[] args) {
        int treesize = 10;
        int spaces = treesize;
        int stars = 1;

        //todo determine value of spaces based on treesize.
        for (int i = 0; i < treesize; i++) {
            for (int j = spaces; j >= 0; j--) {
                System.out.print(" ");
            }
            spaces = spaces - 1;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            stars = stars + 2;
            System.out.println();
        }
        //TODO add for in order to create dynamic number of spaces
        for (int l = 0; l < treesize; l++) {
            System.out.print(" ");
        }System.out.print("*");
    }
}
