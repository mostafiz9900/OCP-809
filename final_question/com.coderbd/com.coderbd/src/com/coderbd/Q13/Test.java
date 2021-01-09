
package com.coderbd.Q13;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.MINUTES;

public class Test {
    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        long timeToBreakfast=0;
        LocalTime office_start=LocalTime.of(6, 30);
        if(office_start.isAfter(now)){
            timeToBreakfast=now.until(office_start, MINUTES);
        }else{
            timeToBreakfast=now.until(office_start,HOURS);
        }
        System.out.println(timeToBreakfast);
        
    }
    public static TimeUnit MINUTES1;
    
}
