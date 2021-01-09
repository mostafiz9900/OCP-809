package com.coderbd.Q60;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Touhid
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Path source=Paths.get("/data/decembar/log.txt");
        Path destination=Paths.get("/data");
        Files.copy(source, destination);
    }
    //Ans: A   NoSuchFileException is thrown at runtime
    
  //////////////  ------>>> NoSuchFileException : \data\decembar\log.txt
}
