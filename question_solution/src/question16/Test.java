package question16;
import java.time.*;

public class Test {
    public static void main(String [] args) {
        LocalTime t1 = LocalTime.now();
        LocalDateTime t2 = LocalDateTime.now();
        System.out.println(Duration.between(t2, t1));
    }
}
