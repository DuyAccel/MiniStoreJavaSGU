/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.HD_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class HD_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=QLCHMINI;trustServerCertificate=true" ;
    private final String User="duy"; 
    private final String Password="123";
    private HD_DTO hddto;
    private String a,b,c;
    private int d;
    private ArrayList <HD_DTO> listhd =new ArrayList(); 

    public HD_DAO() {
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
    public void Edit(HD_DTO hhdto, String selectedid)
    { 
        Connection conn = getConnection(URL, User, Password);
        try {
                Statement stmt = conn.createStatement();     //Cập nhật trên database
                stmt.executeUpdate("UPDATE HOADON SET MAHD='"+hddto.getMahd()+"', NGAYXUAT='"+hddto.getNgxuat()+"', MANV='"+hddto.getManv()+"', TONGTIEN='"+hddto.getTongtien()+"' WHERE MAHD='"+selectedid+"' ");    //Thực hiện cập nhật row khi ID trong csdl trùng với ID của hàng được chọn
        
                conn.close();
            }catch (SQLException ex) {
            Logger.getLogger(HD_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    public void Delete(String selectedid )
    {
        Connection conn = getConnection(URL, User, Password);
        Statement stmt;
        try {
                   stmt = conn.createStatement();  //Xóa trên database
                   stmt.executeUpdate("UPDATE HOADON SET isdeleted='"+1+"' WHERE MAHD='"+selectedid+"'");
                   conn.close();
            } catch (SQLException ex) {
            Logger.getLogger(HD_DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public ArrayList<HD_DTO> View()
    {
        Connection conn = getConnection(URL, User, Password);
       try {
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select MAHD, NgayXuat, MANV, Tongtien from HOADON where isdeleted='"+0+"'");
            while(rs.next())
            {
                a=rs.getString(1);
                b=rs.getString(2);
                c=rs.getString(3);
                d=Integer.parseInt(rs.getString(4));
                hddto=new HD_DTO(a,b,c,d);
                listhd.add(hddto);
            }
            conn.close();
       }catch (SQLException ex) {
            Logger.getLogger(HD_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
       return listhd;
    }
    public ArrayList<HD_DTO> ASC()
    {
        Connection conn = getConnection(URL, User, Password);
       try {
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select MAHD, NgayXuat, MANV, Tongtien from HOADON where isdeleted='"+0+"' ORDER BY Tongtien ASC");
            while(rs.next())
            {
                a=rs.getString(1);
                b=rs.getString(2);
                c=rs.getString(3);
                d=Integer.parseInt(rs.getString(4));
                hddto=new HD_DTO(a,b,c,d);
                listhd.add(hddto);
            }
            conn.close();
       }catch (SQLException ex) {
            Logger.getLogger(HD_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
       return listhd;
    }
    public ArrayList<HD_DTO> DESC()
    {
        Connection conn = getConnection(URL, User, Password);
       try {
            Statement stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select MAHD, NgayXuat, MANV, Tongtien from HOADON where isdeleted='"+0+"' ORDER BY Tongtien DESC");
            while(rs.next())
            {
                a=rs.getString(1);
                b=rs.getString(2);
                c=rs.getString(3);
                d=Integer.parseInt(rs.getString(4));
                hddto=new HD_DTO(a,b,c,d);
                listhd.add(hddto);
            }
            conn.close();
       }catch (SQLException ex) {
            Logger.getLogger(HD_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }  
       return listhd;
    }
}
