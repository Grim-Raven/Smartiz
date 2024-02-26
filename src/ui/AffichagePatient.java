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
    
    public AffichagePatient() {

        //On récupère la taille de l'écran
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        //On stocke la largeur de l'écran dans la variable largeur
        largeur = tailleMoniteur.width;
        //On stocke la hauteur de l'écran dans la variable hauteur 
        hauteur = tailleMoniteur.height;
        //L'attribut largeur1 correspond à 1/5 de la largeur de l'écran
        largeur1 = largeur/5;
        //L'attribut largeurCentré correspond à 1/4 de (largeur-largeur1)
        largeurCentree = (largeur-largeur1)/4;
        //L'attribut hauteur1 correspond à 4/5 de la hauteur de l'écran
        hauteur1 = hauteur - hauteur2;
        //L'attribut hauteur 2 correspond à 1/5 de la hauteur de l'écran
        hauteur2 = hauteur/5;
        //L'attribut largeurBouton correspond à 1/8 de la largeur de largeurCentree
        largeurBouton = largeurCentree/8;
        hauteurInfo = 1 ;

        initComponents();
        this.nomUtilisateur.setText("Nom utilisateur");
    }

    public AffichagePatient(String idPatient, String nomUtilisateur) {

        //On récupère la taille de l'écran
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        //On stocke la largeur de l'écran dans la variable largeur
        largeur = tailleMoniteur.width;
        //On stocke la hauteur de l'écran dans la variable hauteur
        hauteur = tailleMoniteur.height;
        //L'attribut largeur1 correspond à 1/5 de la largeur de l'écran
        largeur1 = largeur/5;
        //L'attribut largeurCentré correspond à 1/4 de (largeur-largeur1)
        largeurCentree = (largeur-largeur1)/4;
        //L'attribut hauteur1 correspond à 4/5 de la hauteur de l'écran
        hauteur1 = hauteur - hauteur2;
        //L'attribut hauteur 2 correspond à 1/5 de la hauteur de l'écran
        hauteur2 = hauteur/5;
        //L'attribut largeurBouton correspond à 1/8 de la largeur de largeurCentree
        largeurBouton = largeurCentree/8;
        hauteurInfo = 1 ;

        initComponents();
        this.nomUtilisateur.setText(nomUtilisateur);
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
        PanneauSud = new javax.swing.JPanel();
        nomUtilisateur = new javax.swing.JLabel();
        PanneauCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
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

        javax.swing.GroupLayout PanneauNordLayout = new javax.swing.GroupLayout(PanneauNord);
        PanneauNord.setLayout(PanneauNordLayout);
        PanneauNordLayout.setHorizontalGroup(
            PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauNordLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanneauNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(29, Short.MAX_VALUE))
        );

        add(PanneauNord, java.awt.BorderLayout.PAGE_START);

        PanneauSud.setBackground(new java.awt.Color(255, 255, 255));
        PanneauSud.setPreferredSize(new java.awt.Dimension(707, 50));

        nomUtilisateur.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nomUtilisateur.setText("nomUtilisateur \n");

        javax.swing.GroupLayout PanneauSudLayout = new javax.swing.GroupLayout(PanneauSud);
        PanneauSud.setLayout(PanneauSudLayout);
        PanneauSudLayout.setHorizontalGroup(
            PanneauSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauSudLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nomUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        PanneauSudLayout.setVerticalGroup(
            PanneauSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauSudLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(nomUtilisateur)
                .addContainerGap())
        );

        add(PanneauSud, java.awt.BorderLayout.PAGE_END);

        PanneauCentral.setBackground(new java.awt.Color(255, 255, 255));
        PanneauCentral.setPreferredSize(new Dimension(largeur-largeur1,hauteur1));
        PanneauCentral.setLayout(new java.awt.BorderLayout());

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        PanneauCentral.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelSejourEtBoutons.setBackground(new java.awt.Color(255, 255, 255));

        MenuDeroulantSejours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Séjour1", "Séjour2", "Séjour3", "Séjour4" }));

        Ajout.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Ajout.setText("Ajouter un(e) :");

        PanelBoutons.setBackground(new java.awt.Color(255, 255, 255));
        PanelBoutons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        BoutonRadiologie.setBackground(new java.awt.Color(236, 242, 254));
        BoutonRadiologie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonRadiologie.setForeground(new java.awt.Color(4, 66, 114));
        BoutonRadiologie.setText("Radiologie");
        PanelBoutons.add(BoutonRadiologie);

        BoutonAnesthesie.setBackground(new java.awt.Color(236, 242, 254));
        BoutonAnesthesie.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonAnesthesie.setForeground(new java.awt.Color(4, 66, 114));
        BoutonAnesthesie.setText("Anesthésie");
        PanelBoutons.add(BoutonAnesthesie);

        BoutonConsultation.setBackground(new java.awt.Color(236, 242, 254));
        BoutonConsultation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonConsultation.setForeground(new java.awt.Color(4, 66, 114));
        BoutonConsultation.setText("Consultation");
        BoutonConsultation.setToolTipText("");
        PanelBoutons.add(BoutonConsultation);

        BoutonPrescription.setBackground(new java.awt.Color(236, 242, 254));
        BoutonPrescription.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BoutonPrescription.setForeground(new java.awt.Color(4, 66, 114));
        BoutonPrescription.setText("Prescription");
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
                .addGap(24, 24, 24)
                .addComponent(MenuDeroulantSejours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ajout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBoutons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanneauCentral.add(panelSejourEtBoutons, java.awt.BorderLayout.NORTH);

        add(PanneauCentral, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonExamenBiologiqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonExamenBiologiqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonExamenBiologiqueActionPerformed

    public void setBoutonsVisibles(boolean visibles) {
        BoutonAnesthesie.setVisible(visibles);
        BoutonConsultation.setVisible(visibles);
        BoutonExamenBiologique.setVisible(visibles);
        BoutonPrescription.setVisible(visibles);
        BoutonRadiologie.setVisible(visibles);
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
    private javax.swing.JList jList1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomUtilisateur;
    private javax.swing.JPanel panelSejourEtBoutons;
    // End of variables declaration//GEN-END:variables
}
