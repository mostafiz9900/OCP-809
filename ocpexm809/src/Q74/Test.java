package Q74;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
      Instant loginTime= Instant.now();
//      Thread.sleep(36000);

        Instant loginOutTime= Instant.now();

        loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES);
        loginOutTime=loginOutTime.truncatedTo(ChronoUnit.MINUTES);

        if (loginTime.isBefore(loginOutTime))
            System.out.println("Logged out at: " + loginOutTime);
        else
            System.out.println("Can't logout");
    }
}
