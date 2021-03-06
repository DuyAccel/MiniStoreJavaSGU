/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Phuc;
import BLL.DT_BLL;
import DTO.DT_DTO;
import GUI.Items.ButtonCustomed;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
/**
 *
 * @author Paul
 */
public class DoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form DoanhThu
     */
    private DT_BLL dtbll;
    private static int i=0, total=0;
    private Time t;
    public DoanhThu() {
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

        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        bt1 = new ButtonCustomed();
        bt2 = new ButtonCustomed();
        bt3 = new ButtonCustomed();
        bt4 = new ButtonCustomed();
        bt5 = new ButtonCustomed();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        bt6 = new ButtonCustomed();
        bt7 = new ButtonCustomed();
        bt8 = new ButtonCustomed();
        bt9 = new ButtonCustomed();

        
        bt1.setBackground(new ColorUIResource(116, 47, 158));
        bt2.setBackground(new ColorUIResource(116, 47, 158));
        bt3.setBackground(new ColorUIResource(116, 47, 158));
        bt4.setBackground(new ColorUIResource(116, 47, 158));
        bt5.setBackground(new ColorUIResource(116, 47, 158));
        bt6.setBackground(new ColorUIResource(116, 47, 158));
        bt7.setBackground(new ColorUIResource(116, 47, 158));
        bt8.setBackground(new ColorUIResource(116, 47, 158));
        bt9.setBackground(new ColorUIResource(116, 47, 158));
        
        bt1.setColorHover(new ColorUIResource(181, 113, 209));
        bt2.setColorHover(new ColorUIResource(181, 113, 209));
        bt3.setColorHover(new ColorUIResource(181, 113, 209));
        bt4.setColorHover(new ColorUIResource(181, 113, 209));
        bt5.setColorHover(new ColorUIResource(181, 113, 209));
        bt6.setColorHover(new ColorUIResource(181, 113, 209));
        bt7.setColorHover(new ColorUIResource(181, 113, 209));
        bt8.setColorHover(new ColorUIResource(181, 113, 209));
        bt9.setColorHover(new ColorUIResource(181, 113, 209));

        jLabel1.setText("Ng??y t???ng k???t");

        bt1.setText("Generate");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setText("Th???ng k?? theo ng??y");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setText("Xu???t file excel");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setText("X??a");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setText("L??m m???i");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        jLabel2.setText("Doanh thu theo th??ng");

        jLabel3.setText("Th??ng c?? doanh thu cao nh???t");

        jLabel4.setText("Trung b??nh doanh thu c???a n??m");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Ng??y th???ng k??", "Doanh thu"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        bt6.setText("Doanh thu theo th??ng");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt7.setText("L??u ra Excel");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setText("Th???ng k??");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setText("T??nh");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt2)
                        .addGap(29, 29, 29)
                        .addComponent(bt3)
                        .addGap(60, 60, 60)
                        .addComponent(bt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(bt5)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf2)
                            .addComponent(tf3)
                            .addComponent(tf4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt7))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt8)
                                    .addComponent(bt9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt2)
                    .addComponent(bt3)
                    .addComponent(bt4)
                    .addComponent(bt5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6)
                    .addComponent(bt7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        Time t=new Time();
        tf1.setText(t.Date());
        DefaultTableModel models = (DefaultTableModel)jTable2.getModel();
        int i=0;
                jTable2.setValueAt(tf1.getText(), i,0);
                models.addRow(new Object[] {});
        i++; 
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        dtbll=new DT_BLL();
        DefaultTableModel models = (DefaultTableModel)jTable2.getModel();   
        jTable2.setValueAt(dtbll.Statistic(), i, 1);
        models.addRow(new Object[] {});
        i++; 
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        FileInputStream myxls = null;
        try {
            //System.out.println(System.getProperty("user.dir"));
            myxls = new FileInputStream("Excel/DTNgay.xls");
            HSSFWorkbook wkb = new HSSFWorkbook(myxls);
            HSSFSheet sheet = wkb.getSheetAt(0);
            int lastRow=sheet.getLastRowNum();
            HSSFRow row = sheet.createRow(++lastRow);
            row.createCell(0).setCellValue(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),0)) );
            row.createCell(1).setCellValue(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(),1)) );
                // ghi d??? li???u xu???ng file
                FileOutputStream out = new FileOutputStream(new File("Excel/DTNgay.xls"));
                wkb.write(out);
                out.close();
                System.out.println("Save successfully on disk."); 
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"B???n ch???n 1 tr?????ng ????? nh???p");
        } catch (IOException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        dtbll=new DT_BLL();
        dtbll.Delete();
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        try
        {
            tf1.setText("");
            for(int i=0;i<jTable2.getRowCount();i++)
            {
                if(jTable2.isRowSelected(i))
                {
                    jTable2.setValueAt("", i, 0);
                    jTable2.setValueAt("", i, 1);
                }
            } 
        }catch(NumberFormatException ne){
            ne.printStackTrace();
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        FileInputStream myxls = null;
        try
        {
            myxls = new FileInputStream("Excel/DTNgay.xls");
            HSSFWorkbook wkb = new HSSFWorkbook(myxls);
            HSSFSheet datatypeSheet = wkb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            total+=Integer.parseInt(fmt.formatCellValue(firstRow.getCell(1)));
            ArrayList<DT_DTO> listdt = new ArrayList();
            while (iterator.hasNext()) {
            Row currentRow= iterator.next() ;
            DT_DTO dtdto = new DT_DTO();
            dtdto.setTotal(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(1))));
            listdt.add(dtdto);
            }
            for (DT_DTO dt:listdt) 
            {
                total+=dt.getTotal();
            }
            tf2.setText(String.valueOf(total));
            wkb.close();
        }       
        catch (FileNotFoundException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        FileInputStream myxls = null;
       t=new Time();
        try {
            myxls = new FileInputStream("Excel/DTThang.xls");
            HSSFWorkbook wkb = new HSSFWorkbook(myxls);
            HSSFSheet sheet = wkb.getSheetAt(0);
            int lastRow=sheet.getLastRowNum();
            HSSFRow row = sheet.createRow(++lastRow);
            row.createCell(0).setCellValue((String) t.Month());
            row.createCell(1).setCellValue((String) tf2.getText());
                // ghi d??? li???u xu???ng file
                FileOutputStream out = new FileOutputStream(new File("Excel/DTThang.xls"));
                wkb.write(out);
                out.close();
                System.out.println("Save successfully on disk."); 
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            JFrame fr=new JFrame(); 
            JOptionPane.showMessageDialog(fr,"B???n ch???n 1 tr?????ng ????? nh???p");
        } catch (IOException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        FileInputStream myxls = null;
        int max=0;
        String m=null; 
        try
        {
            DT_DTO dtdto = new DT_DTO();
            ArrayList<DT_DTO> listdt = new ArrayList();
            myxls = new FileInputStream("Excel/DTThang.xls");
            HSSFWorkbook wkb = new HSSFWorkbook(myxls);
            HSSFSheet datatypeSheet = wkb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            dtdto.set(fmt.formatCellValue(firstRow.getCell(0)), Integer.parseInt(fmt.formatCellValue(firstRow.getCell(1))));       // Th??m b??? ?????u v??o ARRList
            listdt.add(dtdto);
            while (iterator.hasNext()) {
                Row currentRow= iterator.next();  
                dtdto.set(fmt.formatCellValue(currentRow.getCell(0)), Integer.parseInt(fmt.formatCellValue(currentRow.getCell(1))));    // Th??m c??c b??? cl v??o ARRList
                listdt.add(dtdto);
            }
            for (int i=0;i<listdt.size();i++) 
            {
                if(max < listdt.get(i).getTotal())
                {
                    m=listdt.get(i).Month();
                    max=listdt.get(i).getTotal();
                }
            }
            tf3.setText(m+"-"+max);
            wkb.close();
        }       
        catch (FileNotFoundException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        FileInputStream myxls = null;
        int i=0;
        try
        {
            myxls = new FileInputStream("Excel/DTThang.xls");
            HSSFWorkbook wkb = new HSSFWorkbook(myxls);
            HSSFSheet datatypeSheet = wkb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            total+=Integer.parseInt(fmt.formatCellValue(firstRow.getCell(1)));
            ArrayList<DT_DTO> listdt = new ArrayList();
            while (iterator.hasNext()) {
            Row currentRow= iterator.next() ;
            DT_DTO dtdto = new DT_DTO();
            dtdto.setTotal(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(1))));
            listdt.add(dtdto);
            }
            for (;i<listdt.size();i++) 
            {
                total+=listdt.get(i).getTotal();
            }
            total/=i+1;
            tf4.setText(String.valueOf(total));
            wkb.close();
        }       
        catch (FileNotFoundException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bt9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonCustomed bt1;
    private ButtonCustomed bt2;
    private ButtonCustomed bt3;
    private ButtonCustomed bt4;
    private ButtonCustomed bt5;
    private ButtonCustomed bt6;
    private ButtonCustomed bt7;
    private ButtonCustomed bt8;
    private ButtonCustomed bt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
