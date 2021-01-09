
package com.coderbd.Q12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Touhid
 */
public class Candy implements Comparable<Candy> {

   String falovour;
   String color;

    public Candy(String falovour, String color) {
        this.falovour = falovour;
        this.color = color;
    }
   @Override
   public boolean equals (Object obj){
   final Candy other=(Candy)(Candy) obj;
       String flavour = null;
       //boolean flavour = false;
   if (flavour==other.falovour){
    return true;
}
   return false;
   }
   @Override
   public int compareTo(Candy o){
       return this.color.compareTo(o.color);
   }
    public static void main(String[] args) {
        List<Candy> candies= new ArrayList<>();
        candies.add(new Candy("orange","orange"));
        candies.add(new Candy("lemon","yellow"));
        candies.add(new Candy("blueberry","blue"));
        candies.add(new Candy("black corrent","cyan"));
        Collections.sort(candies);
        System.out.println(candies);
        
    }
    
}
