package GUI;


import javax.swing.JTabbedPane;

import GUI.Items.PanelStatisticChart;
import Phuc.DoanhThu;

public class PanelStatistic extends JTabbedPane{

    private DoanhThu income = new DoanhThu();
    private PanelStatisticChart chart = new PanelStatisticChart(getWidth(), getHeight());
    public PanelStatistic(){
        setup();
    }

    private void setup(){
        add("Thống kê", chart);
        add("Xuất Excel" ,income);
    }
    
}
