/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu.main;
import igu.util.ManipulateComponents;
import igu.util.alerts.ErrorAlert;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jonatan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    ManipulateComponents slide;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        slide=new ManipulateComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordLoginSeparator = new javax.swing.JSeparator();
        userLoginSeparator = new javax.swing.JSeparator();
        userLoginTfield = new javax.swing.JTextField();
        passwordLoginTfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JPanel();
        closeLabel = new javax.swing.JLabel();
        minimizeLabel = new javax.swing.JLabel();
        backgroundJlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setOpaque(false);
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userLabel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(51, 204, 0));
        userLabel.setText("USUARIO");
        loginPanel.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 40));

        passwordLabel.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(51, 204, 0));
        passwordLabel.setText("CONTRASEÑA");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 40));
        loginPanel.add(passwordLoginSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 150, 20));
        loginPanel.add(userLoginSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 20));

        userLoginTfield.setBackground(new java.awt.Color(20, 20, 20));
        userLoginTfield.setForeground(new java.awt.Color(207, 19, 69));
        userLoginTfield.setText("Ingrese usuario");
        userLoginTfield.setBorder(null);
        loginPanel.add(userLoginTfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 150, 30));

        passwordLoginTfield.setBackground(new java.awt.Color(13, 13, 13));
        passwordLoginTfield.setForeground(new java.awt.Color(207, 19, 69));
        passwordLoginTfield.setText("Ingrese contraseña");
        passwordLoginTfield.setBorder(null);
        passwordLoginTfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginTfieldActionPerformed(evt);
            }
        });
        loginPanel.add(passwordLoginTfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 150, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/GO_LOG_ON.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/GO_LOG_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/GO_LOG_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/GO_LOG_ON.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        loginPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 50, 20));

        loginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/overlays/LOGIN_INGRESO.png"))); // NOI18N
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });
        loginPanel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, -240, 250, 270));
        loginPanel.getAccessibleContext().setAccessibleName("");

        backgroundPanel.setOpaque(false);
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/closeIcon.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        backgroundPanel.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 40, 50));

        minimizeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/minimizeIcon.png"))); // NOI18N
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
        });
        backgroundPanel.add(minimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 30, 50));

        backgroundJlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/overlays/Login.png"))); // NOI18N
        backgroundPanel.add(backgroundJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1000, 500));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        // TODO add your handling code here:
        
        slide.jPanelYDown(-240, 0, 25, 5, loginPanel);
        slide.jPanelYup(0, -240, 25, 5, loginPanel);
        
    }//GEN-LAST:event_loginLabelMouseClicked

    private void passwordLoginTfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginTfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLoginTfieldActionPerformed

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        // TODO add your handling code here:
        
        this.setExtendedState(Login.ICONIFIED);
        
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        
        int dialog=JOptionPane.YES_NO_OPTION;
        int result=JOptionPane.showConfirmDialog(null, "¿Desea cerrar?", "Exit", dialog);
        if(result==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_closeLabelMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(userLoginTfield.getText()=="" && passwordLoginTfield.getText()==""){
           ErrorAlert er = new ErrorAlert(new JFrame(), true);
            er.Errortitle.setText("OOPS...");
            er.Errormsg.setText("CREDENCIALES INCORRECTAS");
            er.errormsg1.setText("VUELVA A INTENTAR");
            er.setVisible(true);
        }else{
            MainFrame mainFrame=new MainFrame();
            dispose();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundJlabel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JSeparator passwordLoginSeparator;
    private javax.swing.JTextField passwordLoginTfield;
    private javax.swing.JLabel userLabel;
    private javax.swing.JSeparator userLoginSeparator;
    private javax.swing.JTextField userLoginTfield;
    // End of variables declaration//GEN-END:variables
}
