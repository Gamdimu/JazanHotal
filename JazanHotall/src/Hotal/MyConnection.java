package BookingJazanhotel;
  
    

import java.sql.*;
public class MyConnection {
    
    static Connection con;
    public static Connection getConnection()
    {
    try{
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
   
    String path=".accdb";
    String url="jdbc:ucanaccess://"+path;
    con=DriverManager.getConnection(url);
    }catch(Exception e){
    System.out.println(e);
    }
    
    return con;
    } }
