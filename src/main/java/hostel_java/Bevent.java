 package hostel_java;
import javax.swing.*;



public class Bevent {

    public Bevent() {
         JFrame frame= new JFrame("BOYS HOSTEL");
       
        frame.setSize(500,400);
        JPanel panel=new JPanel();  
        panel.setLayout(null);
        frame.add(panel);
        JButton button=new JButton("MESS");
        button.setBounds(170,100,150,50);
        panel.add(button);
        
        
        JButton button2=new JButton("LAUNDRY");
        button2.setBounds(170,170,150,50);
        panel.add(button2);
//        button2.addActionListener (new First.Action2());
//        button.addActionListener (new First.Action1());
        JButton button3=new JButton("STUDENT INFO");
        button3.setBounds(170,240,150,50);
        panel.add(button3);
        frame.setVisible(true);
    }
    
}