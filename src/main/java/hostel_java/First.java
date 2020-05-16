
package hostel_java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class First extends Frame {
 
public First(){
   
        
       
       
         JFrame frame= new JFrame("Hostel Management System");
         frame.setSize(500,400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().setBackground(Color.BLACK);
        JPanel panel=new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        frame.add(panel);
        JButton button=new JButton("GIRLS HOSTEL");
        button.setBounds(170,100,150,50);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        button.addActionListener (new Action1());
        
        JButton button2=new JButton("BOYS HOSTEL");
        button2.setBounds(170,170,150,50);
        panel.add(button2);
        button2.addActionListener (new Action2());
        
//        JButton back1=new JButton("Back");
//        back1.setBounds(10,10,100,30);
//        panel.add(back1);
//         button.addActionListener (new Action3());
        
        
        
    }

 
        
    static class Action1 implements ActionListener{
        public void actionPerformed (ActionEvent e){
            Gevent gevent = new Gevent();
        }
     
        }
         
//    static class Action3 implements ActionListener{
//        public void actionPerformed (ActionEvent evt){
//             frame.setVisible(false);
//           new Page1().setVisible(true);
//        }
//     
//        }
    
    static class Action2 implements ActionListener{
        public void actionPerformed (ActionEvent ev){
            Bevent bevent = new Bevent();
//            JFrame frame3 = new JFrame("Clicked");
//            frame3.setVisible(true);
//            frame3.setSize(1300,1000);
//            JLabel label2 = new JLabel("Boys Hostel");
//            JPanel panel2=new JPanel();
//            frame3.add(panel2);^
//            panel2.add(label2);
//            
        }  
    }
    
   
}
