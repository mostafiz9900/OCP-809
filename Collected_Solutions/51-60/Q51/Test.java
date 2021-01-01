
package com.coderbd.Q51;

import java.text.NumberFormat;
import java.util.Locale;


public class Test {
    public static void main(String[] args) {
        double d=15;
        Locale l=new Locale ("en","US");
        NumberFormat formatter=NumberFormat.getCurrencyInstance(l);
        System.out.println(formatter.format(d));
    }
   /// Ans: B
}
