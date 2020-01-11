package mooc.fourthweek;

public class Ex783 {
    public static void main(String[] args) {
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes);   // the current time printed
            minutes.next();
            // advance minutes
            if(minutes.getValue() ==0){
                hours.next();
                // if minutes become zero, advance hours
            }
            i++;

        }
    }
}
