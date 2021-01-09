package Q2_70;


import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
  LocalDate valentinesDay= LocalDate.of(2015, Month.FEBRUARY,14);
  LocalDate next15Days=valentinesDay.plusDays(15);
  LocalDate nextYear=next15Days.plusYears(1);
        System.out.println(nextYear);
    }

}

//I:\OCP