package hatfieldjuniorswimmingschool.view;

import java.awt.Image;
import javax.swing.ImageIcon;

public class HatfieldJuniorSwimmingSchool extends javax.swing.JFrame {

    /**
     * Creates new form HatfieldJuniorSwimmingSchool
     */
    public HatfieldJuniorSwimmingSchool() {
        initComponents();
        //set backgroundimage
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/hatfieldjuniorswimmingschool/image/swim1.jpg")).getImage().getScaledInstance(1530, 829, Image.SCALE_DEFAULT));
        backgroundImage.setIcon(imageIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminButton = new javax.swing.JButton();
        userButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().setLayout(null);

        adminButton.setBackground(new java.awt.Color(0, 102, 255));
        adminButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 255, 255));
        adminButton.setText("Admin");
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminButton);
        adminButton.setBounds(1210, 410, 280, 40);

        userButton.setBackground(new java.awt.Color(0, 102, 255));
        userButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userButton.setForeground(new java.awt.Color(255, 255, 255));
        userButton.setText("User");
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userButton);
        userButton.setBounds(1210, 300, 280, 40);

        backgroundImage.setText("jLabel1");
        backgroundImage.setPreferredSize(new java.awt.Dimension(1530, 829));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1530, 829);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserLogin().setVisible(true);
    }//GEN-LAST:event_userButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_adminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HatfieldJuniorSwimmingSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HatfieldJuniorSwimmingSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HatfieldJuniorSwimmingSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HatfieldJuniorSwimmingSchool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HatfieldJuniorSwimmingSchool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton userButton;
    // End of variables declaration//GEN-END:variables
}
