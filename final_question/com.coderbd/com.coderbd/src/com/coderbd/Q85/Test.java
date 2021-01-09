package com.coderbd.Q85;
///      /company/emp/info.txt
///      /company/emp/benefits/bl.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {
    
    public static void main(String[] args) {
        Stream<Path> Stream =Files.walk(Paths.get("/company"));
    }
    // Ans: confuse
}
