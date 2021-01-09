
package com.coderbd.Q06;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws SQLException {
        Properties connectionProps=new Properties();
        connectionProps.setProperty("password", "scot");
        connectionProps.setProperty("user", "tiger");
        try{
            con=DriverManager.getConnection("jdc:derby://localhost:1527/EmployeeDB", connectionProps);
            stmt=con.createStatement();
            rs=stmt.executeQuery("select emp_name from employee");
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            rs.close();
            stmt.close();
            con.close();
        }
                
    }
}
