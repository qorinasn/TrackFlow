package View;


/**
 * @author Qorina
 */

@SuppressWarnings("serial")
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        tracking = new javax.swing.JButton();
        moving = new javax.swing.JButton();
        coucargo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 50, 40));

        tracking.setBackground(new java.awt.Color(255, 204, 204));
        tracking.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        tracking.setText("Tracking");
        tracking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackingActionPerformed(evt);
            }
        });
        getContentPane().add(tracking, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 30));

        moving.setBackground(new java.awt.Color(255, 204, 204));
        moving.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        moving.setText("Moving");
        moving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movingActionPerformed(evt);
            }
        });
        getContentPane().add(moving, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 90, 30));

        coucargo.setBackground(new java.awt.Color(255, 204, 204));
        coucargo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        coucargo.setText("CourierCargo");
        coucargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coucargoActionPerformed(evt);
            }
        });
        getContentPane().add(coucargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delivery-truck.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 70, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delivery-courier.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 70, 60));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tracking (1).png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ad (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download (1).jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 140, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download (1).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/download (1).jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, 130));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("DELIVER YOUR PACKAGE WITH CARE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 420, 30));

        atas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nude Maroon.jpg"))); // NOI18N
        atas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                atasMouseDragged(evt);
            }
        });
        atas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atasMouseClicked(evt);
            }
        });
        getContentPane().add(atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2-Gambar-Home-Slide-2.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 830, 340));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/info.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 40, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int x;
    private int y;
    
    private void atasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atasMouseClicked
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_atasMouseClicked

    private void atasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atasMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_atasMouseDragged

    private void trackingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackingActionPerformed
        TrackingForm tf = new TrackingForm();
        tf.setVisible(true);
        tf.pack();
        tf.setLocationRelativeTo(null);
        this.dispose();    
    }//GEN-LAST:event_trackingActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutMouseClicked

    private void coucargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coucargoActionPerformed
        CourierCargoForm cc = new CourierCargoForm();
        cc.setVisible(true);
        cc.pack();
        cc.setLocationRelativeTo(null);
        this.dispose();     
    }//GEN-LAST:event_coucargoActionPerformed

    private void movingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movingActionPerformed
        MovingForm m = new MovingForm();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        this.dispose(); 
    }//GEN-LAST:event_movingActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atas;
    private javax.swing.JButton coucargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logout;
    private javax.swing.JButton moving;
    private javax.swing.JButton tracking;
    // End of variables declaration//GEN-END:variables
   
    }

