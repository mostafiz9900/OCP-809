
package com.coderbd.Q73;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(10,20,30);
        Function<Integer, Integer> fn= f1 -> f1+10;
        Consumer<Integer> conVal= s -> System.out.print("Val:"+s+" ");  
         li.stream().map(fn).forEach(conVal);
        
    }
    ///Ans:D
}
