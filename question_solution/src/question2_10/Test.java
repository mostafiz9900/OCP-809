package question2_10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path file = Paths.get("F:\\A\\B\\Book.java");
        System.out.println(file.toAbsolutePath());
    }
}
