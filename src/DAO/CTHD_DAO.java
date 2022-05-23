/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class CTHD_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=MiniStore;trustServerCertificate=true" ;
    private final String User="duy"; 
    private final String Password="123";
    private static int mahd;
    public CTHD_DAO() {
    }
    private Connection getConnection(String URL, String User, String Password)
    {
        Connection conn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(URL, User, Password);
            System.out.println("connect successfully!");
        }
        catch(Exception e)
        {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return conn;
    }
    public int MAHD()
    {
       Connection conn = getConnection(URL, User, Password);
       try {
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select count(*) from HOADON");
            while(rs.next())
            {
              mahd=rs.getInt(1);  
            }           
            conn.close();
       }catch (SQLException ex) {
            Logger.getLogger(CTHD_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
       return mahd;
    }
    
    
}
