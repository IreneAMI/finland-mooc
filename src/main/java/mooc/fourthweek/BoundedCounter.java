package mooc.fourthweek;

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    //The method should set the value of the parameter to the counter unless the parameter is less than zero or larger than the upper bound. In those cases, the method does not have any effect.
    public void setValue(int value) {
        if (value >= 0 || value < upperLimit)
            this.value = value;
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return String.valueOf(value);
    }
}
