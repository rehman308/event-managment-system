package project;

public class University_User
{
    //VARIABLES
    private String id, name, username, contact, email, dept;
   
    //CONSTRUCTORS
    //Default
    public University_User(){};
    
    //User-Defined
    public University_User(String id, String name, String username, String contact, String email, String dept)
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.contact = contact;
        this.email = email;      
        this.dept = dept;        
    }

    //SETTERS GETTERS
    //Getter for id
    public String getId()
    {
        return this.id;
    }

    //Setter for id
    public void setId(String id)
    {
        this.id = id;
    }

    //Getter for name
    public String getName()
    {
        return this.name;
    }

    //Setter for name
    public void setName(String name)
    {
        this.name = name;
    }

    //Getter for username
    public String getUserName()
    {
        return this.username;
    }    

    //Setter for username
    public void setUserName(String username)
    {
         this.username = username;
    }

    //Getter for contact
    public String getContact()
    {
        return contact;
    }
    //Setter for contact
    public void setContact(String contact)
    {
        this.contact = contact;
    }

    //Getter for email
    public String getEmail()
    {
        return email;
    }
    
    //Setter for email
    public void setEmail(String email)
    {
        this.email = email;
    }
   
    //Getter for dept
    public String getDept()
    {
        return dept;
    }

    //Setter for dept
    public void setDept(String dept)
    {
        this.dept = dept;
    }    
}
