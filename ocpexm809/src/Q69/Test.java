package Q69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
* Answer: E, F
        */
class Person implements Comparable<Person> // line n1 @ E
{
    String name;
    Person(String name) {
        this.name = name;
    }
    // line n2 @ F
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
public class Test {
    public static void main(String[] args) {
        List<Person> emps = new ArrayList<>();
        // Added some values to emps for testing purpose
        emps.add(new Person("Bappy"));
        emps.add(new Person("Zahid"));
        emps.add(new Person("Xian"));
        emps.add(new Person("Asad"));
        Collections.sort(emps);
        // Added for testing purpose
        System.out.println(emps.get(0).name);
    }
}

//  c, d
