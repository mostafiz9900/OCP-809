package com.coderbd.q36;

/**
 * Answer: C
 */
public class StrMan {
    public static void doStuff(String s) {
        try {
            if (s == null) {
                throw new NullPointerException();
            }
        } finally {
            System.out.println("-finally-");
        }
    }

    public static void main(String[] args) {
        try {
            doStuff(null);
        } catch (NullPointerException npe) {
            System.out.println("-catch-");
        }
        System.out.println("-doStuff-");
    }
}
