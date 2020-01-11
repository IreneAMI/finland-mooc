package mooc.fourthweek;

/*Implement the class Multiplier that has:
a constructor public Multiplier(int number).
a method public int multiply(int otherNumber) that returns otherNumber multiplied by number (i.e., the constructor parameter).*/
public class Ex74 {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier(5);
        int multiply = multiplier.multiply(5);
        System.out.println(multiply);
    }
}
