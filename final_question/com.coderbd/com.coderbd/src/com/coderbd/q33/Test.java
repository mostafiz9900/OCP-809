package com.coderbd.q33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Answer: A
 */
public class Test {
    public static void main(String[] args) {
        /* Given the information */
        String dbURL = "dbLink";
        String userName = "an username";
        String passWord = "password";

        try {
            Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
            String query = "SELECT * FROM Employee WHERE ID = 110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Employee ID: "+ rs.next().getInt("ID"));
        } catch (Exception se) {
            System.out.println("Error");
        }
    }
}
