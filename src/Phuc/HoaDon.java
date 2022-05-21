/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Phuc;

import BLL.HD_BLL;
import DAO.HD_DAO;
import DTO.HD_DTO;
import DTO.NV_DTO;
import Function.GUI;
import GUI.Items.Bill_Details;
import GUI.Items.ButtonCustomed;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul
 */
public class HoaDon extends javax.swing.JPanel {

    /**
     * Creates new form HoaDon
     */
    private static int numberofrow=1, numberofcol=4;
     private Execute ex;
     private Bill_Details bill_Details;
     private String MAHD, Date, MANV, total;
     private HD_DTO hddto;
     private HD_DAO hddao=new HD_DAO();
     private HD_BLL hdbll;
     private NV_DTO nv;
    public HoaDon(NV_DTO nv) {
        this.nv = nv;
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        bt6 = new ButtonCustomed();
        bt5 = new ButtonCustomed();
        bt4 = new ButtonCustomed();
        bt3 = new ButtonCustomed();
        bt2 = new ButtonCustomed();
        bt1 = new ButtonCustomed();

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "MAHD", "Ngày xuất", "MANV", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tb);

        GUI gui = new GUI();

        tf3.setText(nv.getTenv());

        gui.setFont(tf1, 1, 16);
        gui.setFont(tf2, 1, 16);
        gui.setFont(tf3, 1, 16);
        gui.setFont(tf4, 1, 16);

        
        gui.setFont(lb2, 1, 16);
        gui.setFont(lb3, 1, 16);
        gui.setFont(lb4, 1, 16);
        gui.setFont(lb5, 1, 16);

        
        gui.setFont(bt1, 1, 16);
        gui.setFont(bt2, 1, 16);
        gui.setFont(bt3, 1, 16);
        gui.setFont(bt4, 1, 16);
        gui.setFont(bt5, 1, 16);
        gui.setFont(bt5, 1, 16);
        gui.setFont(bt6, 1, 16);

        bt1.setBackground(new ColorUIResource(116, 47, 158));
        bt2.setBackground(new ColorUIResource(116, 47, 158));
        bt3.setBackground(new ColorUIResource(116, 47, 158));
        bt4.setBackground(new ColorUIResource(116, 47, 158));
        bt5.setBackground(new ColorUIResource(116, 47, 158));
        bt6.setBackground(new ColorUIResource(116, 47, 158));

        bt1.setColorHover(new ColorUIResource(181, 113, 209));
        bt2.setColorHover(new ColorUIResource(181, 113, 209));
        bt3.setColorHover(new ColorUIResource(181, 113, 209));
        bt4.setColorHover(new ColorUIResource(181, 113, 209));
        bt5.setColorHover(new ColorUIResource(181, 113, 209));
        bt6.setColorHover(new ColorUIResource(181, 113, 209));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Hóa đơn");

        lb2.setText("Mã hóa đơn");

        tf1.setEditable(false);

        lb3.setText("Ngày xuất");

        lb4.setText("Người bán");

        lb5.setText("Tổng tiền");

        bt6.setText("Giảm");
        bt6.setIcon(gui.getImg("descending.png"));

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt5.setText("Tăng");
        bt5.setIcon(gui.getImg("ascending.png"));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt4.setText("Xem");
        bt4.setIcon(gui.getImg("look.png"));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt3.setText("Xóa");
        bt3.setIcon(gui.getImg("delete1.png"));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt2.setText("Sửa");
        bt2.setIcon(gui.getImg("edit.png"));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt1.setText("Thêm");
        bt1.setIcon(gui.getImg("add1.png"));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3)
                            .addComponent(lb2)
                            .addComponent(lb4)
                            .addComponent(lb5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bt1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(bt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
       hdbll=new HD_BLL();
        DefaultTableModel models = (DefaultTableModel)tb.getModel();      
        for(int i=0;i<hdbll.DESC().size();i++)
        {
            tb.setValueAt(hdbll.DESC().get(i).getMahd(), i, 0);
            tb.setValueAt(hdbll.DESC().get(i).getNgxuat(), i, 1);
            tb.setValueAt(hdbll.DESC().get(i).getManv(), i, 2);
            tb.setValueAt(hdbll.DESC().get(i).getTongtien(), i, 3);
            models.addRow(new Object[] {});
        }                    
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        hdbll=new HD_BLL();
        DefaultTableModel models = (DefaultTableModel)tb.getModel();      
        for(int i=0;i<hdbll.ASC().size();i++)
        {
            tb.setValueAt(hdbll.ASC().get(i).getMahd(), i, 0);
            tb.setValueAt(hdbll.ASC().get(i).getNgxuat(), i, 1);
            tb.setValueAt(hdbll.ASC().get(i).getManv(), i, 2);
            tb.setValueAt(hdbll.ASC().get(i).getTongtien(), i, 3);
            models.addRow(new Object[] {});
        }      
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        hdbll=new HD_BLL();
        DefaultTableModel models = (DefaultTableModel)tb.getModel();      
        for(int i=0;i<hdbll.View().size();i++)
        {
            tb.setValueAt(hdbll.View().get(i).getMahd(), i, 0);
            tb.setValueAt(hdbll.View().get(i).getNgxuat(), i, 1);
            tb.setValueAt(hdbll.View().get(i).getManv(), i, 2);
            tb.setValueAt(hdbll.View().get(i).getTongtien(), i, 3);
            models.addRow(new Object[] {});
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        if(tb.getSelectedRowCount()==1)
       {
            String selectedID=String.valueOf(tb.getValueAt(tb.getSelectedRow(),0));
            tb.setValueAt(" ", tb.getSelectedRow(), 0);       //Xóa trên table
            tb.setValueAt(" ", tb.getSelectedRow(), 1);
            tb.setValueAt(" ", tb.getSelectedRow(), 2);
            tb.setValueAt(" ", tb.getSelectedRow(), 3); 
            hdbll.Delete(selectedID);
        }
        else if(tb.getSelectedRowCount()==0)     
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Chọn 1 trường để xóa");
        }
        else
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Bạn chỉ được chọn 1 trường để xóa");
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        hdbll=new HD_BLL(); 
        if(tb.getSelectedRowCount()==1)
       {
            String selectedID=String.valueOf(tb.getValueAt(tb.getSelectedRow(),0));     //Chọn 1 hàng cần chỉnh sửa
            tf1.setText(selectedID);
            String a=tf1.getText();
            String b=tf2.getText();
            String c=tf3.getText();
            int d=Integer.parseInt(tf4.getText());
            tb.setValueAt(a, tb.getSelectedRow(), 0);       //Cập nhật trên table
            tb.setValueAt(b, tb.getSelectedRow(), 1);
            tb.setValueAt(c, tb.getSelectedRow(), 2);
            tb.setValueAt(d, tb.getSelectedRow(), 3);
            hddto=new HD_DTO(a,b,c,d);
            hdbll.Edit(hddto,selectedID);
        }else if(tb.getSelectedRowCount()==0)
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Chọn 1 trường để chỉnh sửa");
        }
        else
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Bạn chỉ được chọn 1 trường để chỉnh sửa");
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        //cthd=new CTHD(nv);
        bill_Details = new Bill_Details(nv);
        //Gọi Panel của CTHD vào
    }//GEN-LAST:event_bt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonCustomed bt1;
    private ButtonCustomed bt2;
    private ButtonCustomed bt3;
    private ButtonCustomed bt4;
    private ButtonCustomed bt5;
    private ButtonCustomed bt6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JTable tb;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
