/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import fc.DialogueBD;

import java.util.HashMap;

/**
 *
 * @author emmaa
 */
public class AjouterPrescription extends javax.swing.JFrame {

    /**
     * Creates new form AjouterPrescription
     */
    private DialogueBD dialogueBD;
    public AjouterPrescription() {
        initComponents();
        setResizable(false);
    }

    public AjouterPrescription(DialogueBD dialogueBD, String langue) {
        initComponents();
        this.dialogueBD = dialogueBD;
        dialogueBD.connect();
        changerLangue(langue);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        AjouterUnePrescription = new javax.swing.JLabel();
        NomMedicament = new javax.swing.JLabel();
        TexteNomMedicament = new javax.swing.JTextField();
        Posologie = new javax.swing.JLabel();
        Quantite = new javax.swing.JLabel();
        TexteQuantite = new javax.swing.JTextField();
        MenuDeroulantQuantite = new javax.swing.JComboBox();
        Matin = new javax.swing.JRadioButton();
        Midi = new javax.swing.JRadioButton();
        Soir = new javax.swing.JRadioButton();
        VoieAdministration = new javax.swing.JLabel();
        BoutonAjouter = new javax.swing.JButton();
        Commentaire = new javax.swing.JLabel();
        MenuDeroulantVoie = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TexteCommentaire = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AjouterUnePrescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AjouterUnePrescription.setText("Ajouter une prescription ");

        NomMedicament.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NomMedicament.setText("Nom du médicament ");

        Posologie.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Posologie.setText("Posologie");

        Quantite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Quantite.setText("Quantité ");

        MenuDeroulantQuantite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mg", "mL", "comprimés" }));

        buttonGroup1.add(Matin);
        Matin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Matin.setText("Matin");
        Matin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatinActionPerformed(evt);
            }
        });

        buttonGroup1.add(Midi);
        Midi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Midi.setText("Midi");

        buttonGroup1.add(Soir);
        Soir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Soir.setText("Soir");

        VoieAdministration.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        VoieAdministration.setText("Voie d'administration");

        BoutonAjouter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonAjouter.setText("Ajouter");
        BoutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAjouterActionPerformed(evt);
            }
        });

        Commentaire.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Commentaire.setText("Commentaire");

        MenuDeroulantVoie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        MenuDeroulantVoie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Auriculaire", "Intra-veineuse", "Intramusculaire", "Intrathécale", "Nasale", "Orale", "Rectale", "Sous-cutanée", "Sublinguale", "Transdermique", "Vaginale" }));

        jScrollPane1.setViewportView(TexteCommentaire);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TexteNomMedicament)
                    .addComponent(MenuDeroulantVoie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AjouterUnePrescription)
                            .addComponent(NomMedicament)
                            .addComponent(Posologie)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(Matin)
                                .addGap(34, 34, 34)
                                .addComponent(Midi)
                                .addGap(35, 35, 35)
                                .addComponent(Soir))
                            .addComponent(VoieAdministration)
                            .addComponent(Commentaire))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(Quantite)
                        .addGap(18, 18, 18)
                        .addComponent(TexteQuantite)
                        .addGap(18, 18, 18)
                        .addComponent(MenuDeroulantQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(BoutonAjouter)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AjouterUnePrescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomMedicament)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TexteNomMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Posologie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Quantite)
                    .addComponent(TexteQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuDeroulantQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matin)
                    .addComponent(Midi)
                    .addComponent(Soir))
                .addGap(18, 18, 18)
                .addComponent(VoieAdministration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuDeroulantVoie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Commentaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonAjouter)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatinActionPerformed

    private void BoutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAjouterActionPerformed
        String nomMedicament = TexteNomMedicament.getText();
        String quantite = TexteQuantite.getText()+ MenuDeroulantQuantite.getSelectedItem();
        String posologie = "";
        if(Matin.isSelected()){
            posologie += "Matin ";
        }
        if(Midi.isSelected()){
            posologie += "Midi ";
        }
        if(Soir.isSelected()){
            posologie += "Soir ";
        }
        String voieAdministration = (String) MenuDeroulantVoie.getSelectedItem();
        String commentaire = TexteCommentaire.getText();
        HashMap<String, String> prescriptionData = new HashMap<String, String>();
        // TODO: ajouter le prescritpeur (utilisateur, le patient cible (dont le dossier est ouvert, le code, le cout ?)
        prescriptionData.put("nom", "prescription");
        prescriptionData.put("posologie", nomMedicament + " " + quantite + " " + posologie + " " + voieAdministration);
        prescriptionData.put("commentaire", commentaire);
        dialogueBD.insertPrescription(prescriptionData);

        // On envoie les données à la base de données
    }//GEN-LAST:event_BoutonAjouterActionPerformed

    public void changerLangue(String langue) {
        if(langue.equals("English")){
            AjouterUnePrescription.setText("Add a prescription");
            NomMedicament.setText("Drug name");
            Posologie.setText("Dosage");
            Quantite.setText("Quantity");
            Matin.setText("Morning");
            Midi.setText("Noon");
            Soir.setText("Evening");
            VoieAdministration.setText("Intake way");
            Commentaire.setText("Comment");
            BoutonAjouter.setText("Add");
            MenuDeroulantVoie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Auricular", "Intravenous", "Intramuscular", "Intrathecal", "Nasal", "Oral", "Rectal", "Subcutaneous", "Sublingual", "Transdermal", "Vaginal" }));
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
            java.util.logging.Logger.getLogger(AjouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterPrescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterPrescription(new DialogueBD(),"English").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjouterUnePrescription;
    private javax.swing.JButton BoutonAjouter;
    private javax.swing.JLabel Commentaire;
    private javax.swing.JRadioButton Matin;
    private javax.swing.JComboBox MenuDeroulantQuantite;
    private javax.swing.JComboBox MenuDeroulantVoie;
    private javax.swing.JRadioButton Midi;
    private javax.swing.JLabel NomMedicament;
    private javax.swing.JLabel Posologie;
    private javax.swing.JLabel Quantite;
    private javax.swing.JRadioButton Soir;
    private javax.swing.JTextPane TexteCommentaire;
    private javax.swing.JTextField TexteNomMedicament;
    private javax.swing.JTextField TexteQuantite;
    private javax.swing.JLabel VoieAdministration;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
