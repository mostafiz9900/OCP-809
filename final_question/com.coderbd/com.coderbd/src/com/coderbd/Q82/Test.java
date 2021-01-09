
package com.coderbd.Q82;
// 1234567890

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis=new FileInputStream("version.txt");
                InputStreamReader isr=new InputStreamReader(fis);)
                BufferedReader br=new BufferedReader(isr);{
                if(br.markSupported()){
                    System.out.println((char) br.read());
                    br.mark(1);
                    System.out.println((char) br.read());
                    System.out.println((char) br.read());
                    br.reset();
                }    
            
        }catch(Exception e){
                e.printStackTrace();
                }
    }
}  //Ans: Confuse
