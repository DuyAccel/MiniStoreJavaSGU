/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAO.CTDN_DAO;
import DAO.DonNhan_DAO;
import DTO.CTDN_DTO;
import DTO.DonNhan_DTO;
import DTO.SP_DTO;
import java.util.ArrayList;

/**
 *
 * @author Paul
 */
public class DonNhan_BLL {
    private DonNhan_DAO dndao;
    public DonNhan_BLL() {
    }
    
    public void Add(DonNhan_DTO dndto, ArrayList <SP_DTO>listsp)
    {
        dndao=new DonNhan_DAO();
        //dndao.Add(dndto, listsp);

    }
    public ArrayList<DonNhan_DTO> View()
    {
        dndao=new DonNhan_DAO();
        return dndao.View();
    }
    public String getNewID(){
        return "DN"+(new DonNhan_DAO()).getRowCount();
    }

    public void saveData(DonNhan_DTO order, ArrayList<CTDN_DTO> details){
        (new DonNhan_DAO()).Add(order);
        CTDN_DAO details_DAO = new CTDN_DAO();
        for (CTDN_DTO product : details) {
            if ((new SP_BLL()).Find(product.getMasp()) != null){
                details_DAO.SaveUpdateData(product);
            }
            else{
                details_DAO.SaveRawData(product);
            }
        }
    }
    
}
