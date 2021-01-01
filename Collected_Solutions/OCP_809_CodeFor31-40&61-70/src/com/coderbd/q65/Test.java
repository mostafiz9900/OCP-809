package com.coderbd.q65;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Answer: B
 */
public class Test {
    public static void main(String[] args) {
        Locale currentLocale;
        currentLocale = new Locale.Builder().setLanguage("de").setRegion("DE").build();
        ResourceBundle messages = ResourceBundle.getBundle("MessageBundle", currentLocale);
        System.out.println(messages.getString("inquiry"));
    }
}
