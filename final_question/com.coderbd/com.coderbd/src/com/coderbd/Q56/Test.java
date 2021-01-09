
package com.coderbd.Q56;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Touhid
 */
public class Test {
    public static void main(String[] args) {
        Stream <List<String>> strs=Stream.of(Arrays.asList("text1","text2"),
                Arrays.asList("text2","Text3"));
        Stream<String> bs2=strs
                .filter(b -> b.contains("text2"))
                .flatMap(rs -> rs.stream());
        bs2.forEach(b -> System.out.print(b));
        
    }
    // Ans B
}
