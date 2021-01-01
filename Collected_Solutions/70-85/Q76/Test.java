package com.coderbd.Q76;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("data.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("alldata.txt"));
        String line=null;
        while((line=br.readLine()) !=null){
            bw.append(line + "\n");
        }
        //A bw.flush();
      //B  br.close();
     //C  br.flush();
     //bw.writeln();
        //line n1
    }
}//       Ans: confuse
