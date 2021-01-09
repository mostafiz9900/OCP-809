package Q2_74;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Test {
    public static void main(String[] args) throws IOException {
        Path source= Paths.get("/data/decembar/log.txt");
        Path destination=Paths.get("/data");
        Files.copy(source, destination);
    }
    //Ans: A NoSuchFileException is thrown at runtime

    ////////////// ------>>> NoSuchFileException : \data\decembar\log.txt
}

//I:\OCP