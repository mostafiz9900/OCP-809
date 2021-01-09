
package com.coderbd.Q11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Ans: A
public class Candidate {
    int id;
    String name;
    int age;
    String city;

    public Candidate(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public static void main(String[] args) {
        List<Candidate> candiList=new ArrayList<>();
      //A/// Double s1=candiList.stream().filter(s -> s.city.equals("NewYork")).collect(Collectors.averagingInt(s -> s.age));
//        System.out.println(s1);
 //B//       Double s1=candiList.stream().map(mapper s -> s.city).filter(s -> s.equals("Newyork"));
//   C//     Double s1=candiList.stream().map( s ->s.city).filter(s->s.equals("Newyork")).collect(Collectors.average()).toDouble();
//D/ Double s1=candiList.stream().filter(s->s.equals("NewYoork")).map(c->c.age).average();
    }
}
