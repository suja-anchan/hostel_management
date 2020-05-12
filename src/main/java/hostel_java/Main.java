/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel_java;

<<<<<<< HEAD
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String args[]) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String userName = "root";
            String password = "anchan@123";
            String url = "jdbc:mysql://localhost:3306/practise";
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
            stmt = conn.createStatement();

//            stmt.execute("create table javacourse(roll integer primary key,name varchar(30),marks integer not null,grade varchar(10))");
            stmt.execute("insert into javacourse values(2,'suja',89,'A')");
            
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection termi");
                } catch (Exception e) {

                }
            }
        }
    }
}
=======
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
>>>>>>> 73ca801cdea261293291b9bc0a5088a56adc0e9f
