
package com.coderbd.Q17;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Touhid
 */
public class Test {
    public static void main(String[] args)throws SQLException {
        //code to go here and regidter valid jdbc driver go here
        Connection con=DriverManager.getConnection(url, username, password);
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        st.execute("SELECT * FROM student");
        ResultSet rs=st.getResultSet();
        rs.absolute(3);
        rs.moveToInsertRow();
        rs.updateInt(1, 113);
        rs.updateString(2, "Jannet");
        rs.updateString(3, "jannet@uni.com");
        rs.insertRow();
        System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
    }
    
}
