/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AjoutActe;
import fc.DialogueBD;
import fc.Utilisateur;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author emmaa
 */
public class AjoutConsultation extends javax.swing.JFrame {

    /**
     * Creates new form AjoutConsultation
     */
    private DialogueBD dialogueBD;
    private Utilisateur utilisateur;
    private String idSejour;
    public AjoutConsultation() {
        initComponents();
        //Pour empêcher le redimensionnement de la fenêtre, on utilise setResizable(false)
        setResizable(false);
        this.dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        this.utilisateur = new Utilisateur("Cot","Harry",true,"Français",1,1111,"Y");
        this.idSejour = "1";
        MenuDeroulantService.setModel(new javax.swing.DefaultComboBoxModel<>(dialogueBD.getNomServices().toArray()));
        initMedecin();
    }

    public AjoutConsultation(DialogueBD dialogueBD, Utilisateur utilisateur, String idSejour) {
        initComponents();
        //Pour empêcher le redimensionnement de la fenêtre, on utilise setResizable(false)
        setResizable(false);
        this.dialogueBD = dialogueBD;
        this.utilisateur = utilisateur;
        this.idSejour = idSejour;
        MenuDeroulantService.setModel(new javax.swing.DefaultComboBoxModel<>(dialogueBD.getNomServices().toArray()));
        initMedecin();
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
        AjouterUneConsultation = new javax.swing.JLabel();
        Service = new javax.swing.JLabel();
        MenuDeroulantService = new javax.swing.JComboBox();
        Medecin = new javax.swing.JLabel();
        MenuDeroulantMedecin = new javax.swing.JComboBox();
        Date = new javax.swing.JLabel();
        Commentaire = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TexteCommentaire = new javax.swing.JTextArea();
        BoutonAjouter = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        AjouterUneConsultation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AjouterUneConsultation.setText("Ajouter une consultation");

        Service.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Service.setText("Service ");

        MenuDeroulantService.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        MenuDeroulantService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anapathologie", "Cardiologie", "Chirurgie", "Dermatologie", "Gynécologie", "Hématologie", "Immunologie", "Médecine Générale", "Neurologie", "Obstétrie", "Oncologie", "Pneumologie", "Psychiatrie", "Radiologie", "Réanimation", "Urologie", "Urgence" }));
        MenuDeroulantService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeroulantServiceActionPerformed(evt);
            }
        });

        Medecin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Medecin.setText("Médecin");

        Date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Date.setText("Date");

        Commentaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Commentaire.setText("Commentaire");

        TexteCommentaire.setColumns(20);
        TexteCommentaire.setRows(5);
        jScrollPane1.setViewportView(TexteCommentaire);

        BoutonAjouter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonAjouter.setText("Ajouter");
        BoutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAjouterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(MenuDeroulantMedecin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MenuDeroulantService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AjouterUneConsultation)
                                    .addComponent(Service)
                                    .addComponent(Medecin)
                                    .addComponent(Date))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Commentaire))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(BoutonAjouter))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterUneConsultation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Service)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuDeroulantService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Medecin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuDeroulantMedecin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(Commentaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonAjouter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void initMedecin(){
        // On crée un filtre de service pour trouver tous les medecins du service
        HashMap<String, String> filtre = new HashMap<>() ;
        filtre.put("idService", dialogueBD.getIdService(MenuDeroulantService.getSelectedItem().toString()));
        System.out.println(MenuDeroulantService.getSelectedItem().toString());
        // On réinitialise le modèle
        MenuDeroulantMedecin.setModel(new DefaultComboBoxModel());
        try {
            // On exécute la requête
            ResultSet resultat = dialogueBD.rechercheTable("PersonnelMedical", filtre, false);
            // On ajoute les médecins à la liste déroulante
            while(resultat.next()){
                System.out.println();
                MenuDeroulantMedecin.addItem(resultat.getString("Prenom").trim() + " " + resultat.getString("Nom").trim() + " - " + resultat.getString("idPersonnelMedical").trim());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void BoutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAjouterActionPerformed
        String nom = "Consultation";
        String idService = MenuDeroulantService.getSelectedItem().toString();
        String idPrescripteur = utilisateur.getIdUtilisateur();
        // On récupère uniquement l'id du médecin
        String idRealisateur = MenuDeroulantMedecin.getSelectedItem().toString().substring(MenuDeroulantMedecin.getSelectedItem().toString().lastIndexOf("-") + 1).trim();
        System.out.println(idRealisateur);
        Date date = DateChooser.getDate();
        // On récupère un String de la forme yyyy-mm-dd
        String datePrescription = String.format("%1$tY-%1$tm-%1$td", date);
        String commentaire = TexteCommentaire.getText();
        // TODO : ajouter l'id du Sejour, le code, le cout
        HashMap<String, String> dataActe = new HashMap<>();
        dataActe.put("Nom", nom);
        dataActe.put("idService", dialogueBD.getIdService(idService));
        dataActe.put("idPrescripteur", idPrescripteur);
        dataActe.put("idRealisateur", idRealisateur);
        dataActe.put("datePrescription", datePrescription);
        dataActe.put("Commentaire", commentaire);
        dataActe.put("idSejour", idSejour);
         // On insère les données dans la table Acte
        dialogueBD.insertActe(dataActe);
        System.out.println("Consultation ajoutée");
        this.dispose();
    }//GEN-LAST:event_BoutonAjouterActionPerformed

    private void MenuDeroulantServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeroulantServiceActionPerformed
        // On affiche dans le Menu Medecin tous les medecins du service sélectionné
        initMedecin();
    }//GEN-LAST:event_MenuDeroulantServiceActionPerformed

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
            java.util.logging.Logger.getLogger(AjoutConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutConsultation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutConsultation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjouterUneConsultation;
    private javax.swing.JButton BoutonAjouter;
    private javax.swing.JLabel Commentaire;
    private javax.swing.JLabel Date;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JLabel Medecin;
    private javax.swing.JComboBox MenuDeroulantMedecin;
    private javax.swing.JComboBox MenuDeroulantService;
    private javax.swing.JLabel Service;
    private javax.swing.JTextArea TexteCommentaire;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
