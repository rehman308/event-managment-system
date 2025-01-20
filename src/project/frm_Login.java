package project;

import java.awt.*;
import javax.swing.*;

public class frm_Login extends javax.swing.JFrame
{
    //VARIBLES
    //person_login is for to know which login button is click on frm_Welcome so we can run query in correct table in method chk_Login in class User Login
    private String person_Login;

    //Objects for Classes
    frm_Welcome obj_Welcome;
    User_Login obj_Ulogin;
    frm_Student obj_frm_Student;
    frm_Faculty obj_frm_Faculty;

    //CONSTRUCTORS
    //Default
    public frm_Login()
    {
        initComponents();
    }

    //Userdefined
    public frm_Login(String person_Login)
    {
        try
        {
            initComponents();
            this.setTitle("Login Form");
            this.setSize(700, 700);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.scaleBckgrd();
            this.btn_Login.grabFocus();
            this.setResizable(false);
            this.setLocationRelativeTo(null);

            //sets rootPanel transparent so image can to shown and sets size of rootpanel same as JFrame
            this.rootPanel.setOpaque(false);
            this.rootPanel.setSize(this.getWidth(), this.getHeight());

            this.person_Login = person_Login;
            ptxt_UPass.setEchoChar((char) 0);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
            obj_Welcome = new frm_Welcome();
            obj_Welcome.setVisible(true);
        }
    }

    //Method to fit image to panel
    public void scaleBckgrd()
    {
        //Scaling Image for lbl_Bckgrd (Main Background)
        lbl_Bckgrd.setSize(this.getWidth(), this.getHeight());
        ImageIcon ic_Bckgrd = new ImageIcon(getClass().getResource("/resources/bck_Login.png"));
        Image img_Bckgrd = ic_Bckgrd.getImage();
        Image imgScaled_Bckgrd = img_Bckgrd.getScaledInstance(lbl_Bckgrd.getWidth(), lbl_Bckgrd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Bckgrd = new ImageIcon(imgScaled_Bckgrd);
        lbl_Bckgrd.setIcon(scaled_Bckgrd);

        //Scaling Image for btn_Back
        ImageIcon ic_Back = new ImageIcon(getClass().getResource("/resources/icon_Back.png"));
        Image img_Back = ic_Back.getImage();
        Image imgScaled_Back = img_Back.getScaledInstance(btn_Back.getWidth(), btn_Back.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Back = new ImageIcon(imgScaled_Back);
        btn_Back.setIcon(scaled_Back);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rootPanel = new javax.swing.JPanel();
        btn_Login = new javax.swing.JButton();
        txt_UName = new javax.swing.JTextField();
        btn_Back = new javax.swing.JButton();
        ptxt_UPass = new javax.swing.JPasswordField();
        ckb_Pass = new javax.swing.JCheckBox();
        lbl_Bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_Login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_LoginMouseClicked(evt);
            }
        });

        txt_UName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_UName.setForeground(new java.awt.Color(153, 153, 153));
        txt_UName.setText("   Enter User Name");
        txt_UName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                txt_UNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                txt_UNameFocusLost(evt);
            }
        });

        btn_Back.setText("Back");
        btn_Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Back.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_BackMouseClicked(evt);
            }
        });

        ptxt_UPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ptxt_UPass.setForeground(new java.awt.Color(153, 153, 153));
        ptxt_UPass.setText("   Enter Password");
        ptxt_UPass.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                ptxt_UPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                ptxt_UPassFocusLost(evt);
            }
        });

        ckb_Pass.setText("Show Password");
        ckb_Pass.setOpaque(false);
        ckb_Pass.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ckb_PassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                        .addGap(0, 238, Short.MAX_VALUE)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                                    .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(256, 256, 256))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                                    .addComponent(txt_UName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(198, 198, 198)))
                            .addComponent(ptxt_UPass, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ckb_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPanelLayout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(txt_UName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ptxt_UPass, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ckb_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getContentPane().add(rootPanel);
        rootPanel.setBounds(0, 0, 700, 700);
        getContentPane().add(lbl_Bckgrd);
        lbl_Bckgrd.setBounds(0, 0, 700, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for placeholder text on txt_UName on focus gained
    private void txt_UNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_UNameFocusGained
    {//GEN-HEADEREND:event_txt_UNameFocusGained
        if (txt_UName.getText().equals("   Enter User Name"))
        {
            txt_UName.setText("");
            txt_UName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_UNameFocusGained

    //Method for placeholder text on txt_UName on focus lost
    private void txt_UNameFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_txt_UNameFocusLost
    {//GEN-HEADEREND:event_txt_UNameFocusLost
        if (txt_UName.getText().isEmpty() || txt_UName.getText().equals(" "))
        {
            txt_UName.setText("   Enter User Name");
            txt_UName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_UNameFocusLost

    //Method for btn_Back (It takes you back to frm_Welcome)
    private void btn_BackMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_BackMouseClicked
    {//GEN-HEADEREND:event_btn_BackMouseClicked
        this.setVisible(false);
        obj_Welcome = new frm_Welcome();
        obj_Welcome.setVisible(true);
    }//GEN-LAST:event_btn_BackMouseClicked

    //Method for btn_Login (It checks user id pass by calling chk_Login method for User_Login class)
    private void btn_LoginMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_LoginMouseClicked
    {//GEN-HEADEREND:event_btn_LoginMouseClicked
        //VARIABLES
        String Uname, Upass;
        Object obj_Who;

        try
        {
            //Intializing Class
            //Sending person_login to run query on correct table
            obj_Ulogin = new User_Login(person_Login);

            //Getting String from textbox
            Uname = txt_UName.getText();
            Upass = ptxt_UPass.getText();

            obj_Who = obj_Ulogin.chk_Login(Uname, Upass);

            if (obj_Who instanceof Student)
            {
                this.dispose();
                obj_frm_Student = new frm_Student(obj_Who);
                obj_frm_Student.setVisible(true);
            }

            else if (obj_Who instanceof Faculty)
            {
                this.dispose();
                obj_frm_Faculty = new frm_Faculty(obj_Who);
                obj_frm_Faculty.setVisible(true);
            }

            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                this.txt_UName.requestFocus();
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_LoginMouseClicked

    //Method for placeholder text on txt_UPass on focus gained
    private void ptxt_UPassFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_ptxt_UPassFocusGained
    {//GEN-HEADEREND:event_ptxt_UPassFocusGained

        if (ptxt_UPass.getText().equals("   Enter Password"))
        {
            ptxt_UPass.setEchoChar('*');
            ptxt_UPass.setText("");
            ptxt_UPass.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_ptxt_UPassFocusGained

    //Method for placeholder text on txt_UPass on focus lost
    private void ptxt_UPassFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_ptxt_UPassFocusLost
    {//GEN-HEADEREND:event_ptxt_UPassFocusLost
        if (ptxt_UPass.getText().isEmpty() || ptxt_UPass.getText().equals(" "))
        {
            ptxt_UPass.setEchoChar((char) 0);
            ptxt_UPass.setText("   Enter Password");
            ptxt_UPass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_ptxt_UPassFocusLost

    //Ckb_Pass method it shows password if checkbox selected
    private void ckb_PassActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ckb_PassActionPerformed
    {//GEN-HEADEREND:event_ckb_PassActionPerformed
        //When Checkbox selected
        if (ckb_Pass.isSelected() && !ptxt_UPass.getText().equals("   Enter Password"))
        {
            ptxt_UPass.setEchoChar((char) 0);
        }

        //When Checkbox selected and field is empty
        else if (!ckb_Pass.isSelected() && !ptxt_UPass.getText().equals("   Enter Password"))
        {
            ptxt_UPass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckb_PassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Login;
    private javax.swing.JCheckBox ckb_Pass;
    private javax.swing.JLabel lbl_Bckgrd;
    private javax.swing.JPasswordField ptxt_UPass;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTextField txt_UName;
    // End of variables declaration//GEN-END:variables
}
