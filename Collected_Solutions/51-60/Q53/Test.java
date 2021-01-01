
package com.coderbd.Q53;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        List<String> qwords=Arrays.asList("why","what","when");
        BinaryOperator<String> operator=(s1,s2) -> s1.concat(s2);
        String sen=qwords.stream()
                .reduce("Word", operator);
                .sort()                                                     ///line n1
        System.out.println(sen);
                
    }
 ///   Ans: C
}
