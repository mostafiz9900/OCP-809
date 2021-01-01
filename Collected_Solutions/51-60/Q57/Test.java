
package com.coderbd.Q57;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> prices=Arrays.asList(3,4,5);
        prices.stream()
                .filter(e -> e > 4)
                .peek(e -> System.out.print("Price "+e))                  ////line n1
                .map(n -> n-1)                                            //line n2
                .forEach(n -> System.out.println(" New Price " + n));       //line n3
    }
   //Ans D 
}
