package project;

import java.sql.*;
import javax.swing.*;

public class User_Login
{
    //VARIBLES
    //Uname and Upass are used to check login details
    //person_login is for to know which login button is click on frm_Welcome so we can run query in correct table in method chk_Login
    //ID is used for updating, searching and deleting record
    private String Uname, Upass;
    private String person_Login;
    private int ID;
    
    //Code for DB
    //Connection_to_DB it connects to Access DB
    Connect_to_DB obj_conDB = new Connect_to_DB();
    Connection obj_con = obj_conDB.make_Connection();    
    
    //Necessary Objects
    //Statement is used for updating, inserting and deleting
    Statement stmt = null;

    //PreparedStatement and ResultSet are used for selecting data
    PreparedStatement pre_stmt = null;
    ResultSet res = null;
    
    //object of class Student
    Student obj_Std;
    Faculty obj_Faculty;

    //CONSTRUCTORS
    //Default
    public User_Login(){};    
    
    //Userdefined
    //we get person_login check from frm_Welcome login button
    public User_Login(String person_login)
    {
        this.person_Login = person_login;
    }

    //GETTERS
    public String getUname()
    {
        return Uname;
    }

    public String getUpass()
    {
        return Upass;
    }

    public int getID()
    {
        return ID;
    }   

    //SETTERS
    public void setUname(String Uname)
    {
        this.Uname = Uname;
    }

    public void setUpass(String Upass)
    {
        this.Upass = Upass;
    }

    //METHODS
    //Method to check login data
    public Object chk_Login(String Uname, String Upass)
    {        
        //Contained Variables
        boolean Success;
        String str_Login = null;        
                
        //Here we are using person_login sent by frm_Welcome to run query on correct table in access DB
        if (person_Login.equalsIgnoreCase("std"))
        {            
            obj_Std = new Student();   
            str_Login = "select * from tbl_Std_Login where UserName ='" + Uname + "' and Password ='" + Upass + "'";
        }

        else if (person_Login.equalsIgnoreCase("faculty"))
        {
            obj_Faculty = new Faculty();
            str_Login = "select * from tbl_Faculty_Login where UserName ='" + Uname + "' and Password ='" + Upass + "'";
        }
        
        try
        {
                pre_stmt = obj_con.prepareStatement(str_Login);
                res = pre_stmt.executeQuery();
                Success = res.next();
                
                if(Success && person_Login.equalsIgnoreCase("std"))
                { 
                    obj_Std.setUserName(Uname);                     
                    obj_Std.getData_Std();                     
                    JOptionPane.showMessageDialog(null, "Welcome, " + obj_Std.getName());
                    return obj_Std;
                }
                
                else if(Success && person_Login.equalsIgnoreCase("faculty"))
                {                   
                    obj_Faculty.setUserName(Uname);
                    obj_Faculty.getData_Faculty();
                    JOptionPane.showMessageDialog(null, "Welcome, " + obj_Faculty.getName());
                    return obj_Faculty;
                }
        }
        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            //Success  = false;
        }
        
        return null;
    }

    //Method to add new user
    public boolean add_User(String Uname, String Upass)
    {
        //Contain Variables
        String str_Insert = "insert into tbl_Std_Login(UserName, UserPass) values('" + Uname + "', '" + Upass + "')";
        int Inserted;
        boolean Success;

        try
        {
            stmt = obj_con.createStatement();
            Inserted = stmt.executeUpdate(str_Insert);

            if (Inserted > 0)
            {
                Success = true;
            }

            else
            {
                Success = false;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            Success = false;
        }

        return Success;
    }

    //Method to delete user
    public boolean del_User(int ID)
    {
        //Contain Variables
        String str_Insert = "delete from tbl_Std_Login where ID='" + ID + "'";
        int Inserted;
        boolean Success;

        try
        {
            stmt = obj_con.createStatement();
            Inserted = stmt.executeUpdate(str_Insert);

            if (Inserted > 0)
            {
                Success = true;
            }

            else
            {
                Success = false;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            Success = false;
        }

        return Success;
    }

    //Method to search data
    public boolean search_User(int ID)
    {
        //Contained Variables
        boolean Success = false;
        String str_Search = "select * from tbl_Std_Login where ID ='" + ID + "'";

        try
        {
            pre_stmt = obj_con.prepareStatement(str_Search);
            res = pre_stmt.executeQuery();

            while (res.next())
            {
                Uname = res.getString("UserName");
                Upass = res.getString("UserPass");
                Success = true;
            }
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            Success = false;
        }

        return Success;
    }

    //Method to update data
    public boolean update(String Uname, int Upass, int ID)
    {
        //Contain Variables
        String str_Update = "update tbl_Std_Login set UserName ='" + Uname + "', UserPass='" + Upass + "' where ID='" + ID + "'";
        int Updated;
        boolean Success;

        try
        {
            stmt = obj_con.createStatement();
            Updated = stmt.executeUpdate(str_Update);

            if (Updated > 0)
            {
                Success = true;
            }

            else
            {
                Success = false;
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            Success = false;
        }

        return Success;
    }    
}
