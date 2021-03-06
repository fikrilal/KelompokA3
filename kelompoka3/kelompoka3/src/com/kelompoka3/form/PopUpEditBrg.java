package com.kelompoka3.form;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.kelompoka3.koneksi.koneksi;
import com.kelompoka3.form.formBarang;
import static com.kelompoka3.form.formBarang.Id;

public class PopUpEditBrg extends javax.swing.JFrame {

    public PopUpEditBrg() {
        initComponents();
        TampilanData();
        idBrg.setHint("Id Barang");
        idBrg.setEditable(false);
        nmBrg.setHint("Nama Barang");
        jnsBrg.setHint("Jenis");
        wrnBrg.setHint("Warna");
        hrgJual.setHint("Harga Jual");
        hrgBrgBeli.setHint("Harga Beli");
        stokBrg.setHint("Stok");
    }

    private void EditData() {
        String sql = "UPDATE barang SET namaBarang = '" + nmBrg.getText() + "',jenis = '" + jnsBrg.getText() + "',"
                + " warna = '" + wrnBrg.getText() + "',hargaBeli = '" + hrgBrgBeli.getText() + "', hargaJual = '"
                + hrgJual.getText() + "',stok = '" + stokBrg.getText() + "' WHERE idBarang = '" + idBrg.getText() + "'";
        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
            TampilanData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    private void TampilanData() {
        String sql = "SELECT idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok FROM barang WHERE idBarang = '" + formBarang.Id.getText() + "'";
        System.out.println(sql);
        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                idBrg.setText(rs.getString("idBarang"));
                nmBrg.setText(rs.getString("namaBarang"));
                jnsBrg.setText(rs.getString("jenis"));
                wrnBrg.setText(rs.getString("warna"));
                hrgJual.setText(rs.getString("hargaJual"));
                hrgBrgBeli.setText(rs.getString("hargaBeli"));
                stokBrg.setText(rs.getString("stok"));
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnEdit = new com.kelompoka3.swing.ButtonCustom();
        btnBatal = new com.kelompoka3.swing.ButtonCustom();
        idBrg = new com.kelompoka3.swing.MyTextField();
        nmBrg = new com.kelompoka3.swing.MyTextField();
        jnsBrg = new com.kelompoka3.swing.MyTextField();
        wrnBrg = new com.kelompoka3.swing.MyTextField();
        hrgJual = new com.kelompoka3.swing.MyTextField();
        hrgBrgBeli = new com.kelompoka3.swing.MyTextField();
        stokBrg = new com.kelompoka3.swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnEdit.setText("Simpan");
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnBatal.setText("Kembali");
        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBatal.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jnsBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnsBrgActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit data barang");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(nmBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jnsBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(wrnBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(hrgJual, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(hrgBrgBeli, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(stokBrg, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jnsBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(wrnBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hrgBrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        EditData();
        idBrg.setText("");
        nmBrg.setText("");
        jnsBrg.setText("");
        wrnBrg.setText("");
        hrgJual.setText("");
        hrgBrgBeli.setText("");
        stokBrg.setText("");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void jnsBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnsBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnsBrgActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpEditBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpEditBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpEditBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpEditBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpEditBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.kelompoka3.swing.ButtonCustom btnBatal;
    private com.kelompoka3.swing.ButtonCustom btnEdit;
    private com.kelompoka3.swing.MyTextField hrgBrgBeli;
    private com.kelompoka3.swing.MyTextField hrgJual;
    private com.kelompoka3.swing.MyTextField idBrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private com.kelompoka3.swing.MyTextField jnsBrg;
    private com.kelompoka3.swing.MyTextField nmBrg;
    private com.kelompoka3.swing.MyTextField stokBrg;
    private com.kelompoka3.swing.MyTextField wrnBrg;
    // End of variables declaration//GEN-END:variables

}
