package com.coderbd.Q02;

interface LengthCalculator {

    public Integer getLength(String str);
}

public class Txt {
    public static void main(String[] args) {
        int res=new LengthCalculator(){
            public Integer getLength(String str){
                return str.length();
            }
        }.getLength("Hello");
    }
}
