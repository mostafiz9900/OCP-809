package com.coderbd.Q84;

public class Product {
    String pname;
    public Product(String pname){
        this.pname=pname;
    }
    public static void main(String[] args) {
        Product p1=new Product("PowerCharacter");
        Product p2=p1;
        Product p3=new Product("PowerCharger");
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p2));
    }
    
}
