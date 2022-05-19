/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.CTHD_DAO;
import DAO.HD_DAO;
import DTO.CTHD_DTO;
import DTO.HD_DTO;
import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class CTHD_BLL {
    private int num;
    private CTHD_DAO cthddao;
    public int MAHD()
    {
        cthddao=new CTHD_DAO();
        num=cthddao.MAHD();
        return num;
    }
    
}
