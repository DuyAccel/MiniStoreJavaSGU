package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.Statistic_DTO;

public class Statistic_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=MiniStore;trustServerCertificate=true" ;
    private final String User="duy"; 
    private final String Password="123";
    public Statistic_DAO(){
    }

    private Connection getConnection()
    {
        Connection conn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(URL, User, Password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public ArrayList<Statistic_DTO> getData(){
        Connection conn = getConnection();
        ArrayList<Statistic_DTO> incomes = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from doanhthu");
            while (rs.next()) {
                incomes.add(new Statistic_DTO(rs.getString(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return incomes;
    }

    public ArrayList<Statistic_DTO> getData(String Date){
        Connection conn = getConnection();
        ArrayList<Statistic_DTO> incomes = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from doanhthu where thoigian like '"+Date+"%'");
            while (rs.next()) {
                incomes.add(new Statistic_DTO(rs.getString(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return incomes;
    }

    public void addData(Statistic_DTO data){
        Connection conn = getConnection();
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into doanhthu values('"+data.getDate()+"', "+data.getIncome()+", "+data.getSold()+")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    
    public Statistic_DTO getLastestRow(){
        Connection conn = getConnection();
        Statistic_DTO data = null;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select TOP 1 * from doanhthu ORDER BY thoigian DESC");
            if (rs.next())
                data = new Statistic_DTO(rs.getString(1), rs.getInt(2), rs.getInt(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
