/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author Abdullah
 */
public class Test {
    Properties connectionProps = new Properties();
    connectionProps.setProperty("password", "scott");
    connectionProps.setProperty("user", "tiger");
    
    try{
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/EmployeeDB", connectionProps);
        stmt = con.createStatement();
        rs = stmt.executeQuery("select emp_name from employee");
    }catch (SQLException ex){
            System.out.println(ex);
    }finally {
        rs.close();
        stmt.close();
        con.close();
}
    
}
