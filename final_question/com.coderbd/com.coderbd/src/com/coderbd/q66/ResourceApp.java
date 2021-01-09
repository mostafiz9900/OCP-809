package com.coderbd.q66;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Answer: B
 */
public class ResourceApp {
    public void loadResourceBundle(){
        ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);
        System.out.println(resource.getString("hello_msg"));
    }

    public static void main(String[] args) {
        new ResourceApp().loadResourceBundle();
    }
}
