package question17;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.parse("11:03:15.987");
        System.out.println(t1.plus(22, ChronoUnit.HOURS)
                .equals(t1.plusHours(22)));
    }
}