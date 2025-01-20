package project;

import java.awt.*;
import javax.swing.*;

public class frm_Pro_Event extends javax.swing.JFrame
{
    //Variables
    Object prv_Form;

    //Object of class    
    frm_Student obj_frm_Std;
    Event obj_Event;

    public frm_Pro_Event(Object prv_Form)
    {
        initComponents();
        this.setTitle("Purpose Event Form");
        this.setSize(300, 550);
        this.scaleBckgrd();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //sets rootPanel transparent so image can to shown and sets size of rootpanel same as JFrame
        this.rootPanel.setOpaque(false);
        this.rootPanel.setSize(this.getWidth(), this.getHeight());
        
        Reset_Fields();

        try
        {
            if (prv_Form != null && prv_Form instanceof frm_Student)
            {               
                obj_frm_Std = (frm_Student) prv_Form;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Method that scales the background image to the window size.
    private void scaleBckgrd()
    {
        //Scaling Image for lbl_Bckgrd (Main Background)
        lbl_Bckgrd.setSize(this.getWidth(), this.getHeight());
        ImageIcon ic_Bckgrd = new ImageIcon(getClass().getResource("/resources/bckgrd_Student.jpg"));
        Image img_Bckgrd = ic_Bckgrd.getImage();
        Image imgScaled_Bckgrd = img_Bckgrd.getScaledInstance(lbl_Bckgrd.getWidth(), lbl_Bckgrd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Bckgrd = new ImageIcon(imgScaled_Bckgrd);
        lbl_Bckgrd.setIcon(scaled_Bckgrd);
    }

    //Method to set all text fields empty
    private void Reset_Fields()
    {
        txt_Name.setText("");
        txt_Date.setText("");
        txt_Day.setText("");
        txt_Venue.setText("");
        txt_Budget.setText("");
        txt_Descript.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        rootPanel = new javax.swing.JPanel();
        lbl_Heading = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        lbl_Descript = new javax.swing.JLabel();
        lbl_Day = new javax.swing.JLabel();
        lbl_Venue = new javax.swing.JLabel();
        lbl_Budget = new javax.swing.JLabel();
        txt_Budget = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_Date = new javax.swing.JTextField();
        txt_Day = new javax.swing.JTextField();
        txt_Venue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Descript = new javax.swing.JTextArea();
        btn_Submit = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Close = new javax.swing.JButton();
        lbl_Bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        rootPanel.setForeground(new java.awt.Color(255, 255, 255));
        rootPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        lbl_Heading.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbl_Heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Heading.setText("Propose Event");

        lbl_Name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Name.setText("Name");

        lbl_Date.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Date.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Date.setText("Date");

        lbl_Descript.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Descript.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Descript.setText("Description");

        lbl_Day.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Day.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Day.setText("Day");

        lbl_Venue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Venue.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Venue.setText("Venue");

        lbl_Budget.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_Budget.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Budget.setText("Budget");

        txt_Budget.setForeground(new java.awt.Color(0, 0, 0));
        txt_Budget.setText("jTextField1");

        txt_Name.setForeground(new java.awt.Color(0, 0, 0));
        txt_Name.setText("txt_Name");

        txt_Date.setForeground(new java.awt.Color(0, 0, 0));
        txt_Date.setText("jTextField1");

        txt_Day.setForeground(new java.awt.Color(0, 0, 0));
        txt_Day.setText("jTextField1");

        txt_Venue.setForeground(new java.awt.Color(0, 0, 0));
        txt_Venue.setText("jTextField1");

        txt_Descript.setColumns(20);
        txt_Descript.setForeground(new java.awt.Color(0, 0, 0));
        txt_Descript.setRows(5);
        jScrollPane1.setViewportView(txt_Descript);

        btn_Submit.setText("Submit");
        btn_Submit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_SubmitMouseClicked(evt);
            }
        });

        btn_Clear.setText("Clear");
        btn_Clear.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_ClearMouseClicked(evt);
            }
        });

        btn_Close.setText("Close");
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btn_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Heading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Descript)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Budget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Venue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(btn_Submit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Budget, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Descript, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Submit)
                    .addComponent(btn_Clear)
                    .addComponent(btn_Close))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);
        rootPanel.setBounds(0, 0, 300, 600);
        getContentPane().add(lbl_Bckgrd);
        lbl_Bckgrd.setBounds(0, 0, 300, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for btn_Submit (It fetches data from all text fields and pass them to method pro_Event in class Event that inserts the data in tbl_Pro_Event)
    private void btn_SubmitMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_SubmitMouseClicked
    {//GEN-HEADEREND:event_btn_SubmitMouseClicked
        //Variables
        String event, date, day, venue, budget, descript, std_Name, std_ID, std_Club;        
        
        std_Name = obj_frm_Std.getLbl_StdName();
        std_ID =  obj_frm_Std.getLbl_StdID();
        std_Club = obj_frm_Std.getLbl_Club();
        event = txt_Name.getText();
        date = txt_Date.getText();
        day = txt_Day.getText();
        venue = txt_Venue.getText();
        budget = txt_Budget.getText();
        descript = txt_Descript.getText();        

        try
        {
            if (event.isEmpty() || date.isEmpty() || day.isEmpty() || venue.isEmpty() || budget.isEmpty() || descript.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please, Enter in all fields.");
            }

            else
            {
                obj_Event = new Event();

                if (obj_Event.pro_Event(event, date, day, venue, budget, descript, std_Name, std_ID, std_Club))
                {
                    JOptionPane.showMessageDialog(null, "Event has been proposed.\nKindly wait for supervisor to approve.");
                    this.dispose();
                    obj_frm_Std.setVisible(true);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_SubmitMouseClicked

    //Method for btn_Clear (It clears all text fields
    private void btn_ClearMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_ClearMouseClicked
    {//GEN-HEADEREND:event_btn_ClearMouseClicked
        Reset_Fields();
    }//GEN-LAST:event_btn_ClearMouseClicked

    //Method for btn_Close (it takes to previous form
    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_CloseMouseClicked
    {//GEN-HEADEREND:event_btn_CloseMouseClicked
        obj_frm_Std.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CloseMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Close;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bckgrd;
    private javax.swing.JLabel lbl_Budget;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Day;
    private javax.swing.JLabel lbl_Descript;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Venue;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTextField txt_Budget;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_Day;
    private javax.swing.JTextArea txt_Descript;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Venue;
    // End of variables declaration//GEN-END:variables
}
