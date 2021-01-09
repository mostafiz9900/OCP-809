
package com.coderbd.Q05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) throws IOException {
// A///       Stream<String> lines=Files.lines(Paths.get("custommer.txt"));
//        lines.forEach(c -> System.out.println(c));

      
     //B//      Stream<Path> stream=Files.list(Paths.get("custommer.txt"));
      //     stream.forEach(c -> System.out.println(c));
      
//C//      Stream <String> stream=Files.find(Paths.get("Customer.txt"));
//      stream.forEach((String c) -> System.out.println(c));

// D///        Stream<Path> stream=Files.find(Paths.get("custommer.txt"));
//          stream.forEach(c -> System.out.println(c));

    }
    
    // Ans: A
}
