/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.validerActes;

import fc.DialogueBD;
import fc.Utilisateur;

import java.sql.ResultSet;

/**
 * @author emmaa
 */
public class ValiderExamenBiologique extends javax.swing.JFrame {

    private final DialogueBD dialogueBD;
    private final Utilisateur utilisateur;
    private final String idActe;

    /**
     * Creates new form ValiderExamenBiologique
     */
    public ValiderExamenBiologique(DialogueBD dialogueBD, Utilisateur utilisateur, String idActe) {
        initComponents();
        this.dialogueBD = dialogueBD;
        this.utilisateur = utilisateur;
        this.idActe = idActe;
        //Pour empêcher le redimensionnement de la fenêtre, on utilise setResizable(false)
        setResizable(false);
        remplirChamps();
        //Pour basculer l'interface en anglais lorsqu'elle la langue "English" est sélectionnée
        changerLangue(this.utilisateur.getLangue());
    }

    private void remplirChamps() {
        String requete = "SELECT * FROM acte WHERE idActe = " + idActe;
        ResultSet resultat = dialogueBD.requete(requete);
        try {
            if (resultat.next()) {
                String commentaire = resultat.getString("commentaire");
                String type = commentaire.substring(0, commentaire.indexOf(" "));
                commentaire = commentaire.substring(commentaire.indexOf(" ") + 1);
                TypeExamenBiologique.setText(type);
                dateExamenBiologique.setText(resultat.getString("datePrescription").substring(0, 10));
                ZoneCommentaire.setText(commentaire);
                if(resultat.getString("commentaire") == null){
                    ZoneCommentaire.setText("Aucun commentaire");
                }
                texteResultat.setText(resultat.getString("resultat"));
                if(resultat.getString("resultat") == null){
                    texteResultat.setText("Aucun résultat");
                }
                if(resultat.getString("dateRealisationActe") != null){
                    jLabel1.setText(resultat.getString("dateRealisationActe").substring(0, 10));
                }
                if(resultat.getString("Valide") != null && resultat.getString("Valide").equals("Y")){
                    BoutonValiderExamenBiologique.setVisible(false);
                    texteResultat.setEditable(false);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        ValiderExamenBiologique = new javax.swing.JLabel();
        TypeExamen = new javax.swing.JLabel();
        TypeExamenBiologique = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        dateExamenBiologique = new javax.swing.JLabel();
        commentaire = new javax.swing.JLabel();
        zoneCommentaire = new javax.swing.JScrollPane();
        ZoneCommentaire = new javax.swing.JTextArea();
        BoutonValiderExamenBiologique = new javax.swing.JButton();
        labelResultat = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texteResultat = new javax.swing.JTextArea();
        labelDateRealisation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 242, 254));

        ValiderExamenBiologique.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ValiderExamenBiologique.setText("Valider l'examen biologique ");

        TypeExamen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TypeExamen.setText("Type d'examen : ");

        TypeExamenBiologique.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TypeExamenBiologique.setText("TypeExamenBiologique");

        Date.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Date.setText("Prescrit le :");

        dateExamenBiologique.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dateExamenBiologique.setText("dateExamenBiologique");

        commentaire.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        commentaire.setText("Commentaire : ");

        ZoneCommentaire.setEditable(false);
        ZoneCommentaire.setColumns(20);
        ZoneCommentaire.setRows(5);
        zoneCommentaire.setViewportView(ZoneCommentaire);

        BoutonValiderExamenBiologique.setBackground(new java.awt.Color(4, 66, 114));
        BoutonValiderExamenBiologique.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BoutonValiderExamenBiologique.setForeground(new java.awt.Color(255, 255, 255));
        BoutonValiderExamenBiologique.setText("Valider l'examen biologique");
        BoutonValiderExamenBiologique.setActionCommand("Valider ");
        BoutonValiderExamenBiologique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonValiderExamenBiologiqueActionPerformed(evt);
            }
        });

        labelResultat.setText("Résultat :");

        texteResultat.setColumns(20);
        texteResultat.setRows(5);
        jScrollPane2.setViewportView(texteResultat);

        labelDateRealisation.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        labelDateRealisation.setText("Réalisé le :");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Non réalisé");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(BoutonValiderExamenBiologique))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValiderExamenBiologique)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TypeExamen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TypeExamenBiologique))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Date)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateExamenBiologique)))))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zoneCommentaire)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelResultat)
                                    .addComponent(commentaire)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelDateRealisation)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ValiderExamenBiologique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeExamen)
                    .addComponent(TypeExamenBiologique))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(dateExamenBiologique))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateRealisation)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(commentaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoneCommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelResultat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonValiderExamenBiologique)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonValiderExamenBiologiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonValiderExamenBiologiqueActionPerformed
        String resultat = texteResultat.getText();
        String requete = "UPDATE acte SET resultat = '" + resultat + "', dateRealisationActe = Current_Date" + ", Valide = 'Y' WHERE idActe = " + idActe;
        dialogueBD.requete(requete);
        this.dispose();
    }//GEN-LAST:event_BoutonValiderExamenBiologiqueActionPerformed


    public void changerLangue(String langue) {
        //Si la langue sélectionnée lors la connexion est l'anglais, alors l'interface s'affiche en anglais
        //On remplace chaque composant par son équivalent anglais
        if (langue.equals("English")) {
            ValiderExamenBiologique.setText("Validate the biological examination");
            BoutonValiderExamenBiologique.setText("Validate");
            TypeExamen.setText("Type of medical examination");
            ZoneCommentaire.setText("Comment");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonValiderExamenBiologique;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel TypeExamen;
    private javax.swing.JLabel TypeExamenBiologique;
    private javax.swing.JLabel ValiderExamenBiologique;
    private javax.swing.JTextArea ZoneCommentaire;
    private javax.swing.JLabel commentaire;
    private javax.swing.JLabel dateExamenBiologique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDateRealisation;
    private javax.swing.JLabel labelResultat;
    private javax.swing.JTextArea texteResultat;
    private javax.swing.JScrollPane zoneCommentaire;
    // End of variables declaration//GEN-END:variables
}
