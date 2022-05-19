package GUI.Items;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import BLL.CTHD_BLL;
import DTO.HD_DTO;
import DTO.NV_DTO;
import Function.GUI;
import Phuc.Time;

public class Bill_Details extends JFrame{

    private NV_DTO worker;
    private HD_DTO Bill;
    private int Total_Discount = 0;
    private int Total_Price = 0;
    protected GUI gui = new GUI();

    private JPanel Panel_Input = new JPanel();
    private JPanel Panel_Manger = new JPanel();

    private JTextField txtf_bill_id = new JTextField();
    private JTextField txtf_worker_id = new JTextField();
    private JTextField txtf_TotalPrice = new JTextField();
    private JTextField txtf_ProductID = new JTextField();
    private JTextField txtf_ProductQuantity = new JTextField();
    private JTextField txtf_Received = new JTextField();
    private JTextField txtf_Remainder = new JTextField();

    private JLabel jlb_bill_id = new JLabel("Mã hóa đơn");
    private JLabel jlb_worker_id = new JLabel("Mã nhân viên");
    private JLabel jlb_TotalPrice = new JLabel("Tổng Tiền");
    private JLabel jlb_ProductID = new JLabel("Mã sản phẩm");
    private JLabel jlb_ProductQuantity = new JLabel("Số lượng");
    private JLabel jlb_Received = new JLabel("Đã nhận");
    private JLabel jlb_Remainder = new JLabel("Thối lại");

    
    private JTable table = new JTable();
    private JScrollPane tablePane = new JScrollPane();

    private JButton btn_addProduct = new ButtonCustomed("Thêm sản phẩm");
    private JButton btn_rmProduct = new ButtonCustomed("Xóa sản phẩm");
    private JButton btn_Calculate = new ButtonCustomed("Thành tiền");
    private JButton btn_SaveBill = new ButtonCustomed("Thanh toán");
    private JButton btn_QuantityUp = new ButtonCustomed("Tăng");
    private JButton btn_QuantityDown = new ButtonCustomed("Giảm");
    private JButton btn_ReInput = new ButtonCustomed("Nhập lại");

    public Bill_Details(NV_DTO worker){
        this.worker = worker;
        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setup();
        
    }

    private void setup(){
        //Tạo Hóa đơn với 2 trường có sẵn là Mã HD
        Bill = new HD_DTO("HD"+String.valueOf((new CTHD_BLL()).MAHD()));
        (new Time()).toString();

        //Tạo giá trị cho các Component
        initPanelInput();
        initPanelManager();
        txtf_bill_id.setText(Bill.getMahd());
        txtf_bill_id.setEditable(false);

        txtf_worker_id.setText(worker.getManv());
        
        txtf_TotalPrice.setText(Total_Price+"");
        txtf_TotalPrice.setEditable(false);
        
        table.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MASP", "Sản Phẩm", "Số Lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tablePane.setViewportView(table);


        
        
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    private int getTotalPrice() {
        int price = 0;
        return price;
    }

    private void initPanelInput(){
        Panel_Input.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();

        //Cài font cho Components 
        gui.setFont(txtf_bill_id, 0, 16);
        gui.setFont(txtf_ProductID, 0, 16);
        gui.setFont(txtf_Received, 0, 16);
        gui.setFont(txtf_worker_id, 0, 16);
        gui.setFont(txtf_TotalPrice, 0, 16);
        gui.setFont(txtf_ProductQuantity, 0, 16);
        gui.setFont(txtf_Remainder, 0, 16);

        gui.setFont(jlb_bill_id, 1, 16);
        gui.setFont(jlb_ProductID, 1, 16);
        gui.setFont(jlb_Received, 1, 16);
        gui.setFont(jlb_worker_id, 1, 16);
        gui.setFont(jlb_TotalPrice, 1, 16);
        gui.setFont(jlb_ProductQuantity, 1, 16);
        gui.setFont(jlb_Remainder, 1, 16);

        gui.setFont(btn_Calculate, 1, 16);
        btn_Calculate.setSize(20, 40);

        //Mã sản hóa đơn
        gb.gridx=0;
        gb.gridy=0;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_bill_id, gb);
        
        gb.gridx=1;
        gb.gridy=0;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_bill_id, gb);
        //mã nhân viên
        gb.gridx=0;
        gb.gridy=1;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_worker_id, gb);
        
        gb.gridx=1;
        gb.gridy=1;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_worker_id, gb);
        
        //Tổng tiền
        gb.gridx=0;
        gb.gridy=2;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_TotalPrice, gb);

        gb.gridx=1;
        gb.gridy=2;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_TotalPrice, gb);

        //Khách trả
        gb.gridx=0;
        gb.gridy=3;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_TotalPrice, gb);

        gb.gridx=1;
        gb.gridy=3;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_TotalPrice, gb);
        
        //Tính tiền thừa
        gb.gridx=0;
        gb.gridy=4;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_Remainder, gb);

        gb.gridx=1;
        gb.gridy=4;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_Remainder, gb);

        gb.gridx=2;
        gb.gridy=4;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(btn_Calculate, gb);

    }

    private void initPanelManager() {
        Panel_Manger.setLayout(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();

        gui.setFont(btn_addProduct, 1, 16);
        gui.setFont(btn_rmProduct, 1, 16);
        gui.setFont(btn_QuantityUp, 1, 16);
        gui.setFont(btn_QuantityDown, 1, 16);
        gui.setFont(btn_SaveBill, 1, 16);
        gui.setFont(btn_ReInput, 1, 16);

        //mã sản phẩm
        gb.gridx=0;
        gb.gridy=2; 
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_ProductID, gb);
        
        gb.gridx=1;
        gb.gridy=2;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_ProductID, gb);

        //Số lượng sản phẩm
        gb.gridx=0;
        gb.gridy=3;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(jlb_ProductQuantity, gb);

        gb.gridx=1;
        gb.gridy=3;
        gb.fill= GridBagConstraints.HORIZONTAL;
        Panel_Input.add(txtf_ProductQuantity, gb);
        
        
    }
    
}
