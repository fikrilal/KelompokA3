package com.kelompoka3.form;

import com.kelompoka3.koneksi.koneksi;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syailendra
 */
public class FormSuplier extends javax.swing.JPanel {

    /**
     * Creates new form formBarang
     */
    public FormSuplier() {
        initComponents();
        TampilanData();
    }
    private void CariData(String Key){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Suplier");
        model.addColumn("Nama Suplier");
        model.addColumn("Alamat");        
        model.addColumn("No Telfon");
        model.addColumn("Keterangan");
        
        
        String sql="SELECT * FROM suplier WHERE namaSuplier LIKE '%"+Key+"%'";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)});
                
            }
            jtable1.setModel(model);            
        }catch(Exception e){
            e.getMessage();
        }
    
        
    }
    private void TampilanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Suplier");
        model.addColumn("Nama Suplier");
        model.addColumn("Alamat");        
        model.addColumn("No Telfon");
        model.addColumn("Keterangan");
        
        
        String sql="SELECT * FROM `suplier`";
        System.out.println(sql);
        
        try{
            java.sql.Connection conn = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            java.sql.ResultSet rs = stm.executeQuery();
           
            while(rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5)});
                
                
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

        jPanel1 = new javax.swing.JPanel();
        hps1 = new javax.swing.JButton();
        edit1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        tbh1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        crBrg = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        hps1.setBackground(new java.awt.Color(255, 0, 0));
        hps1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Delete.png"))); // NOI18N
        hps1.setText("Hapus");
        hps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hps1ActionPerformed(evt);
            }
        });

        edit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kelompoka3/icons/Edit.png"))); // NOI18N
        edit1.setText("Edit");
        edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ActionPerformed(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Suplier", "Nama Suplier", "No HP", "Alamat", "Keterangan"
            }
        ));
        jtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable1);

        tbh1.setBackground(new java.awt.Color(0, 102, 51));
        tbh1.setText("+Tambah");
        tbh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbh1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari Barang");

        crBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                crBrgKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbh1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hps1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit1)))
                .addGap(0, 197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tbh1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hps1)
                    .addComponent(edit1))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hps1ActionPerformed
        // TODO add your handling code here:
        new PopUpHapusSuplier().setVisible(true);
        //       HapusData();
    }//GEN-LAST:event_hps1ActionPerformed

    private void edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ActionPerformed
        // TODO add your handling code here:
        // EditData();
        new PopUpEditSuplier().setVisible(true);
    }//GEN-LAST:event_edit1ActionPerformed

    private void jtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable1MouseClicked
        // TODO add your handling code here:

        /**  int baris = jtable1.rowAtPoint(evt.getPoint());
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
        } **/
    }//GEN-LAST:event_jtable1MouseClicked

    private void tbh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbh1ActionPerformed
        new PopUpTambahSuplier().setVisible(true);
        /** if(hrgBrgBeli.getText().equals("")|| hrgJual.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Isi dahulu");
        }else{
            TambahkanData();
        }
        /**DefaultTableModel dataModel = (DefaultTableModel) jtable1.getModel();
        List list = new ArrayList<>();
        jtable1.setAutoCreateColumnsFromModel(true);
        list.add(idBrg.getText());
        list.add(nmBrg.getText());
        list.add(jnsBrg.getText());
        list.add(wrnBrg.getText());
        list.add(hrgBrgBeli.getText());
        list.add(hrgJual.getText());
        dataModel.addRow(list.toArray());**/
    }//GEN-LAST:event_tbh1ActionPerformed

    private void crBrgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crBrgKeyReleased
        String key=crBrg.getText();

        if(key!=""){
            CariData(key);
        }else{
            TampilanData();
        }
    }//GEN-LAST:event_crBrgKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField crBrg;
    private javax.swing.JButton edit1;
    private javax.swing.JButton hps1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable1;
    private javax.swing.JButton tbh1;
    // End of variables declaration//GEN-END:variables
}
