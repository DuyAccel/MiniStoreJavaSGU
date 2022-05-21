package GUI;


import javax.swing.JTabbedPane;

import Phuc.DoanhThu;

public class PanelStatistic extends JTabbedPane{

    private DoanhThu income = new DoanhThu();
    public PanelStatistic(){
        setup();
    }

    private void setup(){
        add("Xuất Excel" ,income);
    }
    
}
