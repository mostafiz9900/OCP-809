package com.coderbd.Q74;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) throws IOException {
        Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home")));
        files.forEach(fName -> {                 //line n1
            try {
                Path apath = fName.toAbsolutePath();     //line n2
                System.out.println(fName + ": "
                        + Files.readAttributes(apath, BasicFileAttributes.class).creationTime());
            } catch (IOException ex) {
                   ex.printStackTrace();
            }
        });
               // Ans: Confuse.............
    }
}
