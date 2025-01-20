package project;

import java.sql.*;
import javax.swing.*;

public class Faculty extends University_User
{
    //VARIABLES
    private String design;
    
    //Things for DB
    //Connection_to_DB it connects to Access DB
    Connect_to_DB obj_conDB = new Connect_to_DB();
    Connection obj_con = obj_conDB.make_Connection();    
    
    //Statement is used for updating, inserting and deleting
    Statement stmt = null;

    //PreparedStatement and ResultSet are used for selecting data
    PreparedStatement pre_stmt = null;
    ResultSet res = null;
    
    //CONSTRUCTORS
    //Default
    public Faculty(){};
    
    //User defined
    public Faculty(String id, String name, String username, String contact, String email, String dept, String design)
    {
        super(id, name, username, contact, email, dept);
        this.design = design;
    }
    
    //SETTER GETTERS
    //Getter for design
    public String getDesign()
    {
        return design;
    }
    
    //Setter for design
    public void setDesign(String design)
    {
        this.design = design;
    }
    
    //Method to get data from database tbl_Faculty_Data
    //The data will be used in frm_Faculty
    public void getData_Faculty()
    {         
        String str_Data = "select * from tbl_Faculty_Data where f_UserName='" + this.getUserName() + "'";

        try
        {
            pre_stmt = obj_con.prepareStatement(str_Data);
            res = pre_stmt.executeQuery();

            while (res.next())
            {
                this.setId(res.getString("f_ID"));
                this.setName(res.getString("f_Name"));
                this.setContact(res.getString("f_Contact"));
                this.setEmail(res.getString("f_Email"));               
                this.setDept(res.getString("f_Dept"));                
                this.design = res.getString("f_Design");
            }
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
    }
}