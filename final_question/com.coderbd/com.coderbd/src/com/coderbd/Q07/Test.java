
package com.coderbd.Q07;
// Given the content of resources/Manager.properties:
// great=Good Day!

import java.util.Locale;
import java.util.ResourceBundle;

//Given the content of resources/Manager_de_DE.properties:
//great=Guten Tag!

//Given the code fragment from c:\src\App.java:
public class Test {
    public static void main(String[] args) {
        Locale locale=new Locale("de","DE");
        Locale.setDefault(locale);
        ResourceBundle bundle=ResourceBundle.getBundle("/resource/Manager");   //line n1
        String msg=bundle.getString("great");
        System.out.println(msg);
    }
    
}
