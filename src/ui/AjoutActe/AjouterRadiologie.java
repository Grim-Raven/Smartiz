/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AjoutActe;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import fc.DialogueBD;
import fc.Utilisateur;
import fc.hl7.messageHL7;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author emmaa
 */
public class AjouterRadiologie extends javax.swing.JFrame {

    /**
     * Creates new form AjouterRadiologie
     */
    
        private final DialogueBD dialogueBD;
        private final Utilisateur utilisateur;
        private final String idSejour;
        
    public AjouterRadiologie(DialogueBD dialogueBD, Utilisateur utilisateur,String idSejour) {
        initComponents();
        //Pour empêcher le redimensionnement de la fenêtre, on utilise setResizable(false)
        setResizable(false);
        this.dialogueBD = dialogueBD;
        this.utilisateur = utilisateur;
        this.idSejour = idSejour;
        changerLangue(this.utilisateur.getLangue());
        // On met la date du jour par défaut
        DateChooserExamen.setDate(new java.util.Date());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTypeExamen = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        DemandeExamenRadiologie = new javax.swing.JLabel();
        TypeExamen = new javax.swing.JLabel();
        BoutonRadiographie = new javax.swing.JRadioButton();
        BoutonEchographie = new javax.swing.JRadioButton();
        BoutonScanner = new javax.swing.JRadioButton();
        BoutonIRM = new javax.swing.JRadioButton();
        BoutonScintigraphie = new javax.swing.JRadioButton();
        BoutonTomographie = new javax.swing.JRadioButton();
        Date = new javax.swing.JLabel();
        DateChooserExamen = new com.toedter.calendar.JDateChooser();
        Commentaire = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ZoneCommentaire = new javax.swing.JTextArea();
        BoutonAjouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 242, 254));

        DemandeExamenRadiologie.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DemandeExamenRadiologie.setText("Demande d'examen(s) radiologique(s)");

        TypeExamen.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TypeExamen.setText("Type(s) d'examen(s)");

        BoutonRadiographie.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonRadiographie);
        BoutonRadiographie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonRadiographie.setText("Radiographie");
        BoutonRadiographie.setActionCommand("Radiographie");

        BoutonEchographie.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonEchographie);
        BoutonEchographie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonEchographie.setText("Echographie");
        BoutonEchographie.setActionCommand("Echographie");

        BoutonScanner.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonScanner);
        BoutonScanner.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonScanner.setText("Scanner");
        BoutonScanner.setActionCommand("Scanner");

        BoutonIRM.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonIRM);
        BoutonIRM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonIRM.setText("IRM");
        BoutonIRM.setActionCommand("IRM");

        BoutonScintigraphie.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonScintigraphie);
        BoutonScintigraphie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonScintigraphie.setText("Scintigraphie");
        BoutonScintigraphie.setActionCommand("Scintigraphie");

        BoutonTomographie.setBackground(new java.awt.Color(236, 242, 254));
        buttonGroupTypeExamen.add(BoutonTomographie);
        BoutonTomographie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonTomographie.setText("Tomographie");
        BoutonTomographie.setActionCommand("Tomographie");

        Date.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Date.setText("Date");

        Commentaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Commentaire.setText("Commentaire");

        ZoneCommentaire.setColumns(20);
        ZoneCommentaire.setRows(5);
        jScrollPane1.setViewportView(ZoneCommentaire);

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DemandeExamenRadiologie)
                            .addComponent(TypeExamen)
                            .addComponent(Date)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DateChooserExamen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BoutonRadiographie)
                                            .addComponent(BoutonScintigraphie))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BoutonEchographie)
                                            .addComponent(BoutonTomographie))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BoutonScanner)
                                    .addComponent(BoutonIRM)))
                            .addComponent(Commentaire))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(BoutonAjouter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DemandeExamenRadiologie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TypeExamen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonRadiographie)
                    .addComponent(BoutonEchographie)
                    .addComponent(BoutonScanner))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonScintigraphie)
                    .addComponent(BoutonTomographie)
                    .addComponent(BoutonIRM))
                .addGap(18, 18, 18)
                .addComponent(Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChooserExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Commentaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void BoutonAjouterActionPerformed(ActionEvent evt) {//GEN-FIRST:event_BoutonAjouterActionPerformed
        // Récupération des données
        //TODO : Rendre des champs obligatoires
        String typeExamen = buttonGroupTypeExamen.getSelection().getActionCommand();
        String dateExamen = new Date(DateChooserExamen.getDate().getTime()).toString();
        String commentaire = ZoneCommentaire.getText();

        // Création de la HashMap pour l'ajout de l'examen radiologique dans la base de données
        HashMap<String, String> dataSQL = new HashMap<>();
        dataSQL.put("nom", typeExamen);
        dataSQL.put("dateRealisationActe", dateExamen);
        dataSQL.put("commentaire", commentaire);
        dataSQL.put("idSejour", idSejour);
        dataSQL.put("idService", "15");
        dataSQL.put("idPrescripteur", utilisateur.getIdUtilisateur());
        dataSQL.put("valide", "N");

        // Ajout de l'examen radiologique à la BD
        String idActe = dialogueBD.insertActe(dataSQL);
        System.out.println("Ajouté à la base de données");

        // Création de la HashMap pour l'envoi de l'examen radiologique au SIR via HL7
        HashMap<String, String> dataHL7 = new HashMap<>();
        // Remplissage des informations sur la demande
        dataHL7.put("idDemande", idActe);
        dataHL7.put("codeExamen", "RADIO");
        dataHL7.put("nomExamen", typeExamen);
        dataHL7.put("commentaire", commentaire);
        dataHL7.put("dateExamen",dateExamen.replace("-",""));
        // Remplissage des informations relatives au patient
        // On récupère les informations du patient lié au séjour dans lequel l'acte est inclus
        String requete =
                "SELECT * "+
                "FROM Sejour JOIN Patient USING(idPatient) "+
                "WHERE idSejour="+idSejour;
        ResultSet resultPatient = dialogueBD.requete(requete);
        try {
            resultPatient.next(); // Positionnement sur la 1ère ligne
            dataHL7.put("nom",resultPatient.getString("nom").trim());
            dataHL7.put("prenom", resultPatient.getString("prenom").trim());
            dataHL7.put("idPatient", resultPatient.getString("idPatient"));
            // Retrait des "-" dans la date de naissance
            dataHL7.put("dateNaissance", resultPatient.getString("dateNaissance").substring(0,10).replace("-",""));
            dataHL7.put("sexe", resultPatient.getString("sexe"));
            dataHL7.put("adresse", resultPatient.getString("adresse"));
            // Envoi de la demande
            //TODO : Faire quelque chose si pas de réponse
            Message reponse = messageHL7.envoieDemandeRadio(dataHL7);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (HL7Exception e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Fermeture de la fenêtre
        this.dispose();
    }//GEN-LAST:event_BoutonAjouterActionPerformed
    /**
     * Méthode pour changer la langue de l'interface
     * @param langue Langue choisie pour l'interface
     */
    public void changerLangue(String langue) {
         //Si la langue sélectionnée lors la connexion est l'anglais, alors l'interface s'affiche en anglais
         //On remplace chaque composant par son équivalent anglais
        if(langue.equals("English")){
            DemandeExamenRadiologie.setText("Request for radiological examination");
            TypeExamen.setText("Type(s) of examination(s)");
            Commentaire.setText("Comment");
            BoutonEchographie.setText("Ultrasound");
            BoutonIRM.setText("MRI");
            BoutonRadiographie.setText("X-Ray");
            BoutonScanner.setText("");
            BoutonScintigraphie.setText("Scintigraphy");
            BoutonTomographie.setText("Tomography");
            BoutonAjouter.setText("Add");      
            
        }}
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
            java.util.logging.Logger.getLogger(AjouterRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterRadiologie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterRadiologie(new DialogueBD(),new Utilisateur("Cot","Harry",true,"Français", 1,1111,"Y"),"3").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonAjouter;
    private javax.swing.JRadioButton BoutonEchographie;
    private javax.swing.JRadioButton BoutonIRM;
    private javax.swing.JRadioButton BoutonRadiographie;
    private javax.swing.JRadioButton BoutonScanner;
    private javax.swing.JRadioButton BoutonScintigraphie;
    private javax.swing.JRadioButton BoutonTomographie;
    private javax.swing.JLabel Commentaire;
    private javax.swing.JLabel Date;
    private com.toedter.calendar.JDateChooser DateChooserExamen;
    private javax.swing.JLabel DemandeExamenRadiologie;
    private javax.swing.JLabel TypeExamen;
    private javax.swing.JTextArea ZoneCommentaire;
    private javax.swing.ButtonGroup buttonGroupTypeExamen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
