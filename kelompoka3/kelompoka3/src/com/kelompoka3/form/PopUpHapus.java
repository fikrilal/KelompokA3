/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class PopUpHapus extends javax.swing.JFrame {
 private String sql="";
    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;
    /**
     * Creates new form PopUpHapus
     */
    public PopUpHapus() {
        initComponents();
        TampilanData();
    }
      private void HapusData(){
        idBarang=String.valueOf(idBrg.getText());
        sql= "DELETE FROM barang WHERE idBarang = '"+idBarang+"'";
        try{  
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            TampilanData();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
        }
    }
    private void TampilanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");        
        model.addColumn("Warna");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");        
        model.addColumn("Stok");
        
        String sql="SELECT * FROM `barang`";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
           
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7)});
                
                
            }
            jtable1.setModel(model);            
        }catch(Exception e){
            e.getMessage();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nBarang = new javax.swing.JLabel();
        hrg1 = new javax.swing.JLabel();
        hrgJual = new javax.swing.JTextField();
        jBarang = new javax.swing.JLabel();
        IDbrg = new javax.swing.JLabel();
        wrn = new javax.swing.JLabel();
        hrg = new javax.swing.JLabel();
        nmBrg = new javax.swing.JTextField();
        jnsBrg = new javax.swing.JTextField();
        hrgBrgBeli = new javax.swing.JTextField();
        idBrg = new javax.swing.JTextField();
        wrnBrg = new javax.swing.JTextField();
        Stok = new javax.swing.JLabel();
        stokBrg = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        nBarang.setText("Nama Barang");

        hrg1.setText("Harga Jual");

        hrgJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrgJualActionPerformed(evt);
            }
        });

        jBarang.setText("Jenis Barang");

        IDbrg.setText("ID Barang");

        wrn.setText("Warna");

        hrg.setText("Harga Beli");

        nmBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmBrgActionPerformed(evt);
            }
        });

        hrgBrgBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrgBrgBeliActionPerformed(evt);
            }
        });

        Stok.setText("Stok");

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Jenis Barang", "Warna", "Harga Jual", "Harga Beli", "Stok"
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nBarang)
                            .addComponent(jBarang)
                            .addComponent(IDbrg)
                            .addComponent(wrn)
                            .addComponent(hrg1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Stok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hrg, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrgBrgBeli)
                            .addComponent(hrgJual)
                            .addComponent(wrnBrg)
                            .addComponent(stokBrg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nmBrg)
                            .addComponent(jnsBrg)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Hapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(Batal))
                                    .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDbrg)
                    .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nBarang)
                    .addComponent(nmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBarang)
                    .addComponent(jnsBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wrn)
                    .addComponent(wrnBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrg1)
                    .addComponent(hrgBrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrg)
                    .addComponent(hrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hapus)
                    .addComponent(Batal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hrgJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrgJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hrgJualActionPerformed

    private void nmBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmBrgActionPerformed
        // TODO add your handling code here:
        formBarang brg = new formBarang();
        brg.setVisible(true);
        dispose();
    }//GEN-LAST:event_nmBrgActionPerformed

    private void hrgBrgBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrgBrgBeliActionPerformed
        // TODO add your handling code here:
        formBarang brg = new formBarang();
        brg.setVisible(true);
        dispose();
    }//GEN-LAST:event_hrgBrgBeliActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        HapusData();
        idBrg.setText("");
        nmBrg.setText("");
        jnsBrg.setText("");
        wrnBrg.setText("");
        hrgJual.setText("");
        hrgBrgBeli.setText("");
        stokBrg.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BatalActionPerformed

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:

        int baris = jtable1.rowAtPoint(evt.getPoint());
        if(jtable1.getValueAt(baris, 0)==null){
            idBrg.setText("");
        }else{
            idBrg.setText(jtable1.getValueAt(baris, 0).toString());
        }
        if(jtable1.getValueAt(baris, 1)==null){
            nmBrg.setText("");
        }else{
            nmBrg.setText(jtable1.getValueAt(baris, 1).toString());
        }
        if(jtable1.getValueAt(baris, 2)==null){
            jnsBrg.setText("");
        }else{
            jnsBrg.setText(jtable1.getValueAt(baris, 2).toString());
        }
        if(jtable1.getValueAt(baris, 3)==null){
            wrnBrg.setText("");
        }else{
            wrnBrg.setText(jtable1.getValueAt(baris, 3).toString());
        }
        if(jtable1.getValueAt(baris, 4)==null){
            hrgJual.setText("");
        }else{
            hrgJual.setText(jtable1.getValueAt(baris, 4).toString());
        }
        if(jtable1.getValueAt(baris, 5)==null){
            hrgBrgBeli.setText("");
        }else{
            hrgBrgBeli.setText(jtable1.getValueAt(baris, 5).toString());
        }if(jtable1.getValueAt(baris, 6)==null){
            stokBrg.setText("");
        }else{
            stokBrg.setText(jtable1.getValueAt(baris, 6).toString());
        }
    }//GEN-LAST:event_jtable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PopUpHapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpHapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpHapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpHapus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpHapus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JButton Hapus;
    private javax.swing.JLabel IDbrg;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel hrg;
    private javax.swing.JLabel hrg1;
    private javax.swing.JTextField hrgBrgBeli;
    private javax.swing.JTextField hrgJual;
    private javax.swing.JTextField idBrg;
    private javax.swing.JLabel jBarang;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnsBrg;
    private javax.swing.JTable jtable1;
    private javax.swing.JLabel nBarang;
    private javax.swing.JTextField nmBrg;
    private javax.swing.JTextField stokBrg;
    private javax.swing.JLabel wrn;
    private javax.swing.JTextField wrnBrg;
    // End of variables declaration//GEN-END:variables
}
