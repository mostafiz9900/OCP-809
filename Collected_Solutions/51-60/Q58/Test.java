package com.coderbd.Q58;

import java.util.Optional;

public class Test {
    public static Optional<String> getCountry(String loc){
        Optional<String> couName=Optional.empty();
        if("Paris".equals(loc)){
            couName=Optional.of("France");
        }else if("Mumbai".equals(loc))
        {
            couName=Optional.of("India");
        }
        
        return couName;
    }
    public static void main(String[] args) {
        Optional<String> city1 = getCountry("Paris"); 
        Optional<String> city2 = getCountry("Las Vegas"); 
        System.out.println(city1);
        if(city1.isPresent()){
            city2.ifPresent(x -> System.out.println(x));
        }else{
            System.out.println(city2.orElse("Not Found"));
        }
    }
  //  Ans: Confuse A
}
