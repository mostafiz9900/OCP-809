package com.coderbd.q31;


import java.util.function.Function;
import java.util.function.IntConsumer;

/**
 * Answer: D
 */
public class Test {
    public static void main(String[] args) {
        IntConsumer consumer = e -> System.out.println(e);
        Integer value = 90;

        /* Inserted Code */
        Function<Integer, Integer> funRef = e -> e + 10;
        Integer result = funRef.apply(value);

        consumer.accept(result);
    }
}
