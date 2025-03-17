package View;

import Coding.Tracking;
import Coding.Database3;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
      
/**
 * @author Qorina
 */

@SuppressWarnings("serial")
public class TrackingForm extends javax.swing.JFrame {

    private Tracking Tracking;
    
    public TrackingForm() {
        initComponents();
        Tracking  = new Tracking(this);
    }
     public JTextField getNoResi() {
        return txtcari;    
    }
    public JTable getTabelJual(){
        return tabeljual;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeljual = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        cekresi = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(825, 450));
        setPreferredSize(new java.awt.Dimension(825, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        tabeljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO RESI", "TGL KIRIM", "JENIS BARANG", "PENGIRIM", "PENERIMA", "TGL SAMPAI", "STATUS", "SUB TOTAL"
            }
        ));
        tabeljual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeljualMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeljual);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 730, 110);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 380, 50, 40);

        logout.setBackground(new java.awt.Color(135, 45, 60));
        logout.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 204, 204));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout (1).png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(770, 380, 50, 40);

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
        getContentPane().add(cekresi);
        cekresi.setBounds(320, 160, 220, 40);

        txtcari.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtcari.setForeground(new java.awt.Color(255, 204, 204));
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        getContentPane().add(txtcari);
        txtcari.setBounds(370, 110, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("NO RESI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 90, 140, 70);

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tracking (1).png"))); // NOI18N
        jLabel7.setText("TRACKING");
        jLabel7.setFocusCycleRoot(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 10, 330, 64);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nude Maroon.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 80);

        jLabel2.setBackground(new java.awt.Color(153, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2-Gambar-Home-Slide-2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 80, 820, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

    private void tabeljualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeljualMouseClicked
        int baris = tabeljual.rowAtPoint(evt.getPoint());
        
        String no_resi = tabeljual.getValueAt(baris, 0).toString();
        txtcari.setText(no_resi);
    }//GEN-LAST:event_tabeljualMouseClicked

    private void cekresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekresiActionPerformed
        String key = txtcari.getText();
        Tracking.cariData(key);
    }//GEN-LAST:event_cekresiActionPerformed

    private void cekresiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekresiKeyReleased
   
    }//GEN-LAST:event_cekresiKeyReleased

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
       
    }//GEN-LAST:event_txtcariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home hm = new Home();
        hm.setVisible(true);
        hm.pack();
        hm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(TrackingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrackingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrackingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrackingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrackingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekresi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JTable tabeljual;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
