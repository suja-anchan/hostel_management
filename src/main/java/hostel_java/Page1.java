package hostel_java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page1 extends Frame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hostel Management System");
        frame.setSize(500, 400);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        frame.add(panel);
        JButton button = new JButton("STUDENT");
        button.setBounds(170, 100, 150, 50);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        button.addActionListener(new Action1());

        JButton button2 = new JButton("ADMIN");
        button2.setBounds(170, 170, 150, 50);
        panel.add(button2);
        button2.addActionListener(new Action2());

    }

    static class Action1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            new First();
        }

    }

    static class Action2 implements ActionListener {

        public void actionPerformed(ActionEvent ev) {
            new login().setVisible(true);

        }
    }

}
