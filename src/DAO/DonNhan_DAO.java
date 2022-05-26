/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DonNhan_DTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class DonNhan_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=MiniStore;trustServerCertificate=true" ;
    private final String User="duy";
    private final String Password="123";
    private String madon, ngay, manv;
    private int total;
    private ArrayList<DonNhan_DTO>listdn=new ArrayList<>();
    private DonNhan_DTO dndto;
    public DonNhan_DAO() {
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
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Connection Failed");
        }
        return conn;
    }
    public void Add(DonNhan_DTO dndto)
    {
        try {
            Connection conn = getConnection(URL, User, Password);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO DONNHAN VALUES('" + dndto.getMadn() + "','" + dndto.getNgnhan()
                     + "','" + dndto.getManv() + "','" + dndto.getTong() + "', 0)"); 
                    
            conn.close();
        } 
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public ArrayList<DonNhan_DTO>View()
    {
        Connection conn = getConnection(URL, User, Password);
        try 
        {    
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DONNHAN");
            while(rs.next())
            {
               madon=rs.getString(1);
               ngay=rs.getString(2);
               manv=rs.getString(3);
               total=rs.getInt(4);
               dndto=new DonNhan_DTO(madon,ngay,manv,total);
               listdn.add(dndto);
            }
            conn.close();
        }catch (SQLException e) {
            System.out.println(e);
        } 
        return listdn;
    }
    public int getRowCount(){
        int count = 0;
        Connection conn = getConnection(URL, User, Password);
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from donnhan");
            while(rs.next()){
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
