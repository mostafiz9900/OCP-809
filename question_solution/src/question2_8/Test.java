package question2_8;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("7 Seven", "Lucky 7", "77", "O7ne");
        list.stream().filter(str -> str.contains("7"))
                .forEach(System.out::println);
    }
}
