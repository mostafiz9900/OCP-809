package com.coderbd.q67;

/**
 * Answer B
 */

enum Course {
    JAVA(100), J2ME(150);
    private int cost;

    private Course(int c) {
        this.cost = c;
    }

    public int getCost() {
        return cost;
    }
}

public class Test {
    public static void main(String[] args) {
        for (Course a : Course.values()) {
            System.out.print(a + " Fees " + a.getCost() + " ");
        }
    }
}
