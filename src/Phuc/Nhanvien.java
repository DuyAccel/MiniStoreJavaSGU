/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Phuc;

import BLL.NV_BLL;
import DTO.NV_DTO;
import Function.GUI;
import GUI.Items.ButtonCustomed;

import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul
 */
public class Nhanvien extends javax.swing.JPanel {

    private String MANV, Name, Dob, Address, Phonenumber, Role, Pass ;
    private static int i=0;
    private NV_DTO nvdto;
    private NV_BLL nvbll;
    private Hashtable<String, String> role = new Hashtable<>();
    public Nhanvien() {
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

        GUI gui = new GUI();
        role.put("Thu Ngân", "casher");
        role.put("Quản Lý", "manager");
        role.put("Kiểm Kho", "warehouse");

        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        lb0 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        lb6 = new javax.swing.JLabel();
        cbx = new javax.swing.JComboBox<>();
        lb7 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        lb8 = new javax.swing.JLabel();
        tf8 = new javax.swing.JTextField();


        bt1 = new ButtonCustomed();
        bt2 = new ButtonCustomed();
        bt3 = new ButtonCustomed();
        bt4 = new ButtonCustomed();
        bt5 = new ButtonCustomed();
        bt6 = new ButtonCustomed();
        bt7 = new ButtonCustomed();
        bt8 = new ButtonCustomed();

        bt1.setBackground(new ColorUIResource(116, 47, 158));
        bt2.setBackground(new ColorUIResource(116, 47, 158));
        bt3.setBackground(new ColorUIResource(116, 47, 158));
        bt4.setBackground(new ColorUIResource(116, 47, 158));
        bt5.setBackground(new ColorUIResource(116, 47, 158));
        bt6.setBackground(new ColorUIResource(116, 47, 158));
        bt7.setBackground(new ColorUIResource(116, 47, 158));
        bt8.setBackground(new ColorUIResource(116, 47, 158));

        
        bt1.setColorHover(new ColorUIResource(181, 113, 209));
        bt2.setColorHover(new ColorUIResource(181, 113, 209));
        bt3.setColorHover(new ColorUIResource(181, 113, 209));
        bt4.setColorHover(new ColorUIResource(181, 113, 209));
        bt5.setColorHover(new ColorUIResource(181, 113, 209));
        bt6.setColorHover(new ColorUIResource(181, 113, 209));
        bt7.setColorHover(new ColorUIResource(181, 113, 209));
        bt8.setColorHover(new ColorUIResource(181, 113, 209));

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MANV", "Tên NV", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Chức vụ", "Mật Khẩu"
            }
        ));
        jScrollPane1.setViewportView(tb);

        lb0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb0.setText("Nhân viên");

        lb1.setText("MANV");

        lb2.setText("Họ và tên");

        lb3.setText("Ngày sinh");

        lb4.setText("Địa chỉ");

        lb5.setText("Số điện thoại");

        lb6.setText("Chức vụ");

        cbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu Ngân", "Kiểm Kho", "Quản Lý" }));

        lb7.setText("Password");

        lb8.setText("Tìm kiếm");

        bt1.setText("Search");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setText("Add Row");
        bt2.setIcon(gui.getImg("add.png"));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setText("Delete Row");
        bt3.setIcon(gui.getImg("delete.png"));
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setText("Clear");
        bt4.setIcon(gui.getImg("clear.png"));
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setText("Thêm");
        bt5.setIcon(gui.getImg("add1.png"));
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setText("Xem");
        bt6.setIcon(gui.getImg("look.png"));
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.setText("Sửa");
        bt7.setIcon(gui.getImg("edit.png"));
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setText("Xóa");
        bt8.setIcon(gui.getImg("delete1.png"));
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb3)
                                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb5)
                                    .addComponent(lb6)
                                    .addComponent(lb7)
                                    .addComponent(lb2))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx, javax.swing.GroupLayout.Alignment.LEADING, 0, 245, Short.MAX_VALUE)
                                    .addComponent(tf5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lb0)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lb7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        DefaultTableModel models = (DefaultTableModel)tb.getModel();
        models.addRow(new Object[] {});
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        DefaultTableModel models = (DefaultTableModel)tb.getModel();
        models.removeRow(tb.getSelectedRow());
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        tf7.setText("");
        for(int i=0;i<tb.getRowCount();i++)
        {
            if(tb.isRowSelected(i))
            {
                 tb.setValueAt("", i, 0);
                 tb.setValueAt("", i, 1);
                 tb.setValueAt("", i, 2);
                 tb.setValueAt("", i, 3);
                 tb.setValueAt("", i, 4);
                 tb.setValueAt("", i, 5);
                 tb.setValueAt("", i, 6);
            }
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        nvbll=new NV_BLL();
        DefaultTableModel models = (DefaultTableModel)tb.getModel(); 
        try
        {
            MANV=tf1.getText();
            Name=tf2.getText();
            Dob=tf3.getText();
            Address=tf4.getText();
            Phonenumber=tf5.getText();
            Role=role.get(String.valueOf(cbx.getSelectedItem()));
            Pass=tf7.getText();
            nvdto=new NV_DTO(MANV,Name,Dob,Address,Phonenumber,Role,Pass);
            nvbll.Add(nvdto);
            tb.setValueAt(MANV, i,0);
            tb.setValueAt(Name, i,1);
            tb.setValueAt(Dob, i,2);
            tb.setValueAt(Address, i,3);
            tb.setValueAt(Phonenumber, i,4);
            tb.setValueAt(Role, i,5);
            tb.setValueAt(Pass, i,6);
            models.addRow(new Object[] {});
            i++;     
        }
        catch (NumberFormatException ne)
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Điền thông tin vào các trường");
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        nvbll=new NV_BLL();
            DefaultTableModel models = (DefaultTableModel)tb.getModel();
            for(int i=0;i<nvbll.View().size();i++)
            {
                tb.setValueAt(nvbll.View().get(i).getManv(), i, 0);
                tb.setValueAt(nvbll.View().get(i).getTenv(), i, 1);
                tb.setValueAt(nvbll.View().get(i).getNgsinh(), i, 2);
                tb.setValueAt(nvbll.View().get(i).getDchi(), i, 3);
                tb.setValueAt(nvbll.View().get(i).getSdt(), i, 4);
                tb.setValueAt(nvbll.View().get(i).getCvuVN(), i, 5);
                tb.setValueAt(nvbll.View().get(i).getPass(), i, 6);
                models.addRow(new Object[] {});
            } 
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        nvbll=new NV_BLL();
        if(tb.getSelectedRowCount()==1)
        {
            if(tb.getSelectedRowCount()==1)
            {
                String selectedID=String.valueOf(tb.getValueAt(tb.getSelectedRow(),0));     //Chọn 1 hàng cần chỉnh sửa
                MANV=tf1.getText();
                Name=tf2.getText();
                Dob=tf3.getText();
                Address=tf4.getText();
                Phonenumber=tf5.getText();
                Role=String.valueOf(cbx.getSelectedItem());
                Pass=tf7.getText();
                nvdto=new NV_DTO(MANV,Name,Dob,Address,Phonenumber,Role,Pass);
                nvbll.Edit(nvdto, selectedID);
                tb.setValueAt(MANV, tb.getSelectedRow(),0);       //Cập nhật trên table
                tb.setValueAt(Name, tb.getSelectedRow(),1);
                tb.setValueAt(Dob, tb.getSelectedRow(),2);
                tb.setValueAt(Address, tb.getSelectedRow(),3);
                tb.setValueAt(Phonenumber, tb.getSelectedRow(),4);
                tb.setValueAt(Role, tb.getSelectedRow(),5);
                tb.setValueAt(Pass, tb.getSelectedRow(),6);
              
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
        }
        else if(tb.getSelectedRowCount()<1) 
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Chọn trường bạn muốn chỉnh sửa"); 
        }
        else
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"Bạn chỉ được chọn 1 trường để chỉnh sửa"); 
        }   
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        nvbll=new NV_BLL();
       if(tb.getSelectedRowCount()==1)
       {
            String selectedID=String.valueOf(tb.getValueAt(tb.getSelectedRow(),0));
            tb.setValueAt("", tb.getSelectedRow(), 0);       //Xóa trên table
            tb.setValueAt("", tb.getSelectedRow(), 1);
            tb.setValueAt("", tb.getSelectedRow(), 2);
            tb.setValueAt("", tb.getSelectedRow(), 3);
            tb.setValueAt("", tb.getSelectedRow(), 4);
            tb.setValueAt("", tb.getSelectedRow(), 5);
            tb.setValueAt("", tb.getSelectedRow(), 6);
            nvbll.Delete(selectedID);
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
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
      nvbll=new NV_BLL();
      String search=tf8.getText();
      DefaultTableModel models = (DefaultTableModel)tb.getModel();
      for(int i=0;i<nvbll.Search(search).size();i++)
      {
        tb.setValueAt(nvbll.Search(search).get(i).getManv(), i, 0);
        tb.setValueAt(nvbll.Search(search).get(i).getTenv(), i, 1);
        tb.setValueAt(nvbll.Search(search).get(i).getNgsinh(), i, 2);
        tb.setValueAt(nvbll.Search(search).get(i).getDchi(), i, 3);
        tb.setValueAt(nvbll.Search(search).get(i).getSdt(), i, 4);
        tb.setValueAt(nvbll.Search(search).get(i).getCvuVN(), i, 5);
        tb.setValueAt(nvbll.Search(search).get(i).getPass(), i, 6);
        models.addRow(new Object[] {});
       }
    }//GEN-LAST:event_bt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonCustomed bt1;
    private ButtonCustomed bt2;
    private ButtonCustomed bt3;
    private ButtonCustomed bt4;
    private ButtonCustomed bt5;
    private ButtonCustomed bt6;
    private ButtonCustomed bt7;
    private ButtonCustomed bt8;
    private javax.swing.JComboBox<String> cbx;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb0;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JTable tb;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    // End of variables declaration//GEN-END:variables
}
