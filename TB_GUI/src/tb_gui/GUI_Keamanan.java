/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventaris;


public class GUI_Keamanan extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Keamanan
     */
    public GUI_Keamanan() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        Kokoh = new javax.swing.JCheckBox();
        T_Kokoh = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        Ada = new javax.swing.JCheckBox();
        T_Ada = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Aman = new javax.swing.JCheckBox();
        Bahaya = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(610, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ANALISA KEAMANAN");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 430, 40));

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
        Menu_Kenyamanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_KenyamananActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Kenyamanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 40));

        Menu_Lingkungan.setText("Lingkungan");
        Menu_Lingkungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_LingkunganActionPerformed(evt);
            }
        });
        jPanel1.add(Menu_Lingkungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        Menu_Keamanan.setText("Keamanan");
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

        jLabel2.setText("1. Kekokohan Bangunan");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        Kokoh.setText("Kokoh");
        Kokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KokohActionPerformed(evt);
            }
        });
        jPanel2.add(Kokoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        T_Kokoh.setText("Tidak Kokoh");
        T_Kokoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_KokohActionPerformed(evt);
            }
        });
        jPanel2.add(T_Kokoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("2. Kunci Pintu dan Jendela");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        Ada.setText("Ada");
        Ada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaActionPerformed(evt);
            }
        });
        jPanel2.add(Ada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        T_Ada.setText("Tidak Ada");
        T_Ada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_AdaActionPerformed(evt);
            }
        });
        jPanel2.add(T_Ada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("3. Kemanan Bangunan ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, -1));

        Aman.setText("Aman");
        Aman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmanActionPerformed(evt);
            }
        });
        jPanel2.add(Aman, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Bahaya.setText("Bahaya");
        Bahaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BahayaActionPerformed(evt);
            }
        });
        jPanel2.add(Bahaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jButton1.setText("Submit");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 380, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_DataActionPerformed
        GUI_Data_Kelas gdk = new GUI_Data_Kelas();
        gdk.Data_Kelas();
    }//GEN-LAST:event_Menu_DataActionPerformed

    private void Menu_LingkunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_LingkunganActionPerformed
        GUI_Lingkungan call_lingkung = new GUI_Lingkungan();
        call_lingkung.Lingkungan_GUI();
    }//GEN-LAST:event_Menu_LingkunganActionPerformed

    private void T_KokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_KokohActionPerformed
        if(T_Kokoh.isSelected()){
            Kokoh.setSelected(false);
            aman.setKokoh("tidak_kokoh");
        }
    }//GEN-LAST:event_T_KokohActionPerformed

    private void T_AdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_AdaActionPerformed
        if(T_Ada.isSelected()){
            Ada.setSelected(false);
            aman.setKunci("tidak_ada");
        }
    }//GEN-LAST:event_T_AdaActionPerformed

    private void AdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaActionPerformed
        if(Ada.isSelected()){
            T_Ada.setSelected(false);
            aman.setKunci("ada");
        }
    }//GEN-LAST:event_AdaActionPerformed

    private void AmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmanActionPerformed
        if(Aman.isSelected()){
            Bahaya.setSelected(false);
            aman.setBahaya("aman");
        }
    }//GEN-LAST:event_AmanActionPerformed

    private void BahayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BahayaActionPerformed
        if(Bahaya.isSelected()){
            Aman.setSelected(false);
            aman.setBahaya("bahaya");
        }
    }//GEN-LAST:event_BahayaActionPerformed
Analisis aman = new Analisis();
    private void KokohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KokohActionPerformed
        if(Kokoh.isSelected()){
            T_Kokoh.setSelected(false);
            aman.setKokoh("kokoh");
        }
    }//GEN-LAST:event_KokohActionPerformed

    private void Menu_KebersihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_KebersihanActionPerformed
        GUI_Kebersihan bersih = new GUI_Kebersihan();
        bersih.Kebersihan_GUI();
    }//GEN-LAST:event_Menu_KebersihanActionPerformed

    private void Menu_KenyamananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_KenyamananActionPerformed
        GUI_Kenyamanan nyaman = new GUI_Kenyamanan();
        nyaman.Kenyamanan_GUI();
    }//GEN-LAST:event_Menu_KenyamananActionPerformed

    /**
     * @param args the command line arguments
     */
    public void Keamanan_GUI() {
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
            java.util.logging.Logger.getLogger(GUI_Keamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Keamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Keamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Keamanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

                new GUI_Keamanan().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ada;
    private javax.swing.JCheckBox Aman;
    private javax.swing.JCheckBox Bahaya;
    private javax.swing.JCheckBox Kokoh;
    private javax.swing.JButton Menu_Data;
    private javax.swing.JButton Menu_Keamanan;
    private javax.swing.JButton Menu_Kebersihan;
    private javax.swing.JButton Menu_Kenyamanan;
    private javax.swing.JButton Menu_Lingkungan;
    private javax.swing.JButton Status_Kelas;
    private javax.swing.JCheckBox T_Ada;
    private javax.swing.JCheckBox T_Kokoh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}