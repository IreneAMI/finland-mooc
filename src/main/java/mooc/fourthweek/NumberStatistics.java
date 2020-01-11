package mooc.fourthweek;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    private double average;

    public NumberStatistics() {
        amountOfNumbers = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        sum = sum + number;
        amountOfNumbers++;

    }

    public int amountOfNumbers() {

        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (amountOfNumbers > 0) {
            average = (double) sum / amountOfNumbers;
        }
        return average;
    }
}
