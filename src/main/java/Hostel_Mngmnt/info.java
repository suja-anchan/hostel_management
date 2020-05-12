
package Hostel_Mngmnt;



import java.sql.*;
import javax.swing.*;


public class info {

    public info() {
         JFrame frame3 = new JFrame("Clicked");
            frame3.setVisible(true);
            frame3.setSize(1300,1000);
            JLabel label2 = new JLabel("Student info");
            JPanel panel2=new JPanel();
            frame3.add(panel2);
            panel2.add(label2);
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String userName = "root";
            String password = "anchan@123";
            String url = "jdbc:mysql://localhost:3306/hostel_mngmnt";
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
            stmt = conn.createStatement();
            stmt.execute("select * from Girls_hostel");
            

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
    

