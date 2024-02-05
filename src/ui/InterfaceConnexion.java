/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;

/**
 *
 * @author emmaa
 */
public class InterfaceConnexion extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceConnexion
     */
    public InterfaceConnexion() {
        initComponents();
        //Pour empêcher le redimensionnement de la fenêtre par l'ultilisateur
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Identifiant = new javax.swing.JLabel();
        textFieldIdentifiant = new javax.swing.JTextField();
        MotDePasse = new javax.swing.JLabel();
        SeConnecter = new javax.swing.JButton();
        PasswordFieldMotDePasse = new javax.swing.JPasswordField();
        Langues = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Identifiant.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Identifiant.setText("Identifiant");

        textFieldIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIdentifiantActionPerformed(evt);
            }
        });

        MotDePasse.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        MotDePasse.setText("Mot de passe");

        SeConnecter.setBackground(new java.awt.Color(204, 204, 255));
        SeConnecter.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        SeConnecter.setText("Se connecter");
        SeConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeConnecterActionPerformed(evt);
            }
        });

        PasswordFieldMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldMotDePasseActionPerformed(evt);
            }
        });

        Langues.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Langues.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Français", "English" }));
        Langues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SeConnecter)
                            .addComponent(MotDePasse)
                            .addComponent(textFieldIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(PasswordFieldMotDePasse))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Identifiant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(Langues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Identifiant))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Langues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MotDePasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordFieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(SeConnecter)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeConnecterActionPerformed
        //Si l'identifiant et le mot de passe sont incorrect, un message d'erreur est affiché 
        JOptionPane.showMessageDialog(null,"Login ou mot de passe incorrects");
    }//GEN-LAST:event_SeConnecterActionPerformed

    private void textFieldIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIdentifiantActionPerformed

    private void PasswordFieldMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldMotDePasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldMotDePasseActionPerformed

    private void LanguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguesActionPerformed
        // On récupère la langue choisie par l'utilisateur
        String langue = Objects.requireNonNull(Langues.getSelectedItem()).toString();
        // On change la langue de l'interface
        changerLangue(langue);
    }//GEN-LAST:event_LanguesActionPerformed

    public void changerLangue(String langue){
        //Changer la langue de l'interface
        if(langue.equals("Français"))
        { // On met tous les labels en Français
            Identifiant.setText("Identifiant");
            MotDePasse.setText("Mot de passe");
            SeConnecter.setText("Se connecter");
        }
        else if(langue.equals("English"))
        {// On met tous les labels en Anglais
            Identifiant.setText("Login");
            MotDePasse.setText("Password");
            SeConnecter.setText("Log in");
        }
    }

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
            java.util.logging.Logger.getLogger(InterfaceConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConnexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Identifiant;
    private javax.swing.JComboBox Langues;
    private javax.swing.JLabel MotDePasse;
    private javax.swing.JPasswordField PasswordFieldMotDePasse;
    private javax.swing.JButton SeConnecter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textFieldIdentifiant;
    // End of variables declaration//GEN-END:variables
}
