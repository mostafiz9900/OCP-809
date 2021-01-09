package com.coderbd.Q72;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Touhid
 */
public class Test {
    static String dbURL;
    static String passWord;
    static String userName;
    public static void main(String[] args) throws SQLException {
        Connection conn=DriverManager.getConnection(dbURL,userName,passWord);
        Statement st=conn.createStatement();
        String query="DELETE FROM Student WHERE id=103";
        System.out.println("Status: "+st.execute(query));
    }
    ////Ans:B
}
