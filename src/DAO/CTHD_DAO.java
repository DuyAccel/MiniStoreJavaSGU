/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.CTHD_DTO;
import DTO.SP_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class CTHD_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=QLCHMINI;trustServerCertificate=true" ;
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
    public void Save(CTHD_DTO chdto, ArrayList<SP_DTO>listsp )
    {
        Connection conn = getConnection(URL, User, Password);
        try {
            Statement stmt = conn.createStatement();  
            stmt.executeUpdate("INSERT INTO HOADON VALUES('"+chdto.getMahd()+"','"+chdto.getDate()+"','"+chdto.getManv()+"','"+chdto.getTotal()+"','"+chdto.getMakm()+"','"+0+"')");    //Thực hiện điền data vào bảng có khóa chính trước
            for(int i=0;i<listsp.size();i++)
            {
                stmt.executeUpdate("INSERT INTO CTHOADON VALUES('"+chdto.getMahd()+"','"+listsp.get(i).getMasp()+"','"+listsp.get(i).getSl()+"','"+listsp.get(i).getDongia()+"')"); 
                stmt.executeUpdate("UPDATE SANPHAM SET SL=SL-'"+listsp.get(i).getSl()+"' WHERE MASP='"+listsp.get(i).getMasp()+"'"); 
            }                          
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CTHD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Trùng mã hóa đơn");
        }
    }
    
}
