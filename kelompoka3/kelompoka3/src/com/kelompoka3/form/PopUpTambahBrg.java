/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompoka3.form;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.kelompoka3.koneksi.koneksi;
import com.onbarcode.barcode.EAN13;
import com.onbarcode.barcode.IBarcode;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class PopUpTambahBrg extends javax.swing.JFrame {

    public PopUpTambahBrg() {
        initComponents();
        TampilanData();
        table1.addTableStyle(jScrollPane1);
    }
    private String sql = "";
    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;

    private void TambahkanData() {
        idBarang = String.valueOf(idBrg.getText());
        namaBarang = String.valueOf(nmBrg.getText());
        jenis = String.valueOf(jnsBrg.getText());
        warna = String.valueOf(wrnBrg.getText());
        hargaJual = String.valueOf(hrgBrgBeli.getText());
        hargaBeli = String.valueOf(hrgJual.getText());
        stok = String.valueOf(stokBrg.getText());
        String brcode = "C://drivers//" + this.nmBrg.getText().toString() + ".png";

        sql = "INSERT INTO barang VALUES ( '" + idBarang + "','" + namaBarang + "', '" + jenis + "', "
                + "'" + warna + "', '" + hargaJual + "', '" + hargaBeli + "', '" + stok + "', '" + brcode + "')";
        System.out.println(sql);
        try {

            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            TampilanData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n" + e.getMessage());
        }
    }

    private void TampilanData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis Barang");
        model.addColumn("Warna");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("Stok");
        model.addColumn("Barcode");

        String sql = "SELECT * FROM `barang`";
        System.out.println(sql);

        try {
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});

            }
            table1.setModel(model);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBatal = new com.kelompoka3.swing.ButtonCustom();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.kelompoka3.swing.Table();
        btnBatal1 = new com.kelompoka3.swing.ButtonCustom();
        btnSimpan = new com.kelompoka3.swing.ButtonCustom();
        jLabel2 = new javax.swing.JLabel();
        BCD = new javax.swing.JLabel();

        btnBatal.setText("B AT A L");
        btnBatal.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

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

        jLabel1.setText("TAMBAH BARANG");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnBatal1.setText("B AT A L");
        btnBatal1.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.DESTRUCTIVE);
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        btnSimpan.setText("S I M P AN");
        btnSimpan.setStyle(com.kelompoka3.swing.ButtonCustom.ButtonStyle.SECONDARY);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Barcode");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nBarang)
                    .addComponent(jBarang)
                    .addComponent(IDbrg)
                    .addComponent(wrn)
                    .addComponent(hrg1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Stok, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jnsBrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(wrnBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hrgBrgBeli, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hrgJual, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nmBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idBrg, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BCD, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDbrg)
                    .addComponent(idBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BCD, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        TambahkanData();
        encodeBarcode();

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        int baris = table1.rowAtPoint(evt.getPoint());
        if (table1.getValueAt(baris, 0) == null) {
            idBrg.setText("");
        } else {
            idBrg.setText(table1.getValueAt(baris, 0).toString());
        }
        if (table1.getValueAt(baris, 1) == null) {
            nmBrg.setText("");
        } else {
            nmBrg.setText(table1.getValueAt(baris, 1).toString());
        }
        if (table1.getValueAt(baris, 2) == null) {
            jnsBrg.setText("");
        } else {
            jnsBrg.setText(table1.getValueAt(baris, 2).toString());
        }
        if (table1.getValueAt(baris, 3) == null) {
            wrnBrg.setText("");
        } else {
            wrnBrg.setText(table1.getValueAt(baris, 3).toString());
        }
        if (table1.getValueAt(baris, 4) == null) {
            hrgJual.setText("");
        } else {
            hrgJual.setText(table1.getValueAt(baris, 4).toString());
        }
        if (table1.getValueAt(baris, 5) == null) {
            hrgBrgBeli.setText("");
        } else {
            hrgBrgBeli.setText(table1.getValueAt(baris, 5).toString());
        }
        if (table1.getValueAt(baris, 6) == null) {
            stokBrg.setText("");
        } else {
            stokBrg.setText(table1.getValueAt(baris, 6).toString());
        }
        if (table1.getValueAt(baris, 7) == null) {

        } else {
            File fps = new File(table1.getValueAt(baris, 7).toString());
            try {
                Image mImage = ImageIO.read(fps);
                ImageIcon mImageIc = new ImageIcon(mImage);
                mImage = mImageIc.getImage().getScaledInstance(BCD.getWidth(), BCD.getHeight(), Image.SCALE_SMOOTH);
                this.BCD.setIcon(new ImageIcon(mImage));
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_table1MouseClicked

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
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpTambahBrg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpTambahBrg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BCD;
    private javax.swing.JLabel IDbrg;
    private javax.swing.JLabel Stok;
    private com.kelompoka3.swing.ButtonCustom btnBatal;
    private com.kelompoka3.swing.ButtonCustom btnBatal1;
    private com.kelompoka3.swing.ButtonCustom btnSimpan;
    private javax.swing.JLabel hrg;
    private javax.swing.JLabel hrg1;
    private javax.swing.JTextField hrgBrgBeli;
    private javax.swing.JTextField hrgJual;
    private javax.swing.JTextField idBrg;
    private javax.swing.JLabel jBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnsBrg;
    private javax.swing.JLabel nBarang;
    private javax.swing.JTextField nmBrg;
    private javax.swing.JTextField stokBrg;
    private com.kelompoka3.swing.Table table1;
    private javax.swing.JLabel wrn;
    private javax.swing.JTextField wrnBrg;
    // End of variables declaration//GEN-END:variables

    public void encodeBarcode() {

        EAN13 objEan = new EAN13();
        objEan.setData(this.idBrg.getText().toString());
        objEan.setUom(IBarcode.UOM_PIXEL);
        objEan.setX(3f);
        objEan.setY(175f);

        objEan.setLeftMargin(0f);
        objEan.setRightMargin(0f);
        objEan.setTopMargin(0f);
        objEan.setBottomMargin(0f);
        objEan.setResolution(72);
        objEan.setShowText(true);
        objEan.setTextMargin(6);
        objEan.setRotate(IBarcode.ROTATE_0);
        try {
            objEan.drawBarcode("C://drivers//" + this.nmBrg.getText().toString() + ".png");
            JOptionPane.showMessageDialog(this, "BARCODE BERHASIL.....");

        } catch (Exception ex) {
        }
    }

    public void setUkuranBarCode(EAN13 mBarcode, float panjangBarcode, float tinggiBarcode) {
        mBarcode.setX(panjangBarcode);
        mBarcode.setY(tinggiBarcode);

    }
}
