/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PopUpTambah extends javax.swing.JFrame {

    /**
     * Creates new form PopUpTambah
     */
    public PopUpTambah() {
        initComponents();
    }
     private String sql="";
    private String idBarang, namaBarang, jenis, warna, hargaJual, hargaBeli, stok;
    private void TambahkanData(){
        idBarang=String.valueOf(idBrg.getText());
        namaBarang = String.valueOf(nmBrg.getText());
        jenis = String.valueOf(jnsBrg.getText());
        warna=String.valueOf(wrnBrg.getText());
        hargaJual=String.valueOf(hrgBrgBeli.getText());
        hargaBeli = String.valueOf(hrgJual.getText());
        stok = String.valueOf(stokBrg.getText());
        sql="INSERT INTO barang VALUES ( '"+idBarang+"','"+namaBarang+"', '"+jenis+"', '"+warna+"', '"+hargaJual+"', '"+hargaBeli+"', '"+stok+"')";
        System.out.println(sql);
        try{
            
            java.sql.Connection conn=(Connection)koneksi.koneksi();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR \n"+e.getMessage());
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
        simpan = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        jLabel1.setText("TAMBAH BARANG");

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
                    .addComponent(hrgBrgBeli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(hrgJual, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrnBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnsBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nmBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(simpan)
                        .addGap(18, 18, 18)
                        .addComponent(Batal))
                    .addComponent(idBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stokBrg))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
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
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrg1)
                    .addComponent(hrgBrgBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrgJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stok)
                    .addComponent(stokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(Batal))
                .addContainerGap(91, Short.MAX_VALUE))
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

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        TambahkanData();

        /**idBrg.setText("");
        nmBrg.setText("");
        jnsBrg.setText("");
        wrnBrg.setText("");
        hrgJual.setText("");
        hrgBrgBeli.setText("");
        stokBrg.setText("");**/
    }//GEN-LAST:event_simpanActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_BatalActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpTambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpTambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JLabel IDbrg;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel hrg;
    private javax.swing.JLabel hrg1;
    private javax.swing.JTextField hrgBrgBeli;
    private javax.swing.JTextField hrgJual;
    private javax.swing.JTextField idBrg;
    private javax.swing.JLabel jBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jnsBrg;
    private javax.swing.JLabel nBarang;
    private javax.swing.JTextField nmBrg;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField stokBrg;
    private javax.swing.JLabel wrn;
    private javax.swing.JTextField wrnBrg;
    // End of variables declaration//GEN-END:variables
}
