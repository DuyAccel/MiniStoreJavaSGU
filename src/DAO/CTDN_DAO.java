package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import DTO.CTDN_DTO;

public class CTDN_DAO {
    private final String URL="jdbc:sqlserver://localhost:1433; DatabaseName=MiniStore;trustServerCertificate=true" ;
    private final String User="duy"; 
    private final String Password="123";
    public CTDN_DAO() {
    }
    private Connection getConnection(String URL, String User, String Password)
    {
        Connection conn=null;
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(URL, User, Password);
        }
        catch(Exception e)
        {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return conn;
    }
    public void SaveUpdateData(CTDN_DTO detail)
    {
       Connection conn = getConnection(URL, User, Password);
       try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into ctdn values('"+detail.getMadn()+"', '"+detail.getMasp()+"', "
            +detail.getSl() + ", " + detail.getGia() +")");

            stmt.executeUpdate("update sanpham set sl=sl+"+detail.getSl()+", gia="+detail.getGia()+" where masp='"+detail.getMasp()+"'");
            conn.close();
       }catch (Exception ex) {
            ex.printStackTrace();
        } 
    }

    public void SaveRawData(CTDN_DTO detail){
        Connection conn = getConnection(URL, User, Password);
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into ctdn values('" + detail.getMadn() + "', '" + detail.getMasp() + "', "
                    + detail.getSl() + ", " + detail.getGia() + ")");

            stmt.executeUpdate("insert into sp values('" + detail.getMasp() + "','', '"
                    + detail.getSl() + ", " + detail.getGia() + ", '', 'VNVS', 0)");

            conn.close();
        }catch (Exception ex) {
             ex.printStackTrace();
         } 
     }
}
