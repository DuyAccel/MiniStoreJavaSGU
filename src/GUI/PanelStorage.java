package GUI;


import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.DimensionUIResource;

import GUI.Items.Divider;
import GUI.Items.MyScrollBar;
import Phuc.SanPham;
import Phuc.ThongKeHang;

public class PanelStorage extends JScrollPane {
    private ThongKeHang statistic = new ThongKeHang();
    private SanPham product = new SanPham();
    private JPanel container = new JPanel();
    public PanelStorage(int width, int height){
        
        // setLayout(new GridLayout(1,1));
        setup();
        setPreferredSize(new DimensionUIResource(width, height));
    }
    private void setup(){
        
        container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
        container.add(new Divider("Nhập hàng", getWidth(), 30));
        container.add(product);
        container.add(new Divider("Thống kê sản phẩm", getWidth(), 30));
        container.add(statistic);
        
        setVerticalScrollBar(new MyScrollBar());
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        setViewportView(container);
    
    }
}
