package com.coderbd.Q83;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 *
 * @author Touhid
 */
public class Test {

    public static void main(String[] args) {
        Map<Integer, Integer> mVal = new HashMap<>();
        mVal.put(1, 10);
        mVal.put(2, 20);
        //line n1
//        BiConsumer<Integer,Integer,String> c=(i,j)-> {
//            System.out.println(i+", "+j+";");
//        };
//       BiFunction<Integer,Integer,String> c = (i,j)->{
//           System.out.println(i+", "+j+"; ")
//       };
BiConsumer<Integer,Integer> c = (i,j)->{
           System.out.println(i+", "+j+"; ");
       };
//BiConsumer<Integer,Integer,Integer> c = (i,j)->{
//           System.out.println(i+", "+j+"; ");
//       };
        c.accept(1, 2);
        mVal.forEach(c);

    }
    //Ans: C
}
