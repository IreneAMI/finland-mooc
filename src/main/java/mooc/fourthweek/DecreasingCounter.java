package mooc.fourthweek;

public class DecreasingCounter {
    private int value; // object variable that remembers the value of the counter
    int originalValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        originalValue = this.value;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value != 0) {
            value = value - 1; // here the code that decrements the value of counter by one

        }
    }

    // and here the rest of the methods
    public void reset() {
        value = 0;
    }

    public void setInitial() {
        value = originalValue;
    }
}

