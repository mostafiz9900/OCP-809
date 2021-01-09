
package com.coderbd.Q16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Touhid
 */

//Ans: A
public class Test {
    public static void main(String[] args) {
        List<String> lst1=Arrays.asList("A1","B1");
        List<String> lst2=Arrays.asList("A2","B1");
        
// A       Stream.of(lst1,lst2)
//                .map(s->s)
//                .filter(s->s.contains("A"))
//                .sorted().forEach(s-> System.out.print(s+" "));
//   B     Stream.of(lst1,lst2)
//                .flatMap()
//                .filter(s->s.contains("A"))
//                .sorted().forEach(s-> System.out.print(s+" "));
                Stream.of(lst1,lst2)
                .flatMap(list->list.stream())
                .filter(s->s.contains("A"))
                .sorted().forEach(s-> System.out.print(s+" "));
        
    }
    
}
