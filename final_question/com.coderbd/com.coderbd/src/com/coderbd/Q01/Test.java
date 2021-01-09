
package com.coderbd.Q01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        
        //line n1
   //A   Path ip=Paths.get("/", "First.txt");
      Path ip=Paths.get("/First.txt");
      //B  Path ip=Paths.toPath("/First.txt");
      //C  Path ip=new Paths("/First.txt");
      //D  Path ip=new Path("/First.txt");
  
        System.out.println(ip);
    }
 
}
