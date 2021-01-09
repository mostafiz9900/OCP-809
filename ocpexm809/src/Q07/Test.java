package Q07;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
 /*
    public static void main(String[] args) {
        //Locale locale=new Locale("de","DE");



        Locale.setDefault(locale);
        ResourceBundle bundle=ResourceBundle.getBundle("/resource/Manager"); //line n1
        String msg=bundle.getString("great");
        System.out.println(msg);
    }
*/

    public static void main(String[] args) {
        //Locale locale = new Locale("fr-FR");
//        Locale locale = new Locale("fr","FR");
//        Locale locale =  Locale.forLanguageTag("fr");
        Locale locale =  Locale.FRANCE;


        Locale.setDefault(locale);
        ResourceBundle boundle = ResourceBundle.getBundle("Message") ;
        System.out.println(boundle.getString("msg"));

    }
}

//I:\OCP