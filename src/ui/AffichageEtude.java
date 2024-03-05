/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author emmaa
 */
public class AffichageEtude extends javax.swing.JPanel {

    /**
     * Creates new form AffichageEtude
     */
    
    // L'attribut longueur correspond à la longueur de l'écran
    protected int largeur;
    //L'attribut longueur1 correspond à la longueur du panneau Ouest de la fenêtre 
    protected int largeur1;
    // L'attribut hauteur correspond à la hauteur de l'écran
    protected int hauteur;
    //L'attribut hauteur1 correspond à la hauteur du panneau Ouest 
    protected int hauteur1;
    //L'attribut hauteur2 correspond à la hauteur du panneau Nord
    protected int hauteur2;
    //L'attribut largeurCentré correspond à 1/4 de largeur - largeur1
    protected int largeurCentree;
    //L'attribut largeurBouton correspond à la largeur des boutons d'ajout pour consultation, anesthésie, examen, prescription et radiologie
    protected int largeurBouton;
    //L'attribut hauteurInfo correspond à la hauteur du panneau info
    protected int hauteurInfo;
    //L'attribut hauteurCentral correspond à la hauteur du panneau central
    protected int hauteurCentral;
    
    public AffichageEtude() {
        initComponents();
        //-------- On définit les dimensions du panneau et de ses composants en fonction de la taille de l'écran -------
        //On récupère la taille de l'écran
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        //On stocke la largeur de l'écran dans la variable largeur
        largeur = tailleMoniteur.width;
        //On stocke la hauteur de l'écran dans la variable hauteur
        hauteur = tailleMoniteur.height;
        //L'attribut largeur1 correspond à 1/5 de la largeur de l'écran
        largeur1 = largeur / 5;
        //L'attribut largeurCentré correspond à 1/4 de (largeur-largeur1)
        largeurCentree = (largeur - largeur1) / 4;
        //L'attribut hauteur1 correspond à 4/5 de la hauteur de l'écran
        hauteur1 = hauteur - hauteur2;
        //L'attribut hauteur 2 correspond à 1/5 de la hauteur de l'écran
        hauteur2 = hauteur / 5;
        //L'attribut largeurBouton correspond à 1/8 de la largeur de largeurCentree
        largeurBouton = largeurCentree / 8;
        hauteurInfo = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauNord = new javax.swing.JPanel();
        IntituleEtudeClinique = new javax.swing.JLabel();
        TypeRecherche = new javax.swing.JLabel();
        TypeRechercheValeur = new javax.swing.JLabel();
        PraticienHospitaliier = new javax.swing.JLabel();
        nomPraticien = new javax.swing.JLabel();
        DateDemarrage = new javax.swing.JLabel();
        DateDemarrageValeur = new javax.swing.JLabel();
        DureeEtude = new javax.swing.JLabel();
        DureeEtudeValeur = new javax.swing.JLabel();
        PanneauSud = new javax.swing.JPanel();
        PanneauCentre = new javax.swing.JPanel();
        PatientsParticipants = new javax.swing.JLabel();
        BoutonAjouterUnPatientEtude = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListePatientsEtude = new javax.swing.JList();

        setPreferredSize(new Dimension(largeur-largeur1,hauteur1));
        setLayout(new java.awt.BorderLayout());

        PanneauNord.setBackground(new java.awt.Color(255, 255, 255));
        PanneauNord.setPreferredSize(new java.awt.Dimension(799, 160));

        IntituleEtudeClinique.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        IntituleEtudeClinique.setForeground(new java.awt.Color(4, 66, 114));
        IntituleEtudeClinique.setText("IntituleEtudeClinique");

        TypeRecherche.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TypeRecherche.setForeground(new java.awt.Color(4, 66, 114));
        TypeRecherche.setText("Type de la recherche :");

        TypeRechercheValeur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TypeRechercheValeur.setText("TypeRecherche");

        PraticienHospitaliier.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        PraticienHospitaliier.setForeground(new java.awt.Color(4, 66, 114));
        PraticienHospitaliier.setText("Praticien hospitalier :");

        nomPraticien.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nomPraticien.setText("nomPraticien");

        DateDemarrage.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        DateDemarrage.setForeground(new java.awt.Color(4, 66, 114));
        DateDemarrage.setText("Date de démarrage : ");

        DateDemarrageValeur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        DateDemarrageValeur.setText("dateDemarrage");

        DureeEtude.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        DureeEtude.setForeground(new java.awt.Color(4, 66, 114));
        DureeEtude.setText("Durée de l'étude : ");

        DureeEtudeValeur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        DureeEtudeValeur.setText("dureeEtude");

        javax.swing.GroupLayout PanneauNordLayout = new javax.swing.GroupLayout(PanneauNord);
        PanneauNord.setLayout(PanneauNordLayout);
        PanneauNordLayout.setHorizontalGroup(
            PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauNordLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(DateDemarrage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateDemarrageValeur)
                        .addGap(76, 76, 76)
                        .addComponent(DureeEtude)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DureeEtudeValeur))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(PraticienHospitaliier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomPraticien))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(TypeRecherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TypeRechercheValeur))
                    .addComponent(IntituleEtudeClinique))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        PanneauNordLayout.setVerticalGroup(
            PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauNordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntituleEtudeClinique)
                .addGap(18, 18, 18)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeRecherche)
                    .addComponent(TypeRechercheValeur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PraticienHospitaliier)
                    .addComponent(nomPraticien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateDemarrage)
                    .addComponent(DateDemarrageValeur)
                    .addComponent(DureeEtude)
                    .addComponent(DureeEtudeValeur))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(PanneauNord, java.awt.BorderLayout.PAGE_START);

        PanneauSud.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauSudLayout = new javax.swing.GroupLayout(PanneauSud);
        PanneauSud.setLayout(PanneauSudLayout);
        PanneauSudLayout.setHorizontalGroup(
            PanneauSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        PanneauSudLayout.setVerticalGroup(
            PanneauSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(PanneauSud, java.awt.BorderLayout.PAGE_END);

        PanneauCentre.setBackground(new java.awt.Color(255, 255, 255));
        PanneauCentre.setPreferredSize(new java.awt.Dimension(799, 280));

        PatientsParticipants.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        PatientsParticipants.setForeground(new java.awt.Color(4, 66, 114));
        PatientsParticipants.setText("Patients participants à l'étude ");

        BoutonAjouterUnPatientEtude.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonAjouterUnPatientEtude.setForeground(new java.awt.Color(4, 66, 114));
        BoutonAjouterUnPatientEtude.setText("Ajouter un patient ");
        BoutonAjouterUnPatientEtude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAjouterUnPatientEtudeActionPerformed(evt);
            }
        });

        ListePatientsEtude.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListePatientsEtude);

        javax.swing.GroupLayout PanneauCentreLayout = new javax.swing.GroupLayout(PanneauCentre);
        PanneauCentre.setLayout(PanneauCentreLayout);
        PanneauCentreLayout.setHorizontalGroup(
            PanneauCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauCentreLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanneauCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonAjouterUnPatientEtude)
                    .addComponent(PatientsParticipants)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanneauCentreLayout.setVerticalGroup(
            PanneauCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientsParticipants)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonAjouterUnPatientEtude)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        add(PanneauCentre, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonAjouterUnPatientEtudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAjouterUnPatientEtudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonAjouterUnPatientEtudeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonAjouterUnPatientEtude;
    private javax.swing.JLabel DateDemarrage;
    private javax.swing.JLabel DateDemarrageValeur;
    private javax.swing.JLabel DureeEtude;
    private javax.swing.JLabel DureeEtudeValeur;
    private javax.swing.JLabel IntituleEtudeClinique;
    private javax.swing.JList ListePatientsEtude;
    private javax.swing.JPanel PanneauCentre;
    private javax.swing.JPanel PanneauNord;
    private javax.swing.JPanel PanneauSud;
    private javax.swing.JLabel PatientsParticipants;
    private javax.swing.JLabel PraticienHospitaliier;
    private javax.swing.JLabel TypeRecherche;
    private javax.swing.JLabel TypeRechercheValeur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomPraticien;
    // End of variables declaration//GEN-END:variables
}