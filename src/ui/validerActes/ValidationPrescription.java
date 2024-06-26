/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.validerActes;

import fc.DialogueBD;
import fc.Utilisateur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author Clémence
 */
public class ValidationPrescription extends javax.swing.JFrame {

    private final DialogueBD dialogueBD;
    private final Utilisateur utilisateur;
    private final String idPrescription;


    /**
     * Creates new form Validation
     */
    public ValidationPrescription(DialogueBD dialogueBD, Utilisateur utilisateur, String idPrescription) {
        initComponents();
        // Initialisation des variables
        this.dialogueBD = dialogueBD;
        this.utilisateur = utilisateur;
        this.idPrescription = idPrescription;
        // Remplissage de la prescription
        remplirPrescription(idPrescription);
        changerLangue(utilisateur.getLangue());
    }

    private void changerLangue(String langue) {
        if (langue.equals("English")) {
            EtiquettePrescription.setText("Prescription");
            EtiquetteMédicament1.setText("Medication: ");
            EtiquettePosologie.setText("Dosage: ");
            EtiquetteVoieAdministration.setText("Administration route: ");
            EtiquetteCommentaire.setText("Comment: ");
            labelDatePrevue.setText("Scheduled date:");
            labelDateReelle.setText("Realization date:");
            BoutonValider.setText("Validate");
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
        BoutonValider = new javax.swing.JButton();
        EtiquettePrescription = new javax.swing.JLabel();
        texteNomMedicament = new javax.swing.JLabel();
        EtiquetteMédicament1 = new javax.swing.JLabel();
        quantite = new javax.swing.JLabel();
        EtiquettePosologie = new javax.swing.JLabel();
        EtiquetteVoieAdministration = new javax.swing.JLabel();
        EtiquetteCommentaire = new javax.swing.JLabel();
        texteVoieAdministration = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        TexteCommentaire = new javax.swing.JTextPane();
        labelDatePrevue = new javax.swing.JLabel();
        texteDatePrevue = new javax.swing.JLabel();
        labelDateReelle = new javax.swing.JLabel();
        texteDateReelle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 242, 254));

        BoutonValider.setBackground(new java.awt.Color(4, 66, 114));
        BoutonValider.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BoutonValider.setForeground(new java.awt.Color(255, 255, 255));
        BoutonValider.setText("Valider");
        BoutonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonValiderActionPerformed(evt);
            }
        });

        EtiquettePrescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EtiquettePrescription.setText("Prescription");

        texteNomMedicament.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        texteNomMedicament.setText("Médicament");

        EtiquetteMédicament1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        EtiquetteMédicament1.setText("Médicament : ");

        quantite.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        quantite.setText("Quantité+unité+quand");

        EtiquettePosologie.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        EtiquettePosologie.setText("Posologie : ");

        EtiquetteVoieAdministration.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        EtiquetteVoieAdministration.setText("Voie d'administration : ");

        EtiquetteCommentaire.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        EtiquetteCommentaire.setText("Commentaire : ");

        texteVoieAdministration.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        texteVoieAdministration.setText("VoieAdministration");

        Scroll.setViewportView(TexteCommentaire);

        labelDatePrevue.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelDatePrevue.setText("Date prévue:");

        texteDatePrevue.setText("prevue");

        labelDateReelle.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelDateReelle.setText("Date de réalisation :");

        texteDateReelle.setText("reelle");
        texteDateReelle.setText("réelle");


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EtiquettePrescription)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtiquettePosologie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtiquetteMédicament1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texteNomMedicament))
                                    .addComponent(EtiquetteCommentaire)
                                    .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(EtiquetteVoieAdministration)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texteVoieAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelDatePrevue)
                                        .addGap(18, 18, 18)
                                        .addComponent(texteDatePrevue)
                                        .addGap(75, 75, 75)
                                        .addComponent(labelDateReelle)
                                        .addGap(18, 18, 18)
                                        .addComponent(texteDateReelle))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(BoutonValider)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(EtiquettePrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetteMédicament1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texteNomMedicament))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquettePosologie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantite))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetteVoieAdministration, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texteVoieAdministration))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDatePrevue)
                    .addComponent(texteDatePrevue)
                    .addComponent(labelDateReelle)
                    .addComponent(texteDateReelle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EtiquetteCommentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonValider)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonValiderActionPerformed
        // On récupère la date du jour
        java.util.Date date = new java.util.Date();
        java.sql.Date dateJour = new java.sql.Date(date.getTime());
        String dateSQL = dateJour.toString();
        // Mise à jour de la prescription
        HashMap<String, String> data = new HashMap<>();
        data.put("valide", "Y");
        data.put("idRealisateur", String.valueOf(utilisateur.getIdUtilisateur()));
        data.put("idRealisateur", String.valueOf(utilisateur.getIdUtilisateur()));
        data.put("dateRealisationActe", dateSQL);
        data.put("commentaire", TexteCommentaire.getText());
        try {
            dialogueBD.updateTable("Acte", data, "idActe", idPrescription);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Fermeture de la fenêtre
        this.dispose();
    }//GEN-LAST:event_BoutonValiderActionPerformed


    public void remplirPrescription(String idPrescription) {
        // Récupération des informations de la prescription
        String requete = "SELECT * FROM Acte WHERE idActe = " + idPrescription;
        ResultSet resultatPrescription = dialogueBD.requete(requete);
        try {
            if (resultatPrescription.next()) {
                // Récupération des informations du médicament
                String infosMedicament = resultatPrescription.getString("posologie");
                String commentaire = resultatPrescription.getString("commentaire");
                String[] infosMedicamentSplit = infosMedicament.split(" ");
                String nomMedicament = infosMedicamentSplit.length > 0 ? infosMedicamentSplit[0] : "";
                String posologie = infosMedicamentSplit.length > 2 ? infosMedicamentSplit[1] + " " + infosMedicamentSplit[2] : "";
                String voieAdministration = infosMedicamentSplit.length > 4 ? infosMedicamentSplit[4].trim() : "";
                String datePrevue = resultatPrescription.getString("datePrescription").substring(0, 10);
                String dateReelle = "Non administré";
                if(resultatPrescription.getString("dateRealisationActe") != null){
                    dateReelle = resultatPrescription.getString("dateRealisationActe").substring(0, 10);
                }
                // Affichage des informations
                texteNomMedicament.setText(nomMedicament);
                quantite.setText(posologie);
                texteVoieAdministration.setText(voieAdministration);
                TexteCommentaire.setText(commentaire);
                texteDatePrevue.setText(datePrevue);
                texteDateReelle.setText(dateReelle);

                // Visibilité du bouton "valider" et modification du commentaire
                boolean sejourOuvert;
                // Récupération de l'état du séjour
                ResultSet resultatSejour = dialogueBD.requete("SELECT ouvert FROM Sejour WHERE idSejour = " + resultatPrescription.getString("idSejour"));
                if (resultatSejour.next()) {
                    sejourOuvert = resultatSejour.getString("ouvert").equals("Y");
                } else {
                    sejourOuvert = false;
                }

                if (resultatPrescription.getString("valide").equals("Y") || !sejourOuvert) {
                    BoutonValider.setVisible(false); // On cache le bouton "valider"
                    TexteCommentaire.setEditable(false); // On rend le commentaire non modifiable
                }
                this.pack();
                this.revalidate();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonValider;
    private javax.swing.JLabel EtiquetteCommentaire;
    private javax.swing.JLabel EtiquetteMédicament1;
    private javax.swing.JLabel EtiquettePosologie;
    private javax.swing.JLabel EtiquettePrescription;
    private javax.swing.JLabel EtiquetteVoieAdministration;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTextPane TexteCommentaire;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDatePrevue;
    private javax.swing.JLabel labelDateReelle;
    private javax.swing.JLabel quantite;
    private javax.swing.JLabel texteDatePrevue;
    private javax.swing.JLabel texteDateReelle;
    private javax.swing.JLabel texteNomMedicament;
    private javax.swing.JLabel texteVoieAdministration;
    // End of variables declaration//GEN-END:variables
}
