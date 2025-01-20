package project;

import java.sql.*;
import javax.swing.*;

public class Event
{
    //private class variables
    private String name, date, day, venue, budget, descript,  club, ticket;
    
    //Things for DB
    //Connection_to_DB it connects to Access DB
    Connect_to_DB obj_conDB = new Connect_to_DB();
    Connection obj_con = obj_conDB.make_Connection();

    //Statement is used for updating, inserting and deleting
    Statement stmt = null;

    //PreparedStatement and ResultSet are used for selecting data
    PreparedStatement pre_stmt = null;
    ResultSet res = null;

    //object of class Student
    Student obj_Std;

    //CONSTRUCTORS
    //Default Constructor
    public Event(){}

    //Parameterized COnstructor
    public Event(String name, String date, String day, String venue, String budget, String descript, String club, String ticket)
    {
        this.name = name;
        this.date = date;
        this.day = day;
        this.venue = venue;
        this.budget = budget;
        this.descript = descript;
        this.club = club;
        this.ticket = ticket;     
    }
    
    //SETTER GETTERS START
    public String getName()    
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
    }

    public String getVenue()
    {
        return venue;
    }

    public void setVenue(String venue)
    {
        this.venue = venue;
    }

    public String getBudget()
    {
        return budget;
    }

    public void setBudget(String budget)
    {
        this.budget = budget;
    }

    public String getDescript()
    {
        return descript;
    }

    public void setDescript(String descript)
    {
        this.descript = descript;
    }

     public String getClub()
    {
        return club;
    }
    
    public void setClub(String club)    
    {
        this.club = club;
    }

    public String getTicket()
    {
        return ticket;
    }

    public void setTicket(String ticket)
    {
        this.ticket = ticket;
    }    
    //SETTER GETTERS END
    
    //METHODS
    //Method to get data from DB from tbl_Up_Events
    public void getData_Event()
    {
        String str_Data = "select * from tbl_Up_Events where evntClub='" + this.club + "'";

        try
        {
            pre_stmt = obj_con.prepareStatement(str_Data);
            res = pre_stmt.executeQuery();

            while (res.next())
            {
                this.name = res.getString("evntName");
                this.date = res.getString("evntDate");
                this.day = res.getString("evntDay");                
                this.venue =res.getString("evntVenue");
                this.budget =res.getString("evntBudget");
                this.descript = res.getString("evntDescript");
                this.club = res.getString("evntClub");
                this.ticket =res.getString("evntTicket");
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Method to propose Event and add data to DB in tbl_Pro_Event (this is used in frm_Student >>> Button Propose Event)
    public boolean pro_Event(String name, String date, String day, String venue, String budget, String descript, String std_Name, String std_ID, String std_Club)
    {
        //Contained Variables
        int Inserted;
        boolean Success;
        String remarks = " ";

        String str_Insert = "insert into tbl_Pro_Events (pevnt_Name, pevnt_Date, pevnt_Day, pevnt_Venue, pevnt_Budget, pevnt_Descript, pevnt_Student, pevnt_ID, pevnt_Club, pevnt_Remarks)"
                            + "values('" + name + "', '" + date + "', '" + day + "', '" + venue + "', '" + budget + "', '" + descript + "', '" + std_Name + "', '" + std_ID + "', '" + std_Club + "', '" + remarks + "')";

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
    
     //Method to insert data in tbl_Up_Event
    //This is used in frm_Faculty >>> btn_Pro_Event >>> frm_Des_Event >>> btn_Approve 
    public boolean appr_Pro_Event(String name, String date, String day, String venue, String budget, String descript, String club, String ticket)
    {  
        //Contain Variables      
        int Inserted;
        boolean Success;
        
        String str_Insert = "insert into tbl_Up_Events(evntName, evntDate, evntDay, evntVenue, evntBudget, evntDescript, evntClub, evntTicket)"
                                      + "values('" + name + "', '" + date + "', '" + day + "', '" + venue + "', '" + budget + "', '" + descript + "', '" + club + "', '" + ticket + "')";         
       
        try
        {
            stmt = obj_con.createStatement();
            Inserted = stmt.executeUpdate(str_Insert);

            if (Inserted > 0)
            {
                Success = true;
                this.del_Event(name, "pro");
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
    
    //Method to reject 
    //This is used in frm_Faculty >>> btn_Pro_Event >>> frm_Des_Event >>> btn_Reject
    public boolean reject_Pro_Event(String name, String remarks)
    {
        String str_Update = "update tbl_Pro_Events set pevnt_Remarks ='" + remarks + "' where pevnt_Name = '" + name + "'";
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
    
    //Method to delete event from DB
    public boolean del_Event(String event, String tbl)
    {
        //Contain Variables
        String str_Del;
        int Deleted;
        boolean Success;
        
        if(tbl.equalsIgnoreCase("pro"))
            str_Del = "delete from tbl_Pro_Events where pevnt_Name='" + event + "'";
        else 
             str_Del = "delete from tbl_Up_Events where evntName='" + event + "'";
        
        try
        {
            stmt = obj_con.createStatement();
            Deleted = stmt.executeUpdate(str_Del);

            if (Deleted > 0)
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
    
    //Method to update data
    public boolean update_Event(String name, String date, String day, String venue, String budget, String descript, String club, String ticket)
    {
        //Contain Variables
        String str_Update = "update tbl_Up_Events set evntDate ='" + date + "', evntDay='" + day + "', evntVenue='" + venue + "', evntBudget='" + budget + "', evntDescript='" + descript + "', evntClub='" + club + "', evntTicket='" + ticket + "' where evntName='" + name + "'";
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
