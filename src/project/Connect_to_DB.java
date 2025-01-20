package project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

//Datebase Connection Class that makes a connection to the Access file
public class Connect_to_DB
{
    //Path of Access Database
    String path_DB = "C:\\Users\\rehma\\Desktop\\University\\OOP Lab\\Project\\src\\resources\\db_Project.accdb";
    
    //Variables
    Connection con = null;

    //METHODS
    //Method to make a connection with Access Database
    public Connection make_Connection()
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://" + path_DB);
            //JOptionPane.showMessageDialog(null, "OK");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        return con;
    }
}
