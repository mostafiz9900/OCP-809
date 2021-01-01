
package com.coderbd.Q70;
class Resource implements AutoCloseable{
    public void close()throws Exception{
        System.out.println("Close-");
    }
    public void open(){
        System.out.println("Open-");
    }
}
public class Test {
    public static void main(String[] args) {
        Resource res1=new Resource();
        try{
            res1.open();
            res1.close();
        }catch(Exception e){
            System.out.println("Exception -1");
        }
        try(res1=new Resource()){                              //line n1
            res1.open();
        }catch(Exception e){
            System.out.println("Exception -2");
        }
        
        //// Ans: D   ---> A compilation Error Occurs at line n1 
    }
    
}
