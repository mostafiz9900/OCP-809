/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.Q03;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
public class Test{
    public static void main(String[] args) {
        Locale currentLocale= new Locale.Builder().setRegion("CA").setLanguage("en").build();
        ResourceBundle messages=ResourceBundle.getBundle("MessageBundle", currentLocale);
        Enumeration<String> names=messages.getKeys();
        while(names.hasMoreElements()){
        String key=names.nextElement();
        String name=messages.getString(key);
        System.out.println(key+" = "+name);
    }
        
    }
}
