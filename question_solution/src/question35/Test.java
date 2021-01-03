package question35;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        int res = 1;
        IntStream stream = IntStream.rangeClosed(1, 5);
        System.out.println(stream.reduce(res, (i,j) -> i*j ));
//        System.out.println(stream.reduce(1,(i,j)->i*j));
    }
}
