/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author kurt ian rumbaua
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jbExit = new javax.swing.JButton();
        jbAbout = new javax.swing.JButton();
        jbPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbExit.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 280, -1));

        jbAbout.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jbAbout.setText("About");
        jbAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAboutActionPerformed(evt);
            }
        });
        getContentPane().add(jbAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 280, -1));

        jbPlay.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jbPlay.setText("Play");
        jbPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jbPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 280, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2D Space Shooter");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAboutActionPerformed

    private void jbPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayActionPerformed
        try {
        Game.main(new String[0]);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_jbPlayActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAbout;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbPlay;
    // End of variables declaration//GEN-END:variables
}
