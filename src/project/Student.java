package project;

import java.sql.*;
import javax.swing.*;

public class Student extends University_User
{
    //VARIABLES
    private String section, semster, club;  
    
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
    public Student(){};
    
    //User defined
    public Student(String id, String name, String username, String contact, String email, String dept, String club, String section, String semster)
    {
        super(id, name, username, contact, email, dept);
        this.section = section;
        this.semster = semster;
        this.club = club;
    }

    //SETTER GETTERS
    //Getter for Section
    public String getSection()
    {
        return section;
    }

    //Setter for Section
    public void setSection(String section)
    {
        this.section = section;
    }

    //Getter for Semster
    public String getSemster()
    {
        return semster;
    }

    //Setter for Semster
    public void setSemster(String semster)
    {
        this.semster = semster;
    }
    
    //Getter for club
    public String getClub()
    {
        return this.club;
    }

    //Setter for club
    public void setClub(String club)
    {
        this.club = club;
    }
    //Method to get data from database tbl_Std_Data
    //The data will be used in frm_Student
    public void getData_Std()
    {         
        String str_Data = "select * from tbl_Std_Data where stdUserName='" + this.getUserName() + "'";

        try
        {
            pre_stmt = obj_con.prepareStatement(str_Data);
            res = pre_stmt.executeQuery();

            while (res.next())
            {
                this.setId(res.getString("stdID"));
                this.setName(res.getString("stdName"));
                this.setContact(res.getString("stdContact"));
                this.setEmail(res.getString("stdEmail"));                
                this.setDept(res.getString("stdDept"));
                this.setSection(res.getString("stdSection"));
                this.setSemster(res.getString("stdSemester"));
                this.setClub(res.getString("stdClub"));                           
            }
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
    }
}
