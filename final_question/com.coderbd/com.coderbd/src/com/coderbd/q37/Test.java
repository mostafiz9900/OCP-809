package com.coderbd.q37;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Answer: C
 */
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Person> sts = Arrays.asList(
                new Person("Jack", 30),
                new Person("Mike Hill", 21),
                new Person("Thomas Hill", 24));
        Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 20);
        long count = resList.filter(s -> s.getName().contains("Hill")).count();
        System.out.print(count);
    }
}
