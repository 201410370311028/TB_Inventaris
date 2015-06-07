
package Inventaris;


import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author q
 */
public class GUI_Data_Kelas extends javax.swing.JFrame {
   
    Connection connect = null;
    ResultSet RS =null;
    PreparedStatement pst=null;
    
    public GUI_Data_Kelas() {
        initComponents();
        connect=SqliteConnection.dbConnector();
        update_table();
        
    }
    
    public void update_table(){
        
        try{String sql = "select * from Data_Pengguna";
        pst = connect.prepareStatement(sql);
        RS=pst.executeQuery();
        Result_Penguna.setModel(DbUtils.resultSetToTableModel(RS));
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Status_Kelas = new javax.swing.JButton();
        Menu_Data = new javax.swing.JButton();
        Menu_Kenyamanan = new javax.swing.JButton();
        Menu_Lingkungan = new javax.swing.JButton();
        Menu_Keamanan = new javax.swing.JButton();
        Menu_Kebersihan = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Gedung = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Jurusan = new javax.swing.JComboBox();
        Input_Kelas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Panjang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Lebar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Jum_Kursi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jum_Jendela = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Jum_Pintu = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result_Penguna = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status_Kelas.setText("Inventaris");
        jPanel1.add(Status_Kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 40));

        Menu_Data.setText("Data Pengguna");
        Menu_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_DataActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        Menu_Kenyamanan.setText("Kenyamanan");
        jPanel1.add(Menu_Kenyamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 40));

        Menu_Lingkungan.setText("Lingkungan");
        Menu_Lingkungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_LingkunganActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Lingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        Menu_Keamanan.setText("Keamanan");
        Menu_Keamanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_KeamananActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Keamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 40));

        Menu_Kebersihan.setText("Kebersihan");
        Menu_Kebersihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_KebersihanActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Kebersihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -50, -1, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 430));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Kelas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        jLabel4.setText("Gedung");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 30));

        Gedung.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GKB 1", "GKB 2", "GKB 3" }));
        jPanel2.add(Gedung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 30));

        jLabel5.setText("Jurusan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 30));

        Jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIPIL", "INFORMATIKA", "INDUSTRI", "ELEKTRO", "MESIN" }));
        jPanel2.add(Jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        Input_Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_KelasActionPerformed(evt);
            }
        });
        jPanel2.add(Input_Kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 180, 220));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Panjang Kelas");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        Panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PanjangActionPerformed(evt);
            }
        });
        jPanel3.add(Panjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 30));

        jLabel7.setText("Lebar Kelas");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));
        jPanel3.add(Lebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 30));

        jLabel9.setText("Jumlah Kursi");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 20));
        jPanel3.add(Jum_Kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 30));

        jLabel2.setText("STATUS RUANGAN KELAS");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 10));

        jLabel8.setText("Jumlah Jendela");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, 20));

        Jum_Jendela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jum_JendelaActionPerformed(evt);
            }
        });
        jPanel3.add(Jum_Jendela, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 70, 30));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel3.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 30));

        jLabel11.setText("Jumlah Pintu");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 20));

        Jum_Pintu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jum_PintuActionPerformed(evt);
            }
        });
        jPanel3.add(Jum_Pintu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 260, 220));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("DATA PENGGUNA");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 430, 40));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Result Data Pengguna");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        Result_Penguna.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Result_Penguna);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 400, 160));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 440, 210));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_DataActionPerformed
        GUI_Data_Kelas gdk = new GUI_Data_Kelas();
        gdk.Data_Kelas();
    }//GEN-LAST:event_Menu_DataActionPerformed
        Analisis A = new Analisis();
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
         A.setRuang(Input_Kelas.getText());
            A.setLokasi(Gedung.getSelectedItem().toString());
            A.setJurusan(Jurusan.getSelectedItem().toString());
            A.setJum_Jendela(Integer.parseInt(Jum_Jendela.getText()));
            A.setJum_Kursi(Integer.parseInt(Jum_Kursi.getText()));
            A.setJum_Pintu(Integer.parseInt(Jum_Pintu.getText()));
            A.setPanjang(Integer.parseInt(Panjang.getText()));
            A.setLebar(Integer.parseInt(Lebar.getText()));
            update_table();
        try{
          String sql = "insert into Data_Pengguna(Kelas , Gedung , Jurusan ,Panjang , Lebar , Pintu , Kursi , Jendela) values (?,?,?,?,?,?,?,?)";
          pst=connect.prepareStatement(sql);
          pst.setString(1,Input_Kelas.getText());
          pst.setString(2,Gedung.getSelectedItem().toString());
          pst.setString(3,Jurusan.getSelectedItem().toString());
          pst.setString(4,Jum_Jendela.getText());
          pst.setString(5,Jum_Kursi.getText());
          pst.setString(6,Jum_Pintu.getText());
          pst.setString(7, Panjang.getText());
          pst.setString(8, Lebar.getText());
          pst.execute();
          
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void Input_KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_KelasActionPerformed
      
    }//GEN-LAST:event_Input_KelasActionPerformed

    private void Jum_JendelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jum_JendelaActionPerformed
       
    }//GEN-LAST:event_Jum_JendelaActionPerformed

    private void Jum_PintuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jum_PintuActionPerformed
        
    }//GEN-LAST:event_Jum_PintuActionPerformed
    private void Menu_LingkunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_LingkunganActionPerformed
        GUI_Lingkungan panggil_lingkung = new GUI_Lingkungan();
        panggil_lingkung.Lingkungan_GUI();
    }//GEN-LAST:event_Menu_LingkunganActionPerformed

    private void Menu_KebersihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_KebersihanActionPerformed
        GUI_Kebersihan gk = new GUI_Kebersihan();
        gk.Kebersihan_GUI();
    }//GEN-LAST:event_Menu_KebersihanActionPerformed

    private void Menu_KeamananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_KeamananActionPerformed
        GUI_Keamanan ga = new GUI_Keamanan();
        ga.Keamanan_GUI();
    }//GEN-LAST:event_Menu_KeamananActionPerformed

    private void PanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PanjangActionPerformed
        Analisis identitas = new Analisis();
        identitas.setPanjang(Integer.parseInt(Panjang.getText()));
    }//GEN-LAST:event_PanjangActionPerformed

  
    public void Data_Kelas() {
      
       new GUI_Data_Kelas().setVisible(true);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Gedung;
    private javax.swing.JTextField Input_Kelas;
    private javax.swing.JTextField Jum_Jendela;
    private javax.swing.JTextField Jum_Kursi;
    private javax.swing.JTextField Jum_Pintu;
    private javax.swing.JComboBox Jurusan;
    private javax.swing.JTextField Lebar;
    private javax.swing.JButton Menu_Data;
    private javax.swing.JButton Menu_Keamanan;
    private javax.swing.JButton Menu_Kebersihan;
    private javax.swing.JButton Menu_Kenyamanan;
    private javax.swing.JButton Menu_Lingkungan;
    private javax.swing.JTextField Panjang;
    private javax.swing.JTable Result_Penguna;
    private javax.swing.JButton Status_Kelas;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
