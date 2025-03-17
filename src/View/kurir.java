package View;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Qorina
 */

@SuppressWarnings("serial")
public class kurir extends javax.swing.JFrame {

    
    public kurir(){
        initComponents();
        
    }
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcari = new javax.swing.JTextField();
        cekresi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        ShowButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeljual = new javax.swing.JTable();
        desain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcari.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtcari.setForeground(new java.awt.Color(255, 204, 204));
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 210, 40));

        cekresi.setBackground(new java.awt.Color(255, 204, 204));
        cekresi.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        cekresi.setForeground(new java.awt.Color(135, 45, 60));
        cekresi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/searching.png"))); // NOI18N
        cekresi.setText(" Search by No Resi");
        cekresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekresiActionPerformed(evt);
            }
        });
        cekresi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekresiKeyReleased(evt);
            }
        });
        getContentPane().add(cekresi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delivery-truck.png"))); // NOI18N
        jLabel7.setText("DATA KURIR");
        jLabel7.setFocusCycleRoot(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("ALAMAT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        cc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nude Maroon.jpg"))); // NOI18N
        getContentPane().add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        DeleteButton.setBackground(new java.awt.Color(255, 204, 204));
        DeleteButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(135, 45, 60));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash (1).png"))); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 100, 30));

        ShowButton.setBackground(new java.awt.Color(255, 204, 204));
        ShowButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ShowButton.setForeground(new java.awt.Color(135, 45, 60));
        ShowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons (2).png"))); // NOI18N
        ShowButton.setText("SHOW");
        ShowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ShowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 90, 30));

        UpdateButton.setBackground(new java.awt.Color(255, 204, 204));
        UpdateButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(135, 45, 60));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 110, 30));

        SaveButton.setBackground(new java.awt.Color(255, 204, 204));
        SaveButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(135, 45, 60));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, 30));

        ExitButton.setBackground(new java.awt.Color(255, 204, 204));
        ExitButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(135, 45, 60));
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit (1).png"))); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 30));

        ResetButton.setBackground(new java.awt.Color(255, 204, 204));
        ResetButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(135, 45, 60));
        ResetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 100, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(135, 45, 60));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        jButton1.setText(" HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, 30));

        tabeljual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabeljual.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tabeljual.setForeground(new java.awt.Color(255, 204, 204));
        tabeljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID KURIR", "NAMA ", "ALAMAT", "NO HP ", "ALAMAT"
            }
        ));
        tabeljual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljualMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabeljualMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tabeljual);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 710, 140));

        desain.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        desain.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        desain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2021-04-12_07.12.23_5.jpg"))); // NOI18N
        desain.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        desain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desain.setPreferredSize(new java.awt.Dimension(1308, 2000));
        getContentPane().add(desain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void tabeljualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljualMouseClicked
       
        
    }//GEN-LAST:event_tabeljualMouseClicked

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
     
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ShowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowButtonActionPerformed
       
    }//GEN-LAST:event_ShowButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabeljualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljualMouseEntered
       
    }//GEN-LAST:event_tabeljualMouseEntered

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased

    }//GEN-LAST:event_txtcariKeyReleased

    private void cekresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekresiActionPerformed
       
    }//GEN-LAST:event_cekresiActionPerformed

    private void cekresiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekresiKeyReleased

    }//GEN-LAST:event_cekresiKeyReleased

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
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierCargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new kurir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton ShowButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel cc;
    private javax.swing.JButton cekresi;
    private javax.swing.JLabel desain;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeljual;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
