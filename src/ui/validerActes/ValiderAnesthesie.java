/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.validerActes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import fc.DialogueBD;
import fc.Utilisateur;

/**
 *
 * @author emmaa
 */
public class ValiderAnesthesie extends javax.swing.JFrame {

    /**
     * Creates new form ValiderAnesthesie
     */
    private final DialogueBD dialogueBD;
    private final Utilisateur utilisateur;
    private final String idActe;
    
    public ValiderAnesthesie(DialogueBD dialogueBD, Utilisateur utilisateur, String idActe) {
        initComponents();
        this.dialogueBD = dialogueBD;
        this.utilisateur = utilisateur;
        this.idActe = idActe;
        remplirChamps(this.idActe);

        this.setDefaultCloseOperation(2);
        //Pour empêcher le redimensionnement de la fenêtre, on utilise setResizable(false)
        setResizable(false);
        //Pour basculer l'interface en anglais lorsqu'elle la langue "English" est sélectionnée
        changerLangue(this.utilisateur.getLangue());

        texteCom.setEditable(false);
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
        validerConsultationAnesthesie = new javax.swing.JLabel();
        operation = new javax.swing.JLabel();
        dateOperation = new javax.swing.JLabel();
        service = new javax.swing.JLabel();
        nomService = new javax.swing.JLabel();
        commentaire = new javax.swing.JLabel();
        zoneCommentaire = new javax.swing.JScrollPane();
        texteCom = new javax.swing.JTextArea();
        boutonValiderConsultationAnesthesie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 242, 254));

        validerConsultationAnesthesie.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        validerConsultationAnesthesie.setText("Valider la consultation pré-opératoire - Anesthésie");

        operation.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        operation.setText("Opération prévue le : ");

        dateOperation.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dateOperation.setText("dateOperation");

        service.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        service.setText("Service : ");

        nomService.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nomService.setText("nomService");

        commentaire.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        commentaire.setText("Commentaire : ");

        texteCom.setColumns(20);
        texteCom.setRows(5);
        zoneCommentaire.setViewportView(texteCom);

        boutonValiderConsultationAnesthesie.setBackground(new java.awt.Color(4, 66, 114));
        boutonValiderConsultationAnesthesie.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boutonValiderConsultationAnesthesie.setForeground(new java.awt.Color(255, 255, 255));
        boutonValiderConsultationAnesthesie.setText("Valider la consultation pré-opératoire");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zoneCommentaire)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validerConsultationAnesthesie)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(operation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateOperation))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(service)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomService))
                            .addComponent(commentaire))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(boutonValiderConsultationAnesthesie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validerConsultationAnesthesie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateOperation)
                    .addComponent(operation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(service)
                    .addComponent(nomService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoneCommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutonValiderConsultationAnesthesie)
                .addContainerGap())
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

    public void remplirChamps(String idActe){
        String requete = ("SELECT * FROM ACTE where idActe = " + idActe);
        ResultSet resultset = dialogueBD.requete(requete);

        //On parcourt le Resulset pour récupérer les infos de l'acte
        try {
            resultset.next();
            String commentaire = resultset.getString("commentaire");
            nomService.setText(commentaire.substring(0, commentaire.indexOf(" ")));
            dateOperation.setText(resultset.getString("dateRealisationActe").substring(0, 10));
            texteCom.setText(commentaire.substring(commentaire.indexOf("-") + 1));
            
            // On cache le bouton de validation si l'acte a déjà été validé
            boolean sejourOuvert;
            // Récupération de l'état du séjour
            ResultSet resultatSejour = dialogueBD.requete("SELECT ouvert FROM Sejour WHERE idSejour = " + resultset.getString("idSejour"));
            if (resultatSejour.next()) {
                sejourOuvert = resultatSejour.getString("ouvert").equals("Y");
            } else {
                sejourOuvert = false;
            }
            boolean valide = resultset.getString("valide").equals("Y");
            
            if(valide || (utilisateur.getIdService()!= 18) || !sejourOuvert) {
                boutonValiderConsultationAnesthesie.setVisible(false);
            }
            else{
                boutonValiderConsultationAnesthesie.setVisible(true);
                boutonValiderConsultationAnesthesie.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        BoutonValiderConsultationAnesthesieActionPerformed(evt);
                    }
                });
            }
        } catch (SQLException e) {
            
            e.printStackTrace();
        }
        
    }

    private void BoutonValiderConsultationAnesthesieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonValiderConsultationActionPerformed
        String resultat = "";
        //On met à jour la consultation dans la base de données
        dialogueBD.validerActe(idActe, resultat);
        String rajout = texteCom.getText();
        // On crée un dictionnaire contenant les données de la consultation pré-opératoire
        HashMap<String, String> dataAnesthesie = new HashMap<>();
        dataAnesthesie.put("commentaire", rajout);
        //On met à jour les données de la consultation pré-opératoire
        try {
            dialogueBD.updateTable("acte", dataAnesthesie, "idActe", this.idActe);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_boutonValiderConsultationActionPerformed

    public void changerLangue(String langue) {
        //Si la langue selectionnée lors la connexion est l'anglais, alors l'interface s'affiche en anglais
        //On remplace chaque composant par son équivalent anglais
        if (langue.equals("English")) {
            validerConsultationAnesthesie.setText("Validate the pre-operative consultation - Anesthesia");
            boutonValiderConsultationAnesthesie.setText("Validate");
            operation.setText("Operation scheduled for : ");
            commentaire.setText("Comment :");
            service.setText("Medical service :");
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonValiderConsultationAnesthesie;
    private javax.swing.JLabel commentaire;
    private javax.swing.JLabel dateOperation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomService;
    private javax.swing.JLabel operation;
    private javax.swing.JLabel service;
    private javax.swing.JTextArea texteCom;
    private javax.swing.JLabel validerConsultationAnesthesie;
    private javax.swing.JScrollPane zoneCommentaire;
    // End of variables declaration//GEN-END:variables
}
