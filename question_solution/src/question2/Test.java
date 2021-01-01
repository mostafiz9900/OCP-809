package question2;
import java.util.Arrays;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        String [] cities = {"Seoul", "Tokyo", "Paris", "London",
                "Hong Kong", "Singapore"};
        Arrays.stream(cities).sorted((s1,s2) -> s1.compareTo(s2))
                .forEach(System.out::println);
        int arr[] = { 1, 2, 10, 4, 12 };
/*
s1 compare to s2 this is compare asc
Hong Kong
London
Paris
Seoul
Singapore
Tokyo
s2 compare to s1 this is compare desc
Tokyo
Singapore
Seoul
Paris
London
Hong Kong



 */
        // Using Arrays.stream() to convert
        // array into Stream
        IntStream stream = Arrays.stream(arr, 2, 5);
        stream.forEach(str -> System.out.print(str + " "));
    }
}
