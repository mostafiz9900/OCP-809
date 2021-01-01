/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8;

import java.util.stream.Stream;

/**
 *
 * @author Abdullah
 */
public class Test {
            public static void main(String[ ] args) {
                Stream.of("Java","Unix","Linux")
                .filter(s->s.contains("n"))
                .peek(s->System.out.println("PEEK: "+ s))
                //.noneMatch();
                //.allMatch();
                //.anyMatch();
                .findAny();
                //.findFirst();
                
    }
}
