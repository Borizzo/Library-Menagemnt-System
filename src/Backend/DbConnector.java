


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author 123Bo
 */
public class DbConnector {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/librarybase","root","Jack2011");
            
            return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
