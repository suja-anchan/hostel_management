/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hostel_Mngmnt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Gevent {

    public Gevent() {
         JFrame frame= new JFrame("GIRLS HOSTEL");
       
        frame.setSize(1300,1000);
        JPanel panel=new JPanel();  
        panel.setLayout(null);
        frame.add(panel);
        JButton button=new JButton("MESS");
        button.setBounds(550,150,150,50);
        panel.add(button);

       
        

        JButton button2=new JButton("LAUNDRY");
        button2.setBounds(550,250,150,50);
        panel.add(button2);
        JButton button3=new JButton("STUDENT INFO");
        button3.setBounds(550,350,150,50);
        
        button3.addActionListener((ActionEvent e) -> {
            new info();
         }//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//           
//             }
         );
        
        
        
    
        panel.add(button3);
        frame.setVisible(true);
    }

    
    
}

 

// static class ActionG implements ActionListener{
//    public void actionPerformed( ActionEvent e){
//        JFrame frame3 = new JFrame("Clicked");
//            frame3.setVisible(true);
//            frame3.setSize(1300,1000);
//            JLabel label2 = new JLabel("Mess");
//            JPanel panel2=new JPanel();            
//            frame3.add(panel2);
//            panel2.add(label2);
//        
//    }
//}