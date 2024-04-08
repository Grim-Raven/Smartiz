/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import fc.DialogueBD;
import fc.Hashage;
import fc.Utilisateur;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Objects;

/**
 *
 * @author emmaa
 */
public class InterfaceConnexion extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceConnexion
     */
    // Pour contenir l'instance de Dialogue avec la BD
    private final DialogueBD dialogueBD;
    private long dernierTempsConnexion = 0;
    public InterfaceConnexion(DialogueBD dialogueBD) {
        initComponents();
        this.dialogueBD = dialogueBD;
        this.dialogueBD.connect();
        //Pour empêcher le redimensionnement de la fenêtre par l'utilisateur
        setResizable(false);
        // Chargez l'image
        Image img;
        try {
            img = ImageIO.read(Objects.requireNonNull(getClass().getResource("/ui/Image/Logo_Smartiz.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Redimensionnez l'image
        Image resizedImg = img.getScaledInstance(logoSmartiz.getWidth(), logoSmartiz.getHeight(), Image.SCALE_SMOOTH);
        // Créez une nouvelle icône ImageIcon avec l'image redimensionnée
        ImageIcon icon = new ImageIcon(resizedImg);
        // Définissez cette icône comme icône du JLabel
        logoSmartiz.setIcon(icon);
        // Le message d'erreur de connexion n'est pas visible par défaut
        labelErreurConnexion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConnexion = new javax.swing.JPanel();
        Identifiant = new javax.swing.JLabel();
        textFieldIdentifiant = new javax.swing.JTextField();
        MotDePasse = new javax.swing.JLabel();
        SeConnecter = new javax.swing.JButton();
        PasswordFieldMotDePasse = new javax.swing.JPasswordField();
        Langues = new javax.swing.JComboBox();
        labelErreurConnexion = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        logoSmartiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConnexion.setBackground(new java.awt.Color(255, 255, 255));

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

        labelErreurConnexion.setForeground(new java.awt.Color(255, 51, 51));
        labelErreurConnexion.setText("Identifiant ou mot de passe incorrect");

        javax.swing.GroupLayout panelConnexionLayout = new javax.swing.GroupLayout(panelConnexion);
        panelConnexion.setLayout(panelConnexionLayout);
        panelConnexionLayout.setHorizontalGroup(
            panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConnexionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelErreurConnexion)
                    .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelConnexionLayout.createSequentialGroup()
                            .addComponent(Identifiant)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Langues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(panelConnexionLayout.createSequentialGroup()
                            .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(MotDePasse)
                                .addComponent(textFieldIdentifiant)
                                .addGroup(panelConnexionLayout.createSequentialGroup()
                                    .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PasswordFieldMotDePasse)
                                        .addComponent(SeConnecter))
                                    .addGap(173, 173, 173)))
                            .addGap(32, 32, 32)))))
        );
        panelConnexionLayout.setVerticalGroup(
            panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConnexionLayout.createSequentialGroup()
                .addGroup(panelConnexionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConnexionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Identifiant))
                    .addGroup(panelConnexionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Langues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MotDePasse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordFieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(SeConnecter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErreurConnexion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelConnexion, java.awt.BorderLayout.EAST);

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));

        logoSmartiz.setText("logo");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoSmartiz, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(logoSmartiz, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LanguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguesActionPerformed
        // On récupère la langue choisie par l'utilisateur
        String langue = Objects.requireNonNull(Langues.getSelectedItem()).toString();
        // On change la langue de l'interface
        changerLangue(langue);
    }//GEN-LAST:event_LanguesActionPerformed

    // Pour permettre à l'utilisateur de se connecter en appuyant sur la touche "Entrée"
    private void PasswordFieldMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldMotDePasseActionPerformed
        // On appelle la méthode SeConnecterActionPerformed pour se connecter
        SeConnecterActionPerformed(evt);
    }//GEN-LAST:event_PasswordFieldMotDePasseActionPerformed

    private void SeConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeConnecterActionPerformed
        long tempsActuel = System.currentTimeMillis(); // On récupère le temps actuel
        // On récupère l'identifiant et le mot de passe saisis par l'utilisateur
        String identifiant = textFieldIdentifiant.getText();
        // On vérifie qu'il n'y a que des numéros dans l'identifiant, protège des injections SQL de type "1 OR 1=1"
        if(!identifiant.matches("[0-9]+")) {
            labelErreurConnexion.setVisible(true);
        } else {
            if(tempsActuel - dernierTempsConnexion < 3000) {
                labelErreurConnexion.setText("Veuillez attendre 3 secondes avant de réessayer");
                labelErreurConnexion.setVisible(true);
            }else {
                dernierTempsConnexion = tempsActuel;
                String motDePasse = String.valueOf(PasswordFieldMotDePasse.getPassword());
                // On hash le mot de passe avec sha-256
                String hashedMotDePasse = Hashage.sha256(motDePasse);
                String requeteConnexion = "SELECT * " +
                        "FROM PersonnelMedical " +
                        "WHERE idPersonnelMedical = " + identifiant + " AND mdp = '" + hashedMotDePasse + "' AND (select sysdate from dual) < DateFinContrat";
                ResultSet resultat = dialogueBD.requete(requeteConnexion);
                // On vérifie si l'identifiant et le mot de passe sont corrects
                try {
                    if (resultat.next()) {
                        // Si c'est le cas, on ouvre l'interface de l'application
                        
                        //On crée un Utilisateur avec les informations récupérées de la BD
                        Utilisateur utilisateur = new Utilisateur(
                                resultat.getString("nom"),
                                resultat.getString("prenom"),
                                true,
                                Objects.requireNonNull(Langues.getSelectedItem()).toString(),
                                resultat.getInt("idService"),
                                resultat.getInt("idPersonnelMedical"),
                                resultat.getString("arc"));
                        new Accueil(dialogueBD, utilisateur).setVisible(true);
                        this.dispose();
                    } else { // On regarde si les identifiants sont ceux d'un personnel administratif
                        requeteConnexion = "SELECT * " +
                                "FROM Administratif " +
                                "WHERE idPersonnel = " + identifiant + " AND mdp = '" + hashedMotDePasse + "'";
                        resultat = dialogueBD.requete(requeteConnexion);
                        if (resultat.next()) {
                            // Si c'est le cas, on ouvre l'interface de l'application
                            
                            //On crée un Utilisateur avec les informations récupérées de la BD
                            Utilisateur utilisateur = new Utilisateur(
                                    resultat.getString("nom"),
                                    resultat.getString("prenom"),
                                    false,
                                    Objects.requireNonNull(Langues.getSelectedItem()).toString(),
                                    0,
                                    resultat.getInt("idPersonnel"),
                                    "N");
                            new Accueil(dialogueBD, utilisateur).setVisible(true);
                            this.dispose();
                        } else {
                            // Sinon, on affiche un message d'erreur
                            labelErreurConnexion.setText("Identifiant ou mot de passe incorrect");
                            labelErreurConnexion.setVisible(true);
                        }
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }//GEN-LAST:event_SeConnecterActionPerformed

    private void textFieldIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIdentifiantActionPerformed
        
    }//GEN-LAST:event_textFieldIdentifiantActionPerformed

    public void changerLangue(String langue){
        //Changer la langue de l'interface
        if(langue.equals("Français"))
        { // On met tous les labels en Français
            Identifiant.setText("Identifiant");
            MotDePasse.setText("Mot de passe");
            SeConnecter.setText("Se connecter");
            labelErreurConnexion.setText("Indentifiant ou mot de passe incorrect");
        }
        else if(langue.equals("English"))
        {// On met tous les labels en Anglais
            Identifiant.setText("Login");
            MotDePasse.setText("Password");
            SeConnecter.setText("Log in");
            labelErreurConnexion.setText("Invalid id or password");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Identifiant;
    private javax.swing.JComboBox Langues;
    private javax.swing.JLabel MotDePasse;
    private javax.swing.JPasswordField PasswordFieldMotDePasse;
    private javax.swing.JButton SeConnecter;
    private javax.swing.JLabel labelErreurConnexion;
    private javax.swing.JLabel logoSmartiz;
    private javax.swing.JPanel panelConnexion;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JTextField textFieldIdentifiant;
    // End of variables declaration//GEN-END:variables
}
