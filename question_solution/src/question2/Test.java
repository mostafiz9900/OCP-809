package question2;
import java.util.Arrays;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        String [] cities = {"Seoul", "Tokyo", "Paris", "London",
                "Hong Kong", "Singapore"};
        Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
