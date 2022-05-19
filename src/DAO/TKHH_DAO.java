/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.TKHH_DTO;
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
public class TKHH_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=MiniStore;trustServerCertificate=true" ;
    private final String User="duy"; 
    private final String Password="123";
    private ArrayList <TKHH_DTO> statistic;
    private TKHH_DTO tkhhdto;
    private String MASP, Ten, Loai;
    private int SL, ConLai;
    public TKHH_DAO() {
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
    public ArrayList <TKHH_DTO> Statistic()
    {
        try {
            Connection conn = getConnection(URL, User, Password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT SANPHAM.MASP, TENSP, LOAI, SUM(CTHOADON.SL), SANPHAM.SL - SUM(CTHOADON.SL)"+
                    "FROM CTHOADON, SANPHAM WHERE CTHOADON.MASP = SANPHAM.MASP and WHERE ISDELETED='"+0+"' GROUP BY SANPHAM.MASP, TENSP, LOAI, SANPHAM.SL");
           while(rs.next())
            {
                MASP=rs.getString(1);
                Ten=rs.getString(2);
                Loai=rs.getString(3);
                SL=rs.getInt(4);
                ConLai=rs.getInt(5);
                tkhhdto=new TKHH_DTO(MASP,Ten,Loai,SL,ConLai);
                statistic.add(tkhhdto);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TKHH_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return statistic;
    }
    public ArrayList <TKHH_DTO> Search(String masearch)
    {
        try {
            Connection conn = getConnection(URL, User, Password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT SANPHAM.MASP, TENSP, LOAI, SUM(CTHOADON.SL), SANPHAM.SL - SUM(CTHOADON.SL)"+
                            "FROM CTHOADON, SANPHAM WHERE CTHOADON.MASP = SANPHAM.MASP AND ISDELETED='"+0+"' AND SANPHAM.MASP = '" + masearch + "'"
                                    + "GROUP BY SANPHAM.MASP, TENSP, LOAI, SANPHAM.SL");
           while(rs.next())
            {
                MASP=rs.getString(1);
                Ten=rs.getString(2);
                Loai=rs.getString(3);
                SL=rs.getInt(4);
                ConLai=rs.getInt(5);
                tkhhdto=new TKHH_DTO(MASP,Ten,Loai,SL,ConLai);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TKHH_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return statistic;
    }
}
