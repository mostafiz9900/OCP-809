package com.coderbd.q39;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Answer: C
 */
public class Test {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("Susan");
        queue.add("Allen");
        queue.add("David");
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
