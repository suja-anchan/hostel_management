
package hostel_java;

import static hostel_java.info.table;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class AllInfo {
    JFrame frame2;

Connection con=null;

pass passkey=new pass();
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/wm";
String userName = "root";
String password = passkey.password;
String[] columnNames = {"USN", "Room no","Block", "Name","Branch", "Phone no","State"};
    public AllInfo() {
 frame2 = new JFrame("Student Data");
 frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame2.setLayout(new BorderLayout()); 

//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 

String usn= "";
String room= "";
String block= "";
String nam = "";
String branch = "";
String phno="";
String state = "";

try
{ 
//Class.forName(driverName); 
  Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
   con = DriverManager.getConnection(url, userName, password);
//Connection con = DriverManager.getConnection(url, userName, password);
String sql = "select * from girls_hostel1 ";
       
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
usn = rs.getString("USN");
room= rs.getString("Room_no");
block= rs.getString("Block");
 nam= rs.getString("Name");
branch=rs.getString("Branch");
phno= rs.getString("Ph_no"); 
state= rs.getString("State");

model.addRow(new Object[]{usn, room,block, nam, branch, phno,state});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame2.add(scroll);
frame2.setVisible(true);
frame2.setSize(400,300);
}
        }     
        
 
    

