/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.HD_DAO;
import DTO.HD_DTO;
import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class HD_BLL {
    private HD_DAO hd;

    public HD_BLL() {
    }
    
    public ArrayList<HD_DTO>View()
    {
        hd=new HD_DAO();
       return hd.View();
    }
    public ArrayList<HD_DTO>ASC()
    {
        hd=new HD_DAO();
       return hd.ASC();
    }
    public ArrayList<HD_DTO>DESC()
    {
        hd=new HD_DAO();
       return hd.DESC();
    }
    public void Edit(HD_DTO hdto, String selectedid)
    {
        hd=new HD_DAO();
        hd.Edit(hdto, selectedid);
    }
    public void Delete(String selectedid)
    {
        hd=new HD_DAO();
        hd.Delete(selectedid);
    }
}
