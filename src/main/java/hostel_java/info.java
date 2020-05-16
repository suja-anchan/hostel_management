
package hostel_java;

import hostel_java.pass;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class info implements ActionListener{ 
JFrame frame,frame1;
JTextField textbox;
JLabel label;
JLabel label2;
JButton button;
JButton button2;
JPanel panel;
static JTable table;
Connection con=null;

pass passkey=new pass();
String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/hostel_mngmnt";
String userName = "root";
String password = passkey.password;
String[] columnNames = {"USN", "Room no","Block", "Name","Branch", "Phone no","State"};
info()
{
frame = new JFrame("Student Info");
frame.setLayout(null);
textbox = new JTextField();
textbox.setBounds(150,30,150,20); 
label = new JLabel("Enter the Room No");
label.setBounds(10, 30, 220, 20);
button = new JButton("search");
button.setBounds(150,60,100,30);
button.addActionListener(this);
label2= new JLabel(" To view information of all the students");
label2.setBounds(10, 190, 250, 30);
button2=new JButton("CLICK HERE");
button2.addActionListener(new Action());
button2.setBounds(140,230,120,30);
        
frame.add(textbox);
frame.add(label);
frame.add(button);
frame.add(label2);
frame.add(button2);
frame.setVisible(true);
frame.setSize(500, 400); 
} 

 static class Action implements ActionListener{
        public void actionPerformed (ActionEvent e){
           new AllInfo();
           
        }
     
        }

public void actionPerformed(ActionEvent ae)
{
button = (JButton)ae.getSource();
System.out.println("Showing Table Data.......");
showTableData(); 
} 


public void showTableData()
{

frame1 = new JFrame("Student Data");

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
String textvalue = textbox.getText();
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
String sql = "select * from girls_hostel1 where Room_no ="+textvalue;
       
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
frame1.add(scroll);
frame1.setVisible(true);
frame1.setSize(400,300);
}
}




        


