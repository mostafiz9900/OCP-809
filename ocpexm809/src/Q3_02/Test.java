package Q3_02;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        /* Given the information */
        String dbURL = "dbLink";
        String userName = "an username";
        String passWord = "password";
        try {
            Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            ResultSet rs=stmt.executeQuery("select emp_id, emp_name, from employes");
            rs.absolute(-2);
            rs.moveToInsertRow();
            rs.updateInt(1, 104);
            rs.insertRow();
            rs.moveToCurrentRow();
            System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));

            System.out.println("Employee ID: "+ rs.getInt(1)+ " Employee Name : "+rs.getString(2));
        } catch (Exception se) {
            System.out.println("Error");
        }
    }
}