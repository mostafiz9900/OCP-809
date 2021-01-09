package com.coderbd.q35;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Answer: C
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);

        // line n1
        Stream.of(list1, list2)
                .flatMap(list -> list.stream())
                .forEach(s -> System.out.println(s + " "));
    }
}
