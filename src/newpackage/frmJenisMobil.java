/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
/**
 *
 * @author sigit masaid
 */
import koneksi.koneksiDB;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmJenisMobil extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    String kdJenisMobil, nmJenisMobil, fasilitas;
    /**
     * Creates new form frmJenisMobil
     */
    public frmJenisMobil() {
        initComponents();
        model = new DefaultTableModel();
        
        tblJenisMobil.setModel(model);
        model.addColumn("KODE JENIS MOBL");
        model.addColumn("NAMA JENIS MOBIL");
        model.addColumn("FASILITAS");
        
        
        getDataJenisMobil();
    }
    
     
    public void getDataJenisMobil(){
       
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
     
        try{
           
            Statement stat = (Statement) koneksiDB.getkoneksi().createStatement();
            
                  
            String sql = "SELECT * FROM tb_jenis_mobil";
            ResultSet res = stat.executeQuery(sql);
            
          
            while(res.next()){
               
                Object[] obj = new Object[3];
                obj[0]=res.getString("kd_jenis");
                obj[1]=res.getString("nama_jenis");
                obj[2]=res.getString("fasilitas");
                model.addRow(obj);
            }
        }catch(SQLException err){
           JOptionPane.showMessageDialog(null, err.getMessage());
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

        jLabel2 = new javax.swing.JLabel();
        txtKdJenisMobil = new javax.swing.JTextField();
        txtNmJenisMobil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJenisMobil = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        baru = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFasilitas = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setText("KODE JENIS");

        txtNmJenisMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmJenisMobilActionPerformed(evt);
            }
        });

        jLabel3.setText("NAMA JENIS");

        tblJenisMobil.setBackground(new java.awt.Color(255, 255, 0));
        tblJenisMobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblJenisMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJenisMobilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblJenisMobil);

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        baru.setText("BARU");
        baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruActionPerformed(evt);
            }
        });

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 0, 0));
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\NOTEBOOK\\Downloads\\MO.png")); // NOI18N

        jLabel5.setText("FASILITAS");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("MASTER DATA JENIS MOBIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpan)
                                .addGap(12, 12, 12)
                                .addComponent(baru)
                                .addGap(18, 18, 18)
                                .addComponent(edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(keluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtKdJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNmJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKdJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNmJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(baru)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void loadDataJenisMobil(){
        kdJenisMobil = txtKdJenisMobil.getText();
        nmJenisMobil = txtNmJenisMobil.getText();
        fasilitas = txtFasilitas.getText();
    }
    
    public void dataSelect(){
       
        int i = tblJenisMobil.getSelectedRow();
        
        if(i == -2){
            return;
        }
        txtKdJenisMobil.setText(""+model.getValueAt(i,0));
        txtNmJenisMobil.setText(""+model.getValueAt(i,1));
        txtFasilitas.setText(""+model.getValueAt(i,2));
    }
    
    public void reset(){
        kdJenisMobil = "";
        nmJenisMobil = "";
        fasilitas = "";
               
        txtKdJenisMobil.setText(kdJenisMobil);
        txtNmJenisMobil.setText(nmJenisMobil);
        txtFasilitas.setText(fasilitas);
    }
    
    public void simpanDataJenisMobil(){
        loadDataJenisMobil();
        
        try{
            
            Statement stat = (Statement) koneksiDB.getkoneksi().createStatement();
            
           
            String  sql =   "INSERT INTO tb_jenis_mobil(kd_jenis, nama_jenis, fasilitas)" + "VALUES('"+ kdJenisMobil +"','"+ nmJenisMobil +"','"+ fasilitas +"')";
            PreparedStatement p = (PreparedStatement) koneksiDB.getkoneksi().prepareStatement(sql);
            p.executeUpdate();
            
            
            getDataJenisMobil();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void perbaruiDataJenisMobil(){
        
        loadDataJenisMobil();
        
        try{
           
            Statement stat = (Statement) koneksiDB.getkoneksi().createStatement();
            
            
            String sql = "UPDATE tb_jenis_mobil SET fasilitas = '"+ fasilitas +"' WHERE kd_jenis = '"+ kdJenisMobil +"'";
            PreparedStatement p =(PreparedStatement)koneksiDB.getkoneksi().prepareStatement(sql);
            p.executeUpdate();
            
            
            getDataJenisMobil();
            
          
            reset();
            JOptionPane.showMessageDialog(null, "PERUBAHAN DATA BERHASIL");
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    private void tblJenisMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJenisMobilMouseClicked
        //memanggil fungsi memilih data
        dataSelect();
    }//GEN-LAST:event_tblJenisMobilMouseClicked

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        simpanDataJenisMobil();                                       
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        perbaruiDataJenisMobil();  
    }//GEN-LAST:event_editActionPerformed

     public void hapusDataJenisMobil(){
  
        loadDataJenisMobil(); 
        
        
        int pesan = JOptionPane.showConfirmDialog(null, "HAPUS DATA"+ kdJenisMobil +"?","KONFIRMASI", JOptionPane.OK_CANCEL_OPTION);
        
   
        if(pesan == JOptionPane.OK_OPTION){
           
            try{
                
                Statement stat = (Statement) koneksiDB.getkoneksi().createStatement();
                
             
                String sql = "DELETE FROM tb_jenis_mobil WHERE kd_jenis='"+ kdJenisMobil +"'";
                PreparedStatement p =(PreparedStatement)koneksiDB.getkoneksi().prepareStatement(sql);
                p.executeUpdate();
                
               
                getDataJenisMobil();
              
                reset();
                JOptionPane.showMessageDialog(null, "JENIS MOBIL BERHASIL DIHAPUS");
            }catch(SQLException err){
                JOptionPane.showMessageDialog(null, err.getMessage());
            }
        }
    }
    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        hapusDataJenisMobil();
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmUtama().setVisible(true);
    }//GEN-LAST:event_keluarActionPerformed

    private void baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_baruActionPerformed

    private void txtNmJenisMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmJenisMobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmJenisMobilActionPerformed

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
            java.util.logging.Logger.getLogger(frmJenisMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmJenisMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmJenisMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmJenisMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmJenisMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baru;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tblJenisMobil;
    private javax.swing.JTextField txtFasilitas;
    private javax.swing.JTextField txtKdJenisMobil;
    private javax.swing.JTextField txtNmJenisMobil;
    // End of variables declaration//GEN-END:variables
}
