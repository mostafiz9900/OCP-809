package question19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("F:");
        BiPredicate<Path, BasicFileAttributes> predicate = (p,a) -> p.toString().endsWith("txt");
        try(Stream<Path> paths = Files.find(root, 2, predicate))
        {
            paths.forEach(System.out::println);
        }
    }
}