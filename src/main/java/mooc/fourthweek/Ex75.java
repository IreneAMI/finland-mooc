package mooc.fourthweek;

//Decreasing counter
//The starting point of this exercise is a partially implemented class DecreasingCounter:
//The constructor of DecreasingCounter receives as parameter the initial value of the counter. In the example, the constructor parameter is 10, which is then set to the object variable this.value. The value of the counter can be printed with the method printValue(). The method decrease() should decrease the value of the counter by one.
public class Ex75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
