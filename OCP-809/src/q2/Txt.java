/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author Abdullah
 */

import java.util.function.Supplier;
    
public class Txt {
    public static void main(String[] args) {
        int res = new LengthCalculator(){
            public Integer getLength(String str){
                //System.out.println(str.length());
                return str.length();
            }
        }.getLength("Hello");
    }
}

// Ans is B from online
