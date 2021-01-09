
package com.coderbd.Q52;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Connection con=null;
        try{
            // line n1
      //A//      con=DriverManager.getConnection(username,password,dbURL);
      
//  B///           Properties prop=new Properties();
//                 prop.put("userid", userName);
//                 prop.put("Password", password);
//                 prop.put("url", dbURL);
//                 con=DriverManager.getConnection(prop);


//   C//               con=DriverManager.getConnection(dbURL);
//                  con.setClientInfo("user",userName);
//                  con.setClientInfo("password",password);
//                 
//   D//                 Properties prop=new Properties();
//                    prop.put("user", userName);
//                    prop.put("password", password);
            if(con!=null){
                System.out.println("Connection Established.");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
