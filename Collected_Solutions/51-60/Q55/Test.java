
package com.coderbd.Q55;

import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        final String str1="Java";
        String str2="Course";
        UnaryOperator<String> u=(str) -> str1.concat(str);      //line n1
        UnaryOperator<String> c=(str3) -> str3.toLowerCase();
        System.out.println(u.apply(c.apply(strBuf)));         // line n2
    }
    ///// Ans: D
}
