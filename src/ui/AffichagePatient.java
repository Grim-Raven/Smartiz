/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.AjoutActe.*;
import fc.DialogueBD;
import fc.Utilisateur;
import ui.tracabilite.HistoriqueConsultationDossier;
import ui.validerActes.ValidationPrescription;
import ui.validerActes.ValiderConsultation;
import ui.validerActes.ValiderRadiologie;
import ui.validerActes.ValiderAnesthesie;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author emmaa
 */
public class AffichagePatient extends javax.swing.JPanel {

    /**
     * Creates new form AffichagePatient
     */
    // L'attribut longueur correspond à la longueur de l'écran
    protected int largeur;
    //L'attribut longueur1 correspond à la longueur du panneau Ouest
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

    //Code couleur : bleu foncé -> 044272
    //Code couleur : bleu clair -> ecf2fe

    public DialogueBD dialogueBD;
    public Utilisateur utilisateur;
    public HashMap<String, String> dicoActes = new HashMap<>();

    public AffichagePatient(String idPatient, Utilisateur utilisateur, DialogueBD dialogueBD) {

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
        //L'attribut hauteur 2 correspond à 1/5 de la hauteur de l'écran
        hauteur2 = hauteur / 5;
        //L'attribut hauteur1 correspond à 4/5 de la hauteur de l'écran
        hauteur1 = hauteur - hauteur2;
        //L'attribut largeurBouton correspond à 1/8 de la largeur de largeurCentree
        largeurBouton = largeurCentree / 8;
        hauteurInfo = 1;

        // -------------------------------- On initialise les composants de l'interface --------------------------------
        initComponents();
        //On définit le texte du label nomUtilisateur
        this.utilisateur = utilisateur;
        this.nomUtilisateur.setText(utilisateur.getPrenom().trim() + " " + utilisateur.getNom().trim());
        this.dialogueBD = dialogueBD;
        // On remplit les informations du patient
        remplirChampsPatient(idPatient);
        remplirSejours(idPatient);
        remplirActes();
        // On ajoute à la base de donnée la consultation du dossier par l'utilisateur
        // Création de la requête
        String requete = "INSERT INTO Historique (idPersonnel, idPatient, dateConsultation) VALUES ('" + utilisateur.getIdUtilisateur() + "', '" + idPatient + "', CURRENT_DATE)";
        // Envoi de la requête
        dialogueBD.requete(requete);
        // Changement de la langue de l'interface si nécessaire
        changerLangue(this.utilisateur.getLangue());
    }

    public void changerLangue(String langue) {
        if (langue.equals("English")) {
            NeeLe.setText("Born on the : ");
            Adresse.setText("Address : ");
            Fumeur.setText("Smoker : ");
            Alcool.setText("Alcohol : ");
            Sexe.setText("Sex : ");
            Telephone.setText("Phone number : ");
            Ajout.setText("Add : ");
            BoutonRadiologie.setText("Radiology");
            BoutonAnesthesie.setText("Anesthesia");
            BoutonExamenBiologique.setText("Biological Examination");
            boutonCloture.setText("End stay");
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

        jProgressBar1 = new javax.swing.JProgressBar();
        PanneauNord = new javax.swing.JPanel();
        NomPrenomPatient = new javax.swing.JLabel();
        NeeLe = new javax.swing.JLabel();
        DateNaissancePatient = new javax.swing.JLabel();
        Sexe = new javax.swing.JLabel();
        SexePatient = new javax.swing.JLabel();
        IPPPatient = new javax.swing.JLabel();
        Adresse = new javax.swing.JLabel();
        AdressePatient = new javax.swing.JLabel();
        Telephone = new javax.swing.JLabel();
        TelephonePatient = new javax.swing.JLabel();
        Fumeur = new javax.swing.JLabel();
        FumeurPatient = new javax.swing.JLabel();
        Alcool = new javax.swing.JLabel();
        AlcoolPatient = new javax.swing.JLabel();
        labelChambre = new javax.swing.JLabel();
        labelLit = new javax.swing.JLabel();
        texteLit = new javax.swing.JLabel();
        texteChambre = new javax.swing.JLabel();
        PanneauSud = new javax.swing.JPanel();
        panelCloture = new javax.swing.JPanel();
        boutonCloture = new javax.swing.JButton();
        nomUtilisateur = new javax.swing.JLabel();
        boutonHistorique = new javax.swing.JButton();
        PanneauCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeActes = new javax.swing.JList();
        panelSejourEtBoutons = new javax.swing.JPanel();
        MenuDeroulantSejours = new javax.swing.JComboBox();
        Ajout = new javax.swing.JLabel();
        PanelBoutons = new javax.swing.JPanel();
        BoutonRadiologie = new javax.swing.JButton();
        BoutonAnesthesie = new javax.swing.JButton();
        BoutonConsultation = new javax.swing.JButton();
        BoutonPrescription = new javax.swing.JButton();
        BoutonExamenBiologique = new javax.swing.JButton();

        setPreferredSize(new Dimension(largeur-largeur1,hauteur1));
        setLayout(new java.awt.BorderLayout());

        PanneauNord.setBackground(new java.awt.Color(255, 255, 255));
        PanneauNord.setPreferredSize(new java.awt.Dimension(707, 150));

        NomPrenomPatient.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        NomPrenomPatient.setForeground(new java.awt.Color(4, 66, 114));
        NomPrenomPatient.setText("NomPrenomPatient");

        NeeLe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        NeeLe.setForeground(new java.awt.Color(4, 66, 114));
        NeeLe.setText("Né(e) le : ");

        DateNaissancePatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        DateNaissancePatient.setText("DateNaissancePatient");

        Sexe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Sexe.setForeground(new java.awt.Color(4, 66, 114));
        Sexe.setText("Sexe : ");

        SexePatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        SexePatient.setText("SexePatient");

        IPPPatient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        IPPPatient.setText("IPPPatient");

        Adresse.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Adresse.setForeground(new java.awt.Color(4, 66, 114));
        Adresse.setText("Adresse : ");

        AdressePatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        AdressePatient.setText("AdressePatient");

        Telephone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Telephone.setForeground(new java.awt.Color(4, 66, 114));
        Telephone.setText("Téléphone : ");

        TelephonePatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        TelephonePatient.setText("TelephonePatient");

        Fumeur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Fumeur.setForeground(new java.awt.Color(4, 66, 114));
        Fumeur.setText("Fumeur : ");

        FumeurPatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        FumeurPatient.setText("FumeurPatient");

        Alcool.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Alcool.setForeground(new java.awt.Color(4, 66, 114));
        Alcool.setText("Alcool : ");

        AlcoolPatient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        AlcoolPatient.setText("AlcoolPatient");

        labelChambre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelChambre.setForeground(new java.awt.Color(4, 66, 114));
        labelChambre.setText("Chambre :");

        labelLit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLit.setForeground(new java.awt.Color(4, 66, 114));
        labelLit.setText("Lit :");

        texteLit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        texteLit.setText("jLabel3");

        texteChambre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        texteChambre.setText("jLabel4");

        javax.swing.GroupLayout PanneauNordLayout = new javax.swing.GroupLayout(PanneauNord);
        PanneauNord.setLayout(PanneauNordLayout);
        PanneauNordLayout.setHorizontalGroup(
            PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauNordLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(labelChambre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texteChambre)
                        .addGap(66, 66, 66)
                        .addComponent(labelLit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texteLit))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(NeeLe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateNaissancePatient)
                        .addGap(64, 64, 64)
                        .addComponent(Sexe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexePatient)
                        .addGap(67, 67, 67)
                        .addComponent(Telephone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelephonePatient))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(NomPrenomPatient)
                        .addGap(41, 41, 41)
                        .addComponent(IPPPatient))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(Adresse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdressePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanneauNordLayout.createSequentialGroup()
                        .addComponent(Fumeur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FumeurPatient)
                        .addGap(109, 109, 109)
                        .addComponent(Alcool)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlcoolPatient)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PanneauNordLayout.setVerticalGroup(
            PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauNordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomPrenomPatient)
                    .addComponent(IPPPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NeeLe)
                    .addComponent(DateNaissancePatient)
                    .addComponent(Sexe)
                    .addComponent(SexePatient)
                    .addComponent(Telephone)
                    .addComponent(TelephonePatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Adresse)
                    .addComponent(AdressePatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fumeur)
                    .addComponent(FumeurPatient)
                    .addComponent(Alcool)
                    .addComponent(AlcoolPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelChambre)
                    .addComponent(labelLit)
                    .addComponent(texteLit)
                    .addComponent(texteChambre)))
        );

        add(PanneauNord, java.awt.BorderLayout.PAGE_START);

        PanneauSud.setBackground(new java.awt.Color(255, 255, 255));
        PanneauSud.setPreferredSize(new java.awt.Dimension(707, 50));
        PanneauSud.setLayout(new java.awt.BorderLayout());

        panelCloture.setBackground(new java.awt.Color(255, 255, 255));

        boutonCloture.setBackground(new java.awt.Color(255, 255, 255));
        boutonCloture.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        boutonCloture.setForeground(new java.awt.Color(4, 66, 144));
        boutonCloture.setText("Cloturer le séjour");
        boutonCloture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonClotureActionPerformed(evt);
            }
        });

        nomUtilisateur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nomUtilisateur.setText("nomUtilisateur \n");

        boutonHistorique.setBackground(new java.awt.Color(255, 255, 255));
        boutonHistorique.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        boutonHistorique.setForeground(new java.awt.Color(4, 66, 144));
        boutonHistorique.setText("Historique de consultation");
        boutonHistorique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonHistoriqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelClotureLayout = new javax.swing.GroupLayout(panelCloture);
        panelCloture.setLayout(panelClotureLayout);
        panelClotureLayout.setHorizontalGroup(
            panelClotureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClotureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomUtilisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addComponent(boutonHistorique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonCloture)
                .addContainerGap())
        );
        panelClotureLayout.setVerticalGroup(
            panelClotureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClotureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClotureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomUtilisateur)
                    .addComponent(boutonHistorique)
                    .addComponent(boutonCloture))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanneauSud.add(panelCloture, java.awt.BorderLayout.CENTER);

        add(PanneauSud, java.awt.BorderLayout.PAGE_END);

        PanneauCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanneauCentral.setPreferredSize(new Dimension(largeur-largeur1,hauteur1));
        PanneauCentral.setLayout(new java.awt.BorderLayout());

        listeActes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listeActes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listeActes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeActesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeActes);

        PanneauCentral.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelSejourEtBoutons.setBackground(new java.awt.Color(255, 255, 255));

        MenuDeroulantSejours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeroulantSejoursActionPerformed(evt);
            }
        });

        Ajout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Ajout.setText("Ajouter un(e) :");

        PanelBoutons.setBackground(new java.awt.Color(255, 255, 255));
        PanelBoutons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BoutonRadiologie.setBackground(new java.awt.Color(236, 242, 254));
        BoutonRadiologie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonRadiologie.setForeground(new java.awt.Color(4, 66, 114));
        BoutonRadiologie.setText("Imagerie");
        BoutonRadiologie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRadiologieActionPerformed(evt);
            }
        });
        PanelBoutons.add(BoutonRadiologie);

        BoutonAnesthesie.setBackground(new java.awt.Color(236, 242, 254));
        BoutonAnesthesie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonAnesthesie.setForeground(new java.awt.Color(4, 66, 114));
        BoutonAnesthesie.setText("Anesthésie");
        BoutonAnesthesie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAnesthesieActionPerformed(evt);
            }
        });
        PanelBoutons.add(BoutonAnesthesie);

        BoutonConsultation.setBackground(new java.awt.Color(236, 242, 254));
        BoutonConsultation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonConsultation.setForeground(new java.awt.Color(4, 66, 114));
        BoutonConsultation.setText("Consultation");
        BoutonConsultation.setToolTipText("");
        BoutonConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonConsultationActionPerformed(evt);
            }
        });
        PanelBoutons.add(BoutonConsultation);

        BoutonPrescription.setBackground(new java.awt.Color(236, 242, 254));
        BoutonPrescription.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonPrescription.setForeground(new java.awt.Color(4, 66, 114));
        BoutonPrescription.setText("Prescription");
        BoutonPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonPrescriptionActionPerformed(evt);
            }
        });
        PanelBoutons.add(BoutonPrescription);

        BoutonExamenBiologique.setBackground(new java.awt.Color(236, 242, 254));
        BoutonExamenBiologique.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonExamenBiologique.setForeground(new java.awt.Color(4, 66, 114));
        BoutonExamenBiologique.setText("Examen Biologique");
        BoutonExamenBiologique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonExamenBiologiqueActionPerformed(evt);
            }
        });
        PanelBoutons.add(BoutonExamenBiologique);

        javax.swing.GroupLayout panelSejourEtBoutonsLayout = new javax.swing.GroupLayout(panelSejourEtBoutons);
        panelSejourEtBoutons.setLayout(panelSejourEtBoutonsLayout);
        panelSejourEtBoutonsLayout.setHorizontalGroup(
            panelSejourEtBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSejourEtBoutonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSejourEtBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelBoutons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSejourEtBoutonsLayout.createSequentialGroup()
                        .addComponent(Ajout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(MenuDeroulantSejours, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSejourEtBoutonsLayout.setVerticalGroup(
            panelSejourEtBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSejourEtBoutonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuDeroulantSejours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ajout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBoutons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanneauCentral.add(panelSejourEtBoutons, java.awt.BorderLayout.NORTH);

        add(PanneauCentral, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonExamenBiologiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonExamenBiologiqueActionPerformed
        String idSejour = getSejourSelectionne();
        // On ouvre la fenêtre de demande d'examen biologique
        JFrame AjoutExamenBiologique = new AjoutExamenBiologique(dialogueBD, this.utilisateur, idSejour);
        // On affiche la fenêtre
        AjoutExamenBiologique.setVisible(true);
        // On ajoute un listener pour mettre à jour la liste des actes après l'ajout de la demande
        AjoutExamenBiologique.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                remplirActes();
            }
        });

    }//GEN-LAST:event_BoutonExamenBiologiqueActionPerformed

    private void boutonClotureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonClotureActionPerformed
        String idSejour = getSejourSelectionne();
        ClotureSejour clotureSejour =new ClotureSejour(dialogueBD, idSejour);
        clotureSejour.setVisible(true);
    }//GEN-LAST:event_boutonClotureActionPerformed

    private void MenuDeroulantSejoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeroulantSejoursActionPerformed
        remplirActes();
    }//GEN-LAST:event_MenuDeroulantSejoursActionPerformed

    private void BoutonConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonConsultationActionPerformed
        // On récupère l'identifiant du séjour sélectionné
        String idSejour = getSejourSelectionne();
        // On ouvre la fenêtre d'ajout de consultation
        JFrame AjoutConsultation = new AjoutConsultation(dialogueBD, this.utilisateur, idSejour);
        // On affiche la fenêtre
        AjoutConsultation.setVisible(true);
        // On ajoute un listener pour mettre à jour la liste des actes après l'ajout de la consultation
        AjoutConsultation.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                remplirActes(); // On met à jour la liste des actes après l'ajout de la consultation
            }
        });
    }//GEN-LAST:event_BoutonConsultationActionPerformed

    private void BoutonPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPrescriptionActionPerformed
        String idSejour = getSejourSelectionne();
        // On ouvre la fenêtre d'ajout de prescription
        JFrame AjoutPrescription = new AjouterPrescription(dialogueBD, this.utilisateur, idSejour);
        // On affiche la fenêtre
        AjoutPrescription.setVisible(true);
        // On ajoute un listener pour mettre à jour la liste des actes après l'ajout de la prescription
        AjoutPrescription.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                remplirActes(); // On met à jour la liste des actes après l'ajout de la prescription
            }
        });


    }//GEN-LAST:event_BoutonPrescriptionActionPerformed

    private void listeActesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeActesMouseClicked
        // Si l'utilisateur double-clique sur un acte, on ouvre une fenêtre pour le modifier
        if (evt.getClickCount() == 2) {
            // On récupère l'identifiant de l'acte sélectionné
            String acteSelectionne = listeActes.getSelectedValue().toString();
            String idActe = dicoActes.get(acteSelectionne);
            String typeActe = acteSelectionne.substring(0, acteSelectionne.indexOf(" "));
            switch (typeActe) {
                case "Consultation":
                    // On ouvre la fenêtre d'affichage/validation de la consultation
                    JFrame afficherConsultation = new ValiderConsultation(this.dialogueBD, this.utilisateur, idActe);
                    // On affiche la fenêtre
                    afficherConsultation.setVisible(true);
                    break;
                default:
                    // TODO
                    if("Radiographie IRM Scanner Echographie Scintigraphie Tomographie".contains(typeActe)){
                        JFrame afficherRadiologie = new ValiderRadiologie(this.utilisateur, idActe, dialogueBD);
                        afficherRadiologie.setVisible(true);
                    }
                    break;
                case "Anesthésie":
                    // On ouvre la fenêtre d'affichage/validation d'une anesthésie
                    JFrame afficherAnesthésie = new ValiderAnesthesie(this.dialogueBD, this.utilisateur, idActe);
                    // On affiche la fenêtre
                    afficherAnesthésie.setVisible(true);
                    break;
                case "Prescription":
                    // On ouvre la fenêtre d'affichage/validation de la prescription
                    JFrame afficherPrescription = new ValidationPrescription(dialogueBD, this.utilisateur, idActe);
                    // On affiche la fenêtre
                    afficherPrescription.setVisible(true);
                    break;
                case "Examen":
                    // TODO
                    break;
            }
        }
    }//GEN-LAST:event_listeActesMouseClicked

    private void BoutonAnesthesieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAnesthesieActionPerformed
        String idSejour = getSejourSelectionne();
        // On ouvre la fenêtre de demande de pré-consultation en anesthésie
        JFrame AjouterAnesthesie = new AjouterAnesthesie(dialogueBD, this.utilisateur, idSejour);
        // On affiche la fenêtre
        AjouterAnesthesie.setVisible(true);
        // On ajoute un listener pour mettre à jour la liste des actes après l'ajout de la prescription
        AjouterAnesthesie.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                remplirActes(); // On met à jour la liste des actes après l'ajout de la pré-consultation en anesthésie
            }
        });
    }//GEN-LAST:event_BoutonAnesthesieActionPerformed

    private void BoutonRadiologieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRadiologieActionPerformed
        String idSejour = getSejourSelectionne();
        // On ouvre la fenêtre de demande de d'examen radiologique
        JFrame AjouterRadiologie = new AjouterRadiologie(dialogueBD, this.utilisateur, idSejour);
        // On affiche la fenêtre
        AjouterRadiologie.setVisible(true);
        AjouterRadiologie.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                remplirActes(); // On met à jour la liste des actes après l'ajout de l'examen radiologique
            }
        });
    }//GEN-LAST:event_BoutonRadiologieActionPerformed

    private void boutonHistoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonHistoriqueActionPerformed
        // On ouvre la fenêtre de l'historique de consultation
        JFrame historique = new HistoriqueConsultationDossier(dialogueBD, IPPPatient.getText().substring(5), NomPrenomPatient.getText());
        // On affiche la fenêtre
        historique.setVisible(true);
    }//GEN-LAST:event_boutonHistoriqueActionPerformed

    /**
     * Retourne l'identifiant du séjour sélectionné
     * @return idSejour l'identifiant du séjour sélectionné
     */
    public String getSejourSelectionne() {
        String infoSejour;
        String texteSejour = MenuDeroulantSejours.getSelectedItem().toString();
        // On récupère l'identifiant du séjour sélectionné
        if (texteSejour.contains("Consultation")) {
            infoSejour = texteSejour.substring(9);
        } else {
            infoSejour = texteSejour.substring(9);
        }
        int finIdSejour = infoSejour.indexOf(" ");
        return infoSejour.substring(0, finIdSejour); // l'identifiant du séjour
    }

    /**
     * Remplit les champs de l'interface avec les informations du patient
     *
     * @param idPatient l'identifiant du patient à afficher
     */
    public void remplirChampsPatient(String idPatient) {
        // On récupère les informations du patient
        try {
            // On effectue une recherche dans la table Patient avec l'IPP du patient sélectionné
            ResultSet resultat = dialogueBD.rechercheTable(
                    "Patient",
                    new HashMap<String, String>() {{
                        put("idPatient", idPatient);
                    }},
                    false);
            // On se positionne sur le premier (et unique) résultat
            resultat.next();
            // On remplit les champs
            NomPrenomPatient.setText(resultat.getString("nom").trim() + " " + resultat.getString("prenom").trim());
            DateNaissancePatient.setText(resultat.getString("dateNaissance").substring(0, 10));
            SexePatient.setText(resultat.getString("sexe"));
            IPPPatient.setText("IPP : " + resultat.getString("idPatient"));
            AdressePatient.setText(resultat.getString("adresse").trim()); // On enlève les espaces inutiles
            TelephonePatient.setText(resultat.getString("telephone"));
            FumeurPatient.setText(Objects.equals(resultat.getString("fumeur"), "Y") ? "Oui" : "Non");
            AlcoolPatient.setText(Objects.equals(resultat.getString("alcool"), "Y") ? "Oui" : "Non");
            // On récupère les informations de la chambre

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Remplit le menu déroulant des séjours du patient
     *
     * @param idPatient l'identifiant du patient sélectionné
     */
    public void remplirSejours(String idPatient) {
        // On récupère les séjours du patient

        // On effectue une recherche dans la table Séjour avec l'IPP du patient sélectionné
        try (ResultSet resultat = dialogueBD.rechercheTable(
                "Sejour",
                new HashMap<String, String>() {{
                    put("idPatient", (String) idPatient);
                }},
                false)) {
            ArrayList<String> listeNumeroSejour = new ArrayList<>();
            // On ajoute chaque séjour du patient dans le menu déroulant
            while (resultat.next()) {
                // On construit le texte à afficher dans le menu déroulant
                // Si le séjour est une consultation, on affiche "Consultation n°" suivi de l'identifiant du séjour
                // Sinon, on affiche "Séjour n°" suivi de l'identifiant du séjour
                StringBuilder infoSejour = new StringBuilder(Objects.equals(resultat.getString("Consultation"), "Y") ? "Consultation n°" : "Séjour n°");
                infoSejour.append(resultat.getString("idSejour"));
                infoSejour.append(" en ").append(dialogueBD.getNomService(resultat.getString("idService")));
                System.out.println(dialogueBD.getNomService(resultat.getString("idService")));
                infoSejour.append(" du ").append(resultat.getString("dateDebut"), 0, 10);
                if (resultat.getString("dateFin") != null) {
                    infoSejour.append(" au ").append(resultat.getString("dateFin"), 0, 10);
                }
                // Si le séjour est ouvert, on le met en premier et on récupère les informations de la chambre
                if (Objects.equals(resultat.getString("ouvert"), "Y")) {
                    MenuDeroulantSejours.insertItemAt(infoSejour, 0);
                    listeNumeroSejour.add(0, resultat.getString("idSejour"));
                } else { // Sinon, on l'ajoute à la fin
                    MenuDeroulantSejours.addItem(infoSejour);
                    listeNumeroSejour.add(resultat.getString("idSejour"));
                }
                // On sélectionne le premier séjour par défaut
                MenuDeroulantSejours.setSelectedIndex(0);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void remplirChambre(String idSejour) {
        // On récupère l'idLocG du séjour
        String requeteSejour = "SELECT idLocG FROM Sejour WHERE idSejour = " + idSejour;
        String idLocG ;
        try (ResultSet resultatSejour = dialogueBD.requete(requeteSejour)) {
            resultatSejour.next();
            idLocG = resultatSejour.getString("idLocG");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // On récupère les informations de la chambre
        try (ResultSet resultatChambre = dialogueBD.rechercheTable(
                "LocalisationG",
                new HashMap<String, String>() {{
                    put("idLocG", idLocG);
                }},
                false)) {
            resultatChambre.next();
            texteChambre.setText(resultatChambre.getString("idPiece"));
            texteLit.setText(resultatChambre.getString("Lit"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Remplit la liste des actes du séjour sélectionné
     */
    public void remplirActes() {
        dicoActes.clear();
        // On récupère les actes du séjour sélectionné
        // On effectue une recherche dans la table Acte avec l'identifiant du séjour sélectionné
        String sejourSelectionne = MenuDeroulantSejours.getSelectedItem().toString();
        // On extrait l'identifiant du séjour
        assert sejourSelectionne != null;
        if (sejourSelectionne.contains("Consultation")) {
            // On récupère l'identifiant de la consultation
            sejourSelectionne = sejourSelectionne.substring(15);
        } else {
            // On récupère l'identifiant du séjour
            sejourSelectionne = sejourSelectionne.substring(9);
        }
        // On enlève les caractères après l'identifiant
        String idSejour = sejourSelectionne.substring(0, sejourSelectionne.indexOf(" "));
        remplirChambre(idSejour);
        // On Active/Désactive le bouton de cloture et les boutons d'ajout d'actes
        try (ResultSet resultat = dialogueBD.rechercheTable(
                "Sejour",
                new HashMap<String, String>() {{
                    put("idSejour", idSejour);
                }},
                false)) {
            resultat.next();
            if (resultat.getString("ouvert").equals("Y")) {
                boutonCloture.setEnabled(true);
                BoutonAnesthesie.setEnabled(true);
                BoutonConsultation.setEnabled(true);
                BoutonExamenBiologique.setEnabled(true);
                BoutonPrescription.setEnabled(true);
                BoutonRadiologie.setEnabled(true);
            } else {
                boutonCloture.setEnabled(false);
                BoutonAnesthesie.setEnabled(false);
                BoutonConsultation.setEnabled(false);
                BoutonExamenBiologique.setEnabled(false);
                BoutonPrescription.setEnabled(false);
                BoutonRadiologie.setEnabled(false);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> actes = new ArrayList<>();
        try (ResultSet resultat = dialogueBD.rechercheTable(
                "Acte",
                new HashMap<String, String>() {{
                    put("idSejour", idSejour);
                }},
                false)) {
            // On ajoute chaque acte du séjour dans la liste
            while (resultat.next()) {
                // On construit le texte à afficher dans la liste
                // On affiche le nom de l'acte suivi de la date de réalisation
                String typeActe = resultat.getString("nom").trim();
                StringBuilder infoActe = new StringBuilder(typeActe);
                // Si la date de réalisation est renseignée, on l'ajoute
                // On adapte le texte en fonction du type d'acte
                switch (typeActe) {
                    case "Consultation":
                        infoActe.append(" en ").append(dialogueBD.getNomService(resultat.getString("idService")));
                        if (resultat.getString("dateRealisationActe") == null) {
                            infoActe.append(" prévue le ").append(resultat.getString("datePrescription"), 0, 10);
                        }
                        break;
                    default: // Radiologie Echo, Radiologie Scanner, IRM, ...
                        if("Radiologie Echographie Scanner IRM Scintigraphie Tomographie".contains(typeActe)) {
                            infoActe.append(" : ").append(resultat.getString("commentaire")==null?"":resultat.getString("commentaire"));
                            if(resultat.getString("valide").equals("Y")){
                                infoActe.append(" - réalisé le : ");
                            }else {
                                infoActe.append(" - prévu le : ");
                            }
                            infoActe.append(resultat.getString("dateRealisationActe"), 0, 10);
                        }
                        break;
                    case "Anesthésie":
                        infoActe.append(" : ").append(resultat.getString("commentaire")).append(" // Opération prévue le : ").append(resultat.getString("datePrescription"), 0, 10);
                        break;
                    case "Prescription":
                        infoActe.append(" : ").append(resultat.getString("posologie"));
                        if (resultat.getString("dateRealisationActe") != null) {
                            infoActe.append(" administré le ").append(resultat.getString("dateRealisationActe"), 0, 10);
                        }
                        break;
                    case "Examen Biologique":
                        infoActe.append(" : ").append(resultat.getString("commentaire")).append(" - demandé le : ").append(resultat.getString("datePrescription"), 0, 10);
                        break;
                }
                actes.add(infoActe.toString());
                dicoActes.put(infoActe.toString(), resultat.getString("idActe"));
            }
            listeActes.setListData(actes.toArray(new String[0]));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adresse;
    private javax.swing.JLabel AdressePatient;
    private javax.swing.JLabel Ajout;
    private javax.swing.JLabel Alcool;
    private javax.swing.JLabel AlcoolPatient;
    private javax.swing.JButton BoutonAnesthesie;
    private javax.swing.JButton BoutonConsultation;
    private javax.swing.JButton BoutonExamenBiologique;
    private javax.swing.JButton BoutonPrescription;
    private javax.swing.JButton BoutonRadiologie;
    private javax.swing.JLabel DateNaissancePatient;
    private javax.swing.JLabel Fumeur;
    private javax.swing.JLabel FumeurPatient;
    private javax.swing.JLabel IPPPatient;
    private javax.swing.JComboBox MenuDeroulantSejours;
    private javax.swing.JLabel NeeLe;
    private javax.swing.JLabel NomPrenomPatient;
    private javax.swing.JPanel PanelBoutons;
    private javax.swing.JPanel PanneauCentral;
    private javax.swing.JPanel PanneauNord;
    private javax.swing.JPanel PanneauSud;
    private javax.swing.JLabel Sexe;
    private javax.swing.JLabel SexePatient;
    private javax.swing.JLabel Telephone;
    private javax.swing.JLabel TelephonePatient;
    private javax.swing.JButton boutonCloture;
    private javax.swing.JButton boutonHistorique;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelChambre;
    private javax.swing.JLabel labelLit;
    private javax.swing.JList listeActes;
    private javax.swing.JLabel nomUtilisateur;
    private javax.swing.JPanel panelCloture;
    private javax.swing.JPanel panelSejourEtBoutons;
    private javax.swing.JLabel texteChambre;
    private javax.swing.JLabel texteLit;
    // End of variables declaration//GEN-END:variables
}
