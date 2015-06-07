/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventaris;

/**
 *
 * @author kimen
 */
public class GUI_AC extends javax.swing.JFrame {

    /**
     * Creates new form GUI_AC
     */
    public GUI_AC() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Menu_Data = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        CCTV = new javax.swing.JButton();
        Kabel_LCD = new javax.swing.JButton();
        Kipas_Angin = new javax.swing.JButton();
        Lampu = new javax.swing.JButton();
        Stop_Kontak = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Slider_AC = new javax.swing.JSlider();
        Jum_AC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AC_Baik = new javax.swing.JCheckBox();
        AC_T_Baik = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Posisi_AC_Sesuai = new javax.swing.JCheckBox();
        Posisi_AC_T_Sesuai = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("STATUS AC");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 450, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Data.setText("Data Pengguna");
        Menu_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_DataActionPerformed(evt);
            }
        });
        jPanel2.add(Menu_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        jPanel2.add(AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 40));

        CCTV.setText("CCTV");
        CCTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCTVActionPerformed(evt);
            }
        });
        jPanel2.add(CCTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 40));

        Kabel_LCD.setText("Kabel LCD");
        Kabel_LCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kabel_LCDActionPerformed(evt);
            }
        });
        jPanel2.add(Kabel_LCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        Kipas_Angin.setText("Kipas Angin");
        Kipas_Angin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kipas_AnginActionPerformed(evt);
            }
        });
        jPanel2.add(Kipas_Angin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 40));

        Lampu.setText("Lampu");
        Lampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LampuActionPerformed(evt);
            }
        });
        jPanel2.add(Lampu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 40));

        Stop_Kontak.setText("Stop Kontak");
        Stop_Kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop_KontakActionPerformed(evt);
            }
        });
        jPanel2.add(Stop_Kontak, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 370));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("2. Kondisi AC");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        Slider_AC.setMaximum(10);
        Slider_AC.setPaintTicks(true);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Jum_AC, org.jdesktop.beansbinding.ELProperty.create("${text}"), Slider_AC, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        Slider_AC.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                Slider_ACAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Slider_ACAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(Slider_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, -1));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Slider_AC, org.jdesktop.beansbinding.ELProperty.create("${value}"), Jum_AC, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        Jum_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jum_ACActionPerformed(evt);
            }
        });
        jPanel3.add(Jum_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 60, -1));

        jLabel3.setText("1. Jumlah AC");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 100, 30));

        AC_Baik.setText("Baik");
        AC_Baik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_BaikActionPerformed(evt);
            }
        });
        jPanel3.add(AC_Baik, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        AC_T_Baik.setText("Tidak Baik");
        AC_T_Baik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_T_BaikActionPerformed(evt);
            }
        });
        jPanel3.add(AC_T_Baik, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel4.setText("3. Posisi AC");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 30));

        Posisi_AC_Sesuai.setText("Dibelakang");
        Posisi_AC_Sesuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posisi_AC_SesuaiActionPerformed(evt);
            }
        });
        jPanel3.add(Posisi_AC_Sesuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Posisi_AC_T_Sesuai.setText("Lainnya");
        Posisi_AC_T_Sesuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Posisi_AC_T_SesuaiActionPerformed(evt);
            }
        });
        jPanel3.add(Posisi_AC_T_Sesuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 390, 330));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_DataActionPerformed
        GUI_Data_Kelas gdk = new GUI_Data_Kelas();
        gdk.Data_Kelas();
    }//GEN-LAST:event_Menu_DataActionPerformed

    private void Slider_ACAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Slider_ACAncestorMoved

    }//GEN-LAST:event_Slider_ACAncestorMoved

    private void Slider_ACAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Slider_ACAncestorAdded

    }//GEN-LAST:event_Slider_ACAncestorAdded
Status_Kelas StatusAC = new Status_Kelas();
    private void AC_BaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_BaikActionPerformed
        if(AC_Baik.isSelected()){
            AC_T_Baik.setSelected(false);
            StatusAC.Kondisi="sesuai";
        }
    }//GEN-LAST:event_AC_BaikActionPerformed

    private void AC_T_BaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_T_BaikActionPerformed
       if(AC_T_Baik.isSelected()){
            AC_Baik.setSelected(false);
            StatusAC.Kondisi="tidak_sesuai";
        }
    }//GEN-LAST:event_AC_T_BaikActionPerformed

    private void Posisi_AC_SesuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posisi_AC_SesuaiActionPerformed
        if(Posisi_AC_Sesuai.isSelected()){
            Posisi_AC_T_Sesuai.setSelected(false);
            StatusAC.Posisi="sesuai";
        }
    }//GEN-LAST:event_Posisi_AC_SesuaiActionPerformed

    private void Posisi_AC_T_SesuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Posisi_AC_T_SesuaiActionPerformed
        if(Posisi_AC_T_Sesuai.isSelected()){
            Posisi_AC_Sesuai.setSelected(false);
            StatusAC.Posisi="tidak_sesuai";
        }
    }//GEN-LAST:event_Posisi_AC_T_SesuaiActionPerformed

    private void Jum_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jum_ACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jum_ACActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       StatusAC.Jumlah = Integer.parseInt(Jum_AC.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CCTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCTVActionPerformed
        GUI_CCTV cctv = new GUI_CCTV();
        cctv.CCTV_GUI();
    }//GEN-LAST:event_CCTVActionPerformed

    private void Kabel_LCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kabel_LCDActionPerformed
        GUI_Kabel_LCD lcd = new GUI_Kabel_LCD();
        lcd.Kabel_LCD_GUI();
    }//GEN-LAST:event_Kabel_LCDActionPerformed

    private void Kipas_AnginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kipas_AnginActionPerformed
        GUI_Kipas_Angin kangin = new GUI_Kipas_Angin();
        kangin.Kipas_Angin_GUI();
    }//GEN-LAST:event_Kipas_AnginActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        GUI_AC ac = new GUI_AC();
        ac.AC_GUI();
    }//GEN-LAST:event_ACActionPerformed

    private void LampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LampuActionPerformed
        GUI_Lampu lampu = new GUI_Lampu();
       lampu.Lampu_GUI();
    }//GEN-LAST:event_LampuActionPerformed

    private void Stop_KontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop_KontakActionPerformed
        GUI_Stop_Kontak skontak = new GUI_Stop_Kontak();
        skontak.Stop_Kontak_GUI();
    }//GEN-LAST:event_Stop_KontakActionPerformed

    /**
     * @param args the command line arguments
     */
    public void AC_GUI() {
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
            java.util.logging.Logger.getLogger(GUI_AC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_AC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_AC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_AC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

                new GUI_AC().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JCheckBox AC_Baik;
    private javax.swing.JCheckBox AC_T_Baik;
    private javax.swing.JButton CCTV;
    private javax.swing.JTextField Jum_AC;
    private javax.swing.JButton Kabel_LCD;
    private javax.swing.JButton Kipas_Angin;
    private javax.swing.JButton Lampu;
    private javax.swing.JButton Menu_Data;
    private javax.swing.JCheckBox Posisi_AC_Sesuai;
    private javax.swing.JCheckBox Posisi_AC_T_Sesuai;
    private javax.swing.JSlider Slider_AC;
    private javax.swing.JButton Stop_Kontak;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
