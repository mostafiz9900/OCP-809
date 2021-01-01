package question30;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.ofNullable(null);
        System.out.println(optional);
    }
}