/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import fc.DialogueBD;

import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author emmaa
 */
public class AjoutPatient extends javax.swing.JFrame {

    /**
     * Creates new form AjoutPatient
     */

    private final DialogueBD dialogueBD;
    public AjoutPatient(DialogueBD dialogueBD, String langue) {
        initComponents();
        this.dialogueBD = dialogueBD;
        // Pour empêcher le redimensionnement de la fenêtre
        setResizable(false);
        // On change la langue de l'interface
        changerLangue(langue);
        //
        MenuDeroulantService.setModel(new javax.swing.DefaultComboBoxModel<>(dialogueBD.getServices().toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TexteAjouterUnPatient = new javax.swing.JLabel();
        OngletIdentite = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Nom = new javax.swing.JLabel();
        TexteNom = new javax.swing.JTextField();
        Prenom = new javax.swing.JLabel();
        TextePrenom = new javax.swing.JTextField();
        DateNaissance = new javax.swing.JLabel();
        TexteDateNaissance = new javax.swing.JTextField();
        sexe = new javax.swing.JLabel();
        Femme = new javax.swing.JRadioButton();
        Homme = new javax.swing.JRadioButton();
        Adresse = new javax.swing.JLabel();
        Voie = new javax.swing.JLabel();
        TexteAdresse = new javax.swing.JTextField();
        CodePostal = new javax.swing.JLabel();
        TexteCodePostal = new javax.swing.JTextField();
        Ville = new javax.swing.JLabel();
        TexteVille = new javax.swing.JTextField();
        Pays = new javax.swing.JLabel();
        TextePays = new javax.swing.JTextField();
        telephone = new javax.swing.JLabel();
        TexteTelephone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        fumeur = new javax.swing.JLabel();
        FumeurOui = new javax.swing.JRadioButton();
        FumeurNon = new javax.swing.JRadioButton();
        alcool = new javax.swing.JLabel();
        AlcoolOui = new javax.swing.JRadioButton();
        AlcoolNon = new javax.swing.JRadioButton();
        donneesSociales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TexteDonneesSociales = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        Service = new javax.swing.JLabel();
        MenuDeroulantService = new javax.swing.JComboBox();
        MedecinReferant = new javax.swing.JLabel();
        TexteMedecinReferant = new javax.swing.JTextField();
        boutonAjouter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TexteAjouterUnPatient.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TexteAjouterUnPatient.setText("Ajouter un patient ");

        OngletIdentite.setBackground(new java.awt.Color(204, 255, 204));
        OngletIdentite.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Nom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nom.setText("Nom");

        TexteNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexteNomActionPerformed(evt);
            }
        });

        Prenom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Prenom.setText("Prénom");

        DateNaissance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        DateNaissance.setText("Date de Naissance");

        sexe.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sexe.setText("Sexe");

        Femme.setText("Femme");

        Homme.setText("Homme");

        Adresse.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Adresse.setText("Adresse");

        Voie.setText("N° et nom de voie");

        CodePostal.setText("Code Postal");

        Ville.setText("Ville");

        Pays.setText("Pays");

        telephone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telephone.setText("Téléphone");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexteTelephone)
                    .addComponent(TexteNom)
                    .addComponent(TextePrenom)
                    .addComponent(TexteDateNaissance)
                    .addComponent(TexteAdresse)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodePostal)
                            .addComponent(TexteCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ville)
                            .addComponent(TexteVille, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Pays)
                                .addGap(36, 36, 36))
                            .addComponent(TextePays)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexe)
                            .addComponent(Nom)
                            .addComponent(Prenom)
                            .addComponent(DateNaissance)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Femme, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Homme))
                            .addComponent(Adresse)
                            .addComponent(Voie)
                            .addComponent(telephone))
                        .addGap(0, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TexteNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateNaissance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TexteDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sexe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Femme)
                    .addComponent(Homme))
                .addGap(18, 18, 18)
                .addComponent(Adresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Voie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexteAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodePostal)
                    .addComponent(Ville)
                    .addComponent(Pays))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexteCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexteVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextePays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telephone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexteTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        OngletIdentite.addTab("Identité", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        fumeur.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fumeur.setText("Fumeur");

        FumeurOui.setText("OUI");

        FumeurNon.setText("NON");

        alcool.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        alcool.setText("Alcool");

        AlcoolOui.setText("OUI");

        AlcoolNon.setText("NON");

        donneesSociales.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        donneesSociales.setText("Données sociales");

        jScrollPane1.setViewportView(TexteDonneesSociales);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fumeur)
                            .addComponent(alcool)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FumeurOui)
                                    .addComponent(AlcoolOui))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AlcoolNon)
                                    .addComponent(FumeurNon)))
                            .addComponent(donneesSociales))
                        .addGap(0, 289, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fumeur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FumeurOui)
                    .addComponent(FumeurNon))
                .addGap(18, 18, 18)
                .addComponent(alcool)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlcoolOui)
                    .addComponent(AlcoolNon))
                .addGap(18, 18, 18)
                .addComponent(donneesSociales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        OngletIdentite.addTab("Données Médicales", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Service.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Service.setText("Service");

        MenuDeroulantService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Anapathologie", "Cardiologie", "Chirurgie", "Dermatologie", "Gynécologie", "Hématologie", "Immunologie", "Médecine Générale", "Neurologie", "Obstétrie", "Oncologie", "Pneumologie", "Psychiatrie", "Radiologie", "Réanimation", "Urologie", "Urgence" }));

        MedecinReferant.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MedecinReferant.setText("Médecin référant");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexteMedecinReferant)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Service)
                            .addComponent(MenuDeroulantService, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedecinReferant))
                        .addGap(0, 190, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Service)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuDeroulantService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedecinReferant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexteMedecinReferant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        OngletIdentite.addTab("Service", jPanel4);

        boutonAjouter.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        boutonAjouter.setText("Ajouter");
        boutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    boutonAjouterActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OngletIdentite)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TexteAjouterUnPatient)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(boutonAjouter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TexteAjouterUnPatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OngletIdentite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonAjouter)
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

    private void TexteNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexteNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexteNomActionPerformed

    private void boutonAjouterActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_boutonAjouterActionPerformed
        // On s'assure que le patient n'existe pas déjà (en se basant sur le nom, le prénom et la date de naissance)
        if(dialogueBD.patientExiste(TexteNom.getText(), TextePrenom.getText(), TexteDateNaissance.getText())){
            // Si le patient existe déjà, on affiche un message d'erreur
            javax.swing.JOptionPane.showMessageDialog(null, "Le patient existe déjà");
            System.out.println("Le patient existe déjà");
        }
        // Si le patient n'existe pas, on l'ajoute à la base de données
        else{
            // On récupère les données saisies par l'utilisateur
            // On met des guillemets simples pour les CHAR et VARCHAR dans les requêtes SQL
            String nom = "'"+TexteNom.getText()+"'";
            String prenom = "'"+TextePrenom.getText()+"'";
            String telephone = "'"+TexteTelephone.getText()+"'";
            String adresse = "'"+TexteAdresse.getText() + "-" + TexteCodePostal.getText() + " " + TexteVille.getText() + "-" + TextePays.getText()+"'";
            String donneesSociales = "'"+TexteDonneesSociales.getText()+"'";
            String dateNaissance = "'"+TexteDateNaissance.getText()+"'";

            // On récupère le sexe du patient (Femme, Homme ou null si rien n'est sélectionné)
            String sexe = Femme.isSelected() ? "'F'" : (Homme.isSelected() ? "'M'" : null);
            // On récupère si le patient est fumeur ou non (Oui, Non ou null si rien n'est sélectionné)
            String fumeur = FumeurOui.isSelected() ? "'Y'" : (FumeurNon.isSelected() ? "'N'" : null);
            // On récupère si le patient consomme de l'alcool ou non (Oui, Non ou null si rien n'est sélectionné)
            String alcool = AlcoolOui.isSelected() ? "'Y'" : (AlcoolNon.isSelected() ? "'N'" : null);

            String service = (String) MenuDeroulantService.getSelectedItem();
            String medecinReferant = TexteMedecinReferant.getText();

            // On crée un tableau contenant les données du patient
            // TODO : changer les valeurs null par ce qui devra correspondre plus tard (idService, idLocG)
            // TODO : gérer la création d'un séjour et la liaison avec le patient
            HashMap<String, String> data = new HashMap<>();
            data.put("nom", nom);
            data.put("prenom", prenom);
            data.put("dateNaissance", dateNaissance);
            data.put("sexe", sexe);
            data.put("adresse", adresse);
            data.put("dossierVisible", "'Y'");
            data.put("vivant", "'Y'");
            data.put("telephone", telephone);
            data.put("fumeur", fumeur);
            data.put("alcool", alcool);
            data.put("donneesSociales", donneesSociales);
            data.put("idService", null);
            data.put("idLocG", null);



            // On insère le patient dans la base de données
            dialogueBD.insertPatient(data);
            // On affiche un message de confirmation
            javax.swing.JOptionPane.showMessageDialog(null, "Le patient a été ajouté avec succès");
            System.out.println("Le patient a été ajouté avec succès");
        }

    }//GEN-LAST:event_boutonAjouterActionPerformed


    /**
     * Permet de changer la langue de l'interface
     * @param langue : la langue choisie
     */
    public void changerLangue(String langue){
        // Si la langue choisie est le français
        if(langue.equals("Français")){
            TexteAjouterUnPatient.setText("Ajouter un patient");
            Nom.setText("Nom");
            Prenom.setText("Prénom");
            DateNaissance.setText("Date de Naissance");
            sexe.setText("Sexe");
            Femme.setText("Femme");
            Homme.setText("Homme");
            Adresse.setText("Adresse");
            Voie.setText("N° et nom de voie");
            CodePostal.setText("Code Postal");
            Ville.setText("Ville");
            Pays.setText("Pays");
            telephone.setText("Téléphone");
            fumeur.setText("Fumeur");
            FumeurOui.setText("OUI");
            FumeurNon.setText("NON");
            alcool.setText("Alcool");
            AlcoolOui.setText("OUI");
            AlcoolNon.setText("NON");
            donneesSociales.setText("Données sociales");
            Service.setText("Service");
            MedecinReferant.setText("Médecin référant");
            boutonAjouter.setText("Ajouter");

            // On change le titre des onglets
            OngletIdentite.setTitleAt(0, "Identité");
            OngletIdentite.setTitleAt(1, "Données Médicales");
            OngletIdentite.setTitleAt(2, "Service");

        }
        // Si la langue choisie est l'anglais
        else if(langue.equals("English")) {
            TexteAjouterUnPatient.setText("Add a patient");
            Nom.setText("Name");
            Prenom.setText("First name");
            DateNaissance.setText("Date of birth");
            sexe.setText("Sex");
            Femme.setText("Female");
            Homme.setText("Male");
            Adresse.setText("Address");
            Voie.setText("Street number and name");
            CodePostal.setText("Postal code");
            Ville.setText("City");
            Pays.setText("Country");
            telephone.setText("Phone number");
            fumeur.setText("Smoker");
            alcool.setText("Alcohol");
            donneesSociales.setText("Social data");
            Service.setText("Unit");
            MedecinReferant.setText("Referring doctor");
            boutonAjouter.setText("Add");
            // On change le titre des onglets
            OngletIdentite.setTitleAt(0, "Identity");
            OngletIdentite.setTitleAt(1, "Medical data");
            OngletIdentite.setTitleAt(2, "Unit");
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
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // On instancie un objet DialogueBD pour communiquer avec la base de données
                DialogueBD dialogueBD = new DialogueBD();
                // On se connecte à la base de données
                dialogueBD.connect();
                // On instancie l'interface d'ajout de patient
                new AjoutPatient(dialogueBD, "Français").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adresse;
    private javax.swing.JRadioButton AlcoolNon;
    private javax.swing.JRadioButton AlcoolOui;
    private javax.swing.JLabel CodePostal;
    private javax.swing.JLabel DateNaissance;
    private javax.swing.JRadioButton Femme;
    private javax.swing.JRadioButton FumeurNon;
    private javax.swing.JRadioButton FumeurOui;
    private javax.swing.JRadioButton Homme;
    private javax.swing.JLabel MedecinReferant;
    private javax.swing.JComboBox MenuDeroulantService;
    private javax.swing.JLabel Nom;
    private javax.swing.JTabbedPane OngletIdentite;
    private javax.swing.JLabel Pays;
    private javax.swing.JLabel Prenom;
    private javax.swing.JLabel Service;
    private javax.swing.JTextField TexteAdresse;
    private javax.swing.JLabel TexteAjouterUnPatient;
    private javax.swing.JTextField TexteCodePostal;
    private javax.swing.JTextField TexteDateNaissance;
    private javax.swing.JTextPane TexteDonneesSociales;
    private javax.swing.JTextField TexteMedecinReferant;
    private javax.swing.JTextField TexteNom;
    private javax.swing.JTextField TextePays;
    private javax.swing.JTextField TextePrenom;
    private javax.swing.JTextField TexteTelephone;
    private javax.swing.JTextField TexteVille;
    private javax.swing.JLabel Ville;
    private javax.swing.JLabel Voie;
    private javax.swing.JLabel alcool;
    private javax.swing.JButton boutonAjouter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel donneesSociales;
    private javax.swing.JLabel fumeur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sexe;
    private javax.swing.JLabel telephone;
    // End of variables declaration//GEN-END:variables
}
