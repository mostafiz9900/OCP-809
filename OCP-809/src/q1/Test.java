/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Abdullah
 */
public class Test {
    public static void main(String[] args) {
        Path iP = Paths.get("/", "First.txt");
        //Path iP = Paths.toPath("/First.txt");
        //Path iP = new Paths("/First.txt");
        System.out.println(iP);
    }
    
}
