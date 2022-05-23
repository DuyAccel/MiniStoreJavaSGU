package BLL;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import DAO.Statistic_DAO;
import DTO.Statistic_DTO;

public class Statistic_BLL {
    public Statistic_BLL(){

    }

    public ArrayList<Statistic_DTO> getData(){
        return (new Statistic_DAO()).getData();
    }
    
    public ArrayList<Statistic_DTO> getData(String Month, String Year){
        return (new Statistic_DAO()).getData(Year + "-" +  Month);
    }   

    public boolean checkDay(String Date){
        Statistic_DTO data = (new Statistic_DAO()).getLastestRow();
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");
        LocalDate date = LocalDate.parse(data.getDate(), formatter);
        
        if (date.isBefore(now)) 
            return true;
        return false;
    }
    
    
    
}
