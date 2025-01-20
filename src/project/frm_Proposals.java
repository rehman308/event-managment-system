package project;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class frm_Proposals extends javax.swing.JFrame
{
    //Object of class    
    frm_Faculty obj_frm_Faculty;
    frm_Des_Event obj_frm_Des_Event;

    //The passed object from frm_Faculty is checked here and then casted in to frm_Faculty object
    public frm_Proposals(Object prv_Form)
    {
        try
        {
            initComponents();
            this.setTitle("Event Proposals");
            this.setSize(600, 550);
            this.scaleBckgrd();
            this.setData();
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

            //sets rootPanel transparent so image can to shown and sets size of rootpanel same as JFrame
            this.rootPanel.setOpaque(false);
            this.rootPanel.setSize(this.getWidth(), this.getHeight());
            
            if (prv_Form != null && prv_Form instanceof frm_Faculty)
            {
                obj_frm_Faculty = (frm_Faculty) prv_Form;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Method to set background image on lbl_Bckgrd
    public void scaleBckgrd()
    {
        //Scaling Image for lbl_Bckgrd (Main Background)
        lbl_Bckgrd.setSize(this.getWidth(), this.getHeight());
        ImageIcon ic_Bckgrd = new ImageIcon(getClass().getResource("/resources/bckgrd_Student.jpg"));
        Image img_Bckgrd = ic_Bckgrd.getImage();
        Image imgScaled_Bckgrd = img_Bckgrd.getScaledInstance(lbl_Bckgrd.getWidth(), lbl_Bckgrd.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled_Bckgrd = new ImageIcon(imgScaled_Bckgrd);
        lbl_Bckgrd.setIcon(scaled_Bckgrd);
    }

    //Method to set data on text fields by fetching it from DB
    public void setData()
    {
        //CODE for fetching data from DB from tbl_Pro_Events and show on table
        //Things for DB
        //Connection_to_DB it connects to Access DB
        Connect_to_DB obj_conDB = new Connect_to_DB();
        Connection obj_con = obj_conDB.make_Connection();

        //Statement is used for updating, inserting and deleting
        Statement stmt = null;
        ResultSet res = null;
        
        try
        {
            stmt = obj_con.createStatement();
            
            String str_Data = "select * from tbl_Pro_Events";
            
            res = stmt.executeQuery(str_Data);
            
            while (res.next())
            {
                String Name = res.getString("pevnt_Name");
                String Date = res.getString("pevnt_Date");
                String Day = res.getString("pevnt_Day");                
                String Venue = res.getString("pevnt_Venue");
                String Budget = res.getString("pevnt_Budget");
                String Descript = res.getString("pevnt_Descript");
                String Club = res.getString("pevnt_Club");
                
                String table[] =
                {
                    Name, Day, Date, Venue, Budget, Descript, Club
                };
                
                DefaultTableModel tblModel = (DefaultTableModel) tbl_Pro_Events.getModel();
                tblModel.addRow(table);
            }
            
            obj_con.close();
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        //CODE for table ENDS
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Pro_Events = new javax.swing.JTable();
        btn_Close = new javax.swing.JButton();
        lbl_Bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        rootPanel.setForeground(new java.awt.Color(255, 255, 255));
        rootPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        lbl_Heading.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_Heading.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Heading.setText("Event Proposals");

        tbl_Pro_Events.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tbl_Pro_Events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Name", "Day", "Date", "Venue", "Budget", "Description", "Club"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbl_Pro_Events.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tbl_Pro_EventsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Pro_Events);
        if (tbl_Pro_Events.getColumnModel().getColumnCount() > 0)
        {
            tbl_Pro_Events.getColumnModel().getColumn(0).setResizable(false);
            tbl_Pro_Events.getColumnModel().getColumn(1).setResizable(false);
            tbl_Pro_Events.getColumnModel().getColumn(2).setResizable(false);
            tbl_Pro_Events.getColumnModel().getColumn(3).setResizable(false);
            tbl_Pro_Events.getColumnModel().getColumn(4).setResizable(false);
            tbl_Pro_Events.getColumnModel().getColumn(5).setResizable(false);
        }

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
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Close)
                    .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                        .addComponent(lbl_Heading, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Close)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);
        rootPanel.setBounds(10, 10, 580, 530);
        getContentPane().add(lbl_Bckgrd);
        lbl_Bckgrd.setBounds(0, 0, 500, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for btn_Close (it takes back to previous form i.e frm_Faculty)
    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_CloseMouseClicked
    {//GEN-HEADEREND:event_btn_CloseMouseClicked
        obj_frm_Faculty.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_CloseMouseClicked

    //Method to show row data in frm_Des_Event 
    private void tbl_Pro_EventsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tbl_Pro_EventsMouseClicked
    {//GEN-HEADEREND:event_tbl_Pro_EventsMouseClicked
        try
        {
            int index = tbl_Pro_Events.getSelectedRow();
            TableModel Model = tbl_Pro_Events.getModel();
            
            String Name = Model.getValueAt(index, 0).toString();
            String Date = Model.getValueAt(index, 1).toString();
            String Day = Model.getValueAt(index, 2).toString();
            String Venue = Model.getValueAt(index, 3).toString();
            String Budget = Model.getValueAt(index, 4).toString();
            String Descript = Model.getValueAt(index, 5).toString();
            String Club = Model.getValueAt(index, 6).toString();
            
            obj_frm_Des_Event = new frm_Des_Event();
            obj_frm_Des_Event.setVisible(true);
            
            obj_frm_Des_Event.setTxt_Name(Name);
            obj_frm_Des_Event.setTxt_Date(Date);
            obj_frm_Des_Event.setTxt_Day(Day);
            obj_frm_Des_Event.setTxt_Venue(Venue);
            obj_frm_Des_Event.setTxt_Budget(Budget);
            obj_frm_Des_Event.setTxt_Descript(Descript);
            obj_frm_Des_Event.setTxt_Club(Club);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tbl_Pro_EventsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Close;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Bckgrd;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tbl_Pro_Events;
    // End of variables declaration//GEN-END:variables
}
