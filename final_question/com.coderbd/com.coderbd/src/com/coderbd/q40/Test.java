package com.coderbd.q40;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Answer: A
 */
public class Test {
    public static void main(String[] args) {
        Deque<Integer> nums = new ArrayDeque<>();
        nums.add(4000);
        nums.push(3000);
        nums.add(2000);
        nums.push(1000);
        Integer i1 = nums.remove();
        Integer i2 = nums.pop();
        System.out.println(i1 + " : " + i2);
    }
}
