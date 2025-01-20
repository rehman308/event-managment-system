package project;

import java.sql.*;
import javax.swing.*;

public class Booking
{
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
    
    //METHODS
    //Method to insert booking in DB tbl_Registration
    public boolean ins_Attendee(String event, String date, String day, String venue, String name, String contact, String seats, String bill)
    {
        //Contain Variables      
        int Inserted;
        boolean Success;

        String str_Insert = "insert into tbl_Register(reg_Name, reg_Contact, reg_Event,  reg_Venue, reg_Day,  reg_Date, reg_Seats, reg_Bill)"
                            + "values('" + name + "', '" + contact + "', '" + event + "', '" + venue + "', '" + day + "', '" + date + "' , '" + seats + "', '"+ bill + "')";

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

    //Method to calculate ticket price
    public int cal_Ticket(boolean bahrian, String seats, String ticket)
    {
        //Contained Variables
        int bill = 0;
        boolean bol_dis = bahrian;

        try
        {
            int cal_seats = Integer.parseInt(seats);
            int cal_ticket = Integer.parseInt(ticket);
            
            if (cal_seats == 0)
                throw new Exception();                        

            bill = cal_seats * cal_ticket;

            if (bol_dis)
            {
                return bill - (bill * 20) / 100;
            }

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Enter Correct Seat Number.");
        }
        
        return bill;
    }
}
