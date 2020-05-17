package hostel_java;

import java.sql.DriverManager;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.*;
import hostel_java.pass;

public class Bground extends javax.swing.JFrame {

    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt8 = null;
    PreparedStatement pstmt1 = null;
    PreparedStatement pstmt2 = null;
    PreparedStatement pstmt3 = null;
    PreparedStatement pstmt4 = null;
    PreparedStatement pstmt5 = null;
    PreparedStatement pstmt6 = null;
    PreparedStatement pstmt7 = null;

    public Bground() {
        pass passkey = new pass();
        initComponents();
        jTextField1.setText("Enter time");
        jToggleButton1.setText("Check");
        jTextField1.setEditable(false);
        jTextField2.setText("Enter time");
        jToggleButton2.setText("Check");
        jTextField2.setEditable(false);
        jTextField3.setText("Enter time");
        jToggleButton3.setText("Check");
        jTextField3.setEditable(false);
        jTextField4.setText("Enter time");
        jToggleButton4.setText("Check");
        jTextField4.setEditable(false);
        jTextField5.setText("Enter time");
        jToggleButton5.setText("Check");
        jTextField5.setEditable(false);
        jTextField6.setText("Enter time");
        jToggleButton6.setText("Check");
        jTextField6.setEditable(false);
        jTextField7.setText("Enter time");
        jToggleButton7.setText("Check");
        jTextField7.setEditable(false);
        jTextField8.setText("Enter time");
        jToggleButton8.setText("Check");
        jTextField8.setEditable(false);
        Connection conn = null;
        try {
            String userName = "root";
            String password = passkey.password;
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
            stmt = conn.createStatement();
            pstmt1 = conn.prepareStatement("update timer set wm1=? where wm1=?");
            pstmt8 = conn.prepareStatement("update timer set wm8=? where wm8=?");
            pstmt2 = conn.prepareStatement("update timer set wm2=? where wm2=?");
            pstmt3 = conn.prepareStatement("update timer set wm3=? where wm3=?");
            pstmt4 = conn.prepareStatement("update timer set wm4=? where wm4=?");
            pstmt5 = conn.prepareStatement("update timer set wm5=? where wm5=?");
            pstmt6 = conn.prepareStatement("update timer set wm6=? where wm6=?");
            pstmt7 = conn.prepareStatement("update timer set wm7=? where wm7=?");
            stmt.execute("use wm");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jToggleButton5 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jToggleButton6 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setText("Enter time");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("on");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel2.setText("jLabel1");

        jTextField2.setText("Enter time");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("on");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel3.setText("jLabel1");

        jTextField3.setText("Enter time");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("on");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel4.setText("jLabel1");

        jTextField4.setText("Enter time");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("on");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel5.setText("jLabel1");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel6.setText("jLabel1");

        jTextField5.setText("Enter time");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("on");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel7.setText("jLabel1");

        jTextField6.setText("Enter time");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("on");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\icons8-washing-machine-48.png")); // NOI18N
        jLabel8.setText("jLabel1");

        jTextField7.setText("Enter time");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setText("Enter time");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("on");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("on");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGap(0, 98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm1 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm1");
            if (tl == 0) {
                jTextField1.setEditable(true);
                jToggleButton1.setText("ON");
                str = jTextField1.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt1.setInt(1, n);
                pstmt1.setInt(2, 0);
                pstmt1.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton1.setText("Wait");
            jToggleButton1.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField1.setText(st);
                    jTextField1.setEditable(false);
                    try {
                        pstmt1.setInt(1, n - i);
                        pstmt1.setInt(2, n - i + 1);
                        pstmt1.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    System.out.println("started");
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField1.setText("Enter time");
                        jTextField1.setEditable(false);
                        jToggleButton1.setText("Check");
                        jToggleButton1.setEnabled(true);
                        try {
                            pstmt1.setInt(1, 0);
                            pstmt1.setInt(2, n);
                            pstmt1.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm2 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm2");
            if (tl == 0) {
                jTextField2.setEditable(true);
                jToggleButton2.setText("ON");
                str = jTextField2.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt2.setInt(1, n);
                pstmt2.setInt(2, 0);
                pstmt2.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton2.setText("Wait");
            jToggleButton2.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    System.out.println("timer tsarted");
                    String st = Integer.toString(n - i) + " min left";
                    jTextField2.setText(st);
                    jTextField2.setEditable(false);
                    try {
                        pstmt2.setInt(1, n - i);
                        pstmt2.setInt(2, n - i + 1);
                        pstmt2.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField2.setText("Enter time");
                        jTextField2.setEditable(false);
                        jToggleButton2.setText("Check");
                        jToggleButton2.setEnabled(true);
                        try {
                            pstmt2.setInt(1, 0);
                            pstmt2.setInt(2, n);
                            pstmt2.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm3 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm3");
            if (tl == 0) {
                jTextField3.setEditable(true);
                jToggleButton3.setText("ON");
                str = jTextField3.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt3.setInt(1, n);
                pstmt3.setInt(2, 0);
                pstmt3.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton3.setText("Wait");
            jToggleButton3.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField3.setText(st);
                    jTextField3.setEditable(false);
                    try {
                        pstmt3.setInt(1, n - i);
                        pstmt3.setInt(2, n - i + 1);
                        pstmt3.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField3.setText("Enter time");
                        jTextField3.setEditable(false);
                        jToggleButton3.setText("Check");
                        jToggleButton3.setEnabled(true);
                        try {
                            pstmt3.setInt(1, 0);
                            pstmt3.setInt(2, n);
                            pstmt3.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm4 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm4");
            if (tl == 0) {
                jTextField4.setEditable(true);
                jToggleButton4.setText("ON");
                str = jTextField4.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt4.setInt(1, n);
                pstmt4.setInt(2, 0);
                pstmt4.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton4.setText("Wait");
            jToggleButton4.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField4.setText(st);
                    jTextField4.setEditable(false);
                    try {
                        pstmt4.setInt(1, n - i);
                        pstmt4.setInt(2, n - i + 1);
                        pstmt4.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField4.setText("Enter time");
                        jTextField4.setEditable(false);
                        jToggleButton4.setText("Check");
                        jToggleButton4.setEnabled(true);
                        try {
                            pstmt4.setInt(1, 0);
                            pstmt4.setInt(2, n);
                            pstmt4.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm5 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm5");
            if (tl == 0) {
                jTextField5.setEditable(true);
                jToggleButton5.setText("ON");
                str = jTextField5.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt5.setInt(1, n);
                pstmt5.setInt(2, 0);
                pstmt5.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton5.setText("Wait");
            jToggleButton5.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField5.setText(st);
                    jTextField5.setEditable(false);
                    try {
                        pstmt5.setInt(1, n - i);
                        pstmt5.setInt(2, n - i + 1);
                        pstmt5.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField5.setText("Enter time");
                        jTextField5.setEditable(false);
                        jToggleButton5.setText("Check");
                        jToggleButton5.setEnabled(true);
                        try {
                            pstmt5.setInt(1, 0);
                            pstmt5.setInt(2, n);
                            pstmt5.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm6 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm6");
            if (tl == 0) {
                jTextField6.setEditable(true);
                jToggleButton6.setText("ON");
                str = jTextField6.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt6.setInt(1, n);
                pstmt6.setInt(2, 0);
                pstmt6.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton6.setText("Wait");
            jToggleButton6.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField6.setText(st);
                    jTextField6.setEditable(false);
                    try {
                        pstmt6.setInt(1, n - i);
                        pstmt6.setInt(2, n - i + 1);
                        pstmt6.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField6.setText("Enter time");
                        jTextField6.setEditable(false);
                        jToggleButton6.setText("Check");
                        jToggleButton6.setEnabled(true);
                        try {
                            pstmt6.setInt(1, 0);
                            pstmt6.setInt(2, n);
                            pstmt6.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm7 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm7");
            if (tl == 0) {
                jTextField7.setEditable(true);
                jToggleButton7.setText("ON");
                str = jTextField7.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt7.setInt(1, n);
                pstmt7.setInt(2, 0);
                pstmt7.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton7.setText("Wait");
            jToggleButton7.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField7.setText(st);
                    jTextField7.setEditable(false);
                    try {
                        pstmt7.setInt(1, n - i);
                        pstmt7.setInt(2, n - i + 1);
                        pstmt7.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField7.setText("Enter time");
                        jTextField7.setEditable(false);
                        jToggleButton7.setText("Check");
                        jToggleButton7.setEnabled(true);
                        try {
                            pstmt7.setInt(1, 0);
                            pstmt7.setInt(2, n);
                            pstmt7.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        String str;
        int n;
        int tl;
        try {
            stmt.execute("select wm8 from timer;");
            rs = stmt.getResultSet();
            rs.next();
            tl = rs.getInt("wm8");
            if (tl == 0) {
                jTextField8.setEditable(true);
                jToggleButton8.setText("ON");
                str = jTextField8.getText();
                n = Integer.parseInt(str);
                System.out.println(n);
                pstmt8.setInt(1, n);
                pstmt8.setInt(2, 0);
                pstmt8.executeUpdate();
            } else {
                n = tl;
                System.out.println(n);
            }
            jToggleButton8.setText("Wait");
            jToggleButton8.setEnabled(false);
            Timer timer = new Timer();
            TimerTask tt = new TimerTask() {
                int i = 0;

                public void run() {
                    String st = Integer.toString(n - i) + " min left";
                    jTextField8.setText(st);
                    jTextField8.setEditable(false);
                    try {
                        pstmt8.setInt(1, n - i);
                        pstmt8.setInt(2, n - i + 1);
                        pstmt8.executeUpdate();
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                    i++;
                    if (i > n) {
                        System.out.println("cancelled");
                        timer.cancel();
                        jTextField8.setText("Enter time");
                        jTextField8.setEditable(false);
                        jToggleButton8.setText("Check");
                        jToggleButton8.setEnabled(true);
                        try {
                            pstmt8.setInt(1, 0);
                            pstmt8.setInt(2, n);
                            pstmt8.executeUpdate();
                        } catch (Exception e) {
                            System.err.println(e);
                        }
                    }
                }
            ;

            };
                timer.schedule(tt, 0, 60000);

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bground().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
