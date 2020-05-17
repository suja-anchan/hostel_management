package hostel_java;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class Bevent {

    public Bevent() {
        JFrame frame = new JFrame("BOYS HOSTEL");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setSize(500, 400);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        JButton button = new JButton("MESS");
        button.setBounds(170, 100, 150, 50);
        panel.add(button);

        JButton button2 = new JButton("LAUNDRY");
        button2.setBounds(170, 170, 150, 50);
        panel.add(button2);
        JButton button3 = new JButton("STUDENT INFO");
        button3.setBounds(170, 240, 150, 50);

        button3.addActionListener((ActionEvent e) -> {
            new infoB();
        }
        );
        button.addActionListener((ActionEvent e) -> {
            new student().setVisible(true);

        }
        );
        button2.addActionListener((ActionEvent e) -> {
            new Bground().setVisible(true);

        }
        );

        panel.add(button3);
        frame.setVisible(true);
    }

}
