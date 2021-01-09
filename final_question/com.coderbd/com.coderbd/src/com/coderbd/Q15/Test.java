
package com.coderbd.Q15;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Touhid
 */
//Ans:D
public class Test {
    public static void main(String[] args) {
        //line n1
//        IntStream str=Stream.of(1,2,3,4);
//        Stream str=Stream.of(1,2,3,4);
//        DoubleStream str=Stream.of(1,2,3,4);
//        DoubleStream str=Stream.of(1,2,3,4);

IntStream str=IntStream.of(1,2,3,4);
        
        Double d=str.average().getAsDouble();
        System.out.println("Average"+d);
        
    }
    
}
