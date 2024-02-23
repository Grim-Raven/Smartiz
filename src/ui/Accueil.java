/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import fc.DialogueBD;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author emmaa
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
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
    
    //Code couleur : bleu foncé -> 044272
    //Code couleur : bleu clair -> ecf2fe

    private DialogueBD dialogueBD;
    public Accueil() {
        initComponents();
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
        
        initComponents();
        
        //Le panneau Ouest prend pour dimension longueur1 et hauteur 
        PanneauOuest.setPreferredSize(new Dimension(largeur1, hauteur1));
        //Le panneau Nord prend pour dimension longueur2 et hauteur2
        PanneauNord.setPreferredSize(new Dimension(largeur, hauteur2));

        this.dialogueBD = new DialogueBD();
        this.dialogueBD.connect();
    }

    public Accueil(DialogueBD dialogueBD, String idUtilisateur, String langue) {
        initComponents();
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

        initComponents();

        //Le panneau Ouest prend pour dimension longueur1 et hauteur
        PanneauOuest.setPreferredSize(new Dimension(largeur1, hauteur1));
        //Le panneau Nord prend pour dimension longueur2 et hauteur2
        PanneauNord.setPreferredSize(new Dimension(largeur, hauteur2));

        this.dialogueBD = dialogueBD;
        //On affiche le nom de l'utilisateur
        nomUtilisateur.setText(dialogueBD.getNomUtilisateur(idUtilisateur));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauOuest = new javax.swing.JPanel();
        PanneauDeconnexion = new javax.swing.JPanel();
        BoutonMedecins = new javax.swing.JButton();
        Deconnexion = new javax.swing.JButton();
        BoutonServices = new javax.swing.JButton();
        BoutonPatients = new javax.swing.JButton();
        BoutonRechercheClinique = new javax.swing.JButton();
        PanneauNord = new javax.swing.JPanel();
        PanneauLogo = new java.awt.Panel();
        labelLogo = new javax.swing.JLabel();
        PanneauRecherche = new java.awt.Panel();
        RechercherUnPatient = new javax.swing.JLabel();
        TexteIPP = new javax.swing.JTextField();
        BoutonRechercher = new javax.swing.JButton();
        IPP = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        texteNom = new javax.swing.JTextField();
        Prenom = new javax.swing.JLabel();
        textePrenom = new javax.swing.JTextField();
        DateDeNaissance = new javax.swing.JLabel();
        TexteDateDeNaissance = new javax.swing.JTextField();
        PanneauPrincipale = new javax.swing.JPanel();
        PanneauPrincipaleNord = new javax.swing.JPanel();
        PanneauPrincipalOuest = new javax.swing.JPanel();
        PanneauPrincipaleEst = new javax.swing.JPanel();
        PanneauPrincipaleSud = new javax.swing.JPanel();
        PanneauPrincipaleCentral = new javax.swing.JPanel();
        Bienvenue = new javax.swing.JLabel();
        nomUtilisateur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(largeur,hauteur));

        PanneauOuest.setBackground(new java.awt.Color(236, 242, 254));
        PanneauOuest.setPreferredSize(new Dimension(largeur1,hauteur));

        PanneauDeconnexion.setLayout(new java.awt.BorderLayout());

        BoutonMedecins.setBackground(new java.awt.Color(4, 66, 114));
        BoutonMedecins.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BoutonMedecins.setForeground(new java.awt.Color(255, 255, 255));
        BoutonMedecins.setText("Médecins");
        BoutonMedecins.setPreferredSize(new Dimension(largeur1,75));

        Deconnexion.setBackground(new java.awt.Color(4, 66, 114));
        Deconnexion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        Deconnexion.setText("Déconnexion");
        Deconnexion.setPreferredSize(new Dimension(largeur1,75));

        BoutonServices.setBackground(new java.awt.Color(4, 66, 114));
        BoutonServices.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BoutonServices.setForeground(new java.awt.Color(255, 255, 255));
        BoutonServices.setText("Services");
        BoutonServices.setPreferredSize(new Dimension(largeur1,75));

        BoutonPatients.setBackground(new java.awt.Color(4, 66, 114));
        BoutonPatients.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BoutonPatients.setForeground(new java.awt.Color(255, 255, 255));
        BoutonPatients.setText("Patients");
        BoutonPatients.setToolTipText("");
        BoutonPatients.setPreferredSize(new Dimension(largeur1,75));
        BoutonPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonPatientsActionPerformed(evt);
            }
        });

        BoutonRechercheClinique.setBackground(new java.awt.Color(4, 66, 114));
        BoutonRechercheClinique.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BoutonRechercheClinique.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRechercheClinique.setText("Recherche Clinique");
        BoutonRechercheClinique.setPreferredSize(new Dimension(largeur1,75));

        javax.swing.GroupLayout PanneauOuestLayout = new javax.swing.GroupLayout(PanneauOuest);
        PanneauOuest.setLayout(PanneauOuestLayout);
        PanneauOuestLayout.setHorizontalGroup(
            PanneauOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanneauDeconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanneauOuestLayout.createSequentialGroup()
                .addGroup(PanneauOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonMedecins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(BoutonServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanneauOuestLayout.createSequentialGroup()
                .addGroup(PanneauOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BoutonPatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauOuestLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BoutonRechercheClinique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanneauOuestLayout.setVerticalGroup(
            PanneauOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauOuestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoutonServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonMedecins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BoutonRechercheClinique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(PanneauDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(PanneauOuest, java.awt.BorderLayout.LINE_START);

        PanneauNord.setBackground(new java.awt.Color(236, 242, 254));
        PanneauNord.setPreferredSize(new Dimension(largeur,hauteur2));
        PanneauNord.setLayout(new java.awt.BorderLayout());

        PanneauLogo.setPreferredSize(new Dimension(largeur1,hauteur2));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Image/Logo_Smartiz.png"))); // NOI18N

        javax.swing.GroupLayout PanneauLogoLayout = new javax.swing.GroupLayout(PanneauLogo);
        PanneauLogo.setLayout(PanneauLogoLayout);
        PanneauLogoLayout.setHorizontalGroup(
            PanneauLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauLogoLayout.createSequentialGroup()
                .addComponent(labelLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanneauLogoLayout.setVerticalGroup(
            PanneauLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauLogoLayout.createSequentialGroup()
                .addComponent(labelLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelLogo.getAccessibleContext().setAccessibleName("");

        PanneauNord.add(PanneauLogo, java.awt.BorderLayout.WEST);

        PanneauRecherche.setBackground(new java.awt.Color(236, 242, 254));
        PanneauRecherche.setPreferredSize(new Dimension(largeur-largeur1,hauteur2));

        RechercherUnPatient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RechercherUnPatient.setText(" Rechercher un patient :");
        RechercherUnPatient.setPreferredSize(new Dimension(400,75));

        BoutonRechercher.setBackground(new java.awt.Color(4, 66, 114));
        BoutonRechercher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonRechercher.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRechercher.setText("Rechercher");
        BoutonRechercher.setPreferredSize(new java.awt.Dimension(97, 40));

        IPP.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IPP.setText("IPP");

        Nom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Nom.setText("Nom ");

        texteNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteNomActionPerformed(evt);
            }
        });

        Prenom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Prenom.setText("Prénom");

        DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DateDeNaissance.setText("Date de Naissance");

        javax.swing.GroupLayout PanneauRechercheLayout = new javax.swing.GroupLayout(PanneauRecherche);
        PanneauRecherche.setLayout(PanneauRechercheLayout);
        PanneauRechercheLayout.setHorizontalGroup(
            PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauRechercheLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanneauRechercheLayout.createSequentialGroup()
                        .addComponent(DateDeNaissance)
                        .addGap(18, 18, 18)
                        .addComponent(TexteDateDeNaissance))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanneauRechercheLayout.createSequentialGroup()
                        .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanneauRechercheLayout.createSequentialGroup()
                                .addComponent(Nom)
                                .addGap(18, 18, 18)
                                .addComponent(texteNom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Prenom))
                            .addGroup(PanneauRechercheLayout.createSequentialGroup()
                                .addComponent(RechercherUnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(IPP)))
                        .addGap(18, 18, 18)
                        .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TexteIPP, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(textePrenom))))
                .addGap(18, 18, 18)
                .addComponent(BoutonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        PanneauRechercheLayout.setVerticalGroup(
            PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauRechercheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RechercherUnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexteIPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textePrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prenom))
                        .addComponent(Nom, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(texteNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanneauRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateDeNaissance)
                    .addComponent(TexteDateDeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanneauNord.add(PanneauRecherche, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanneauNord, java.awt.BorderLayout.PAGE_START);

        PanneauPrincipale.setBackground(new java.awt.Color(255, 255, 255));
        PanneauPrincipale.setPreferredSize(new Dimension(largeur-largeur1,hauteur1));
        PanneauPrincipale.setRequestFocusEnabled(false);
        PanneauPrincipale.setLayout(new java.awt.BorderLayout());

        PanneauPrincipaleNord.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauPrincipaleNordLayout = new javax.swing.GroupLayout(PanneauPrincipaleNord);
        PanneauPrincipaleNord.setLayout(PanneauPrincipaleNordLayout);
        PanneauPrincipaleNordLayout.setHorizontalGroup(
            PanneauPrincipaleNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        PanneauPrincipaleNordLayout.setVerticalGroup(
            PanneauPrincipaleNordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanneauPrincipale.add(PanneauPrincipaleNord, java.awt.BorderLayout.PAGE_START);

        PanneauPrincipalOuest.setBackground(new java.awt.Color(255, 255, 255));
        PanneauPrincipalOuest.setPreferredSize(new Dimension(largeurCentree,197));

        javax.swing.GroupLayout PanneauPrincipalOuestLayout = new javax.swing.GroupLayout(PanneauPrincipalOuest);
        PanneauPrincipalOuest.setLayout(PanneauPrincipalOuestLayout);
        PanneauPrincipalOuestLayout.setHorizontalGroup(
            PanneauPrincipalOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauPrincipalOuestLayout.setVerticalGroup(
            PanneauPrincipalOuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        PanneauPrincipale.add(PanneauPrincipalOuest, java.awt.BorderLayout.LINE_START);

        PanneauPrincipaleEst.setBackground(new java.awt.Color(255, 255, 255));
        PanneauPrincipaleEst.setPreferredSize(new Dimension(largeurCentree,197));

        javax.swing.GroupLayout PanneauPrincipaleEstLayout = new javax.swing.GroupLayout(PanneauPrincipaleEst);
        PanneauPrincipaleEst.setLayout(PanneauPrincipaleEstLayout);
        PanneauPrincipaleEstLayout.setHorizontalGroup(
            PanneauPrincipaleEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PanneauPrincipaleEstLayout.setVerticalGroup(
            PanneauPrincipaleEstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        PanneauPrincipale.add(PanneauPrincipaleEst, java.awt.BorderLayout.LINE_END);

        PanneauPrincipaleSud.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanneauPrincipaleSudLayout = new javax.swing.GroupLayout(PanneauPrincipaleSud);
        PanneauPrincipaleSud.setLayout(PanneauPrincipaleSudLayout);
        PanneauPrincipaleSudLayout.setHorizontalGroup(
            PanneauPrincipaleSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        PanneauPrincipaleSudLayout.setVerticalGroup(
            PanneauPrincipaleSudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        PanneauPrincipale.add(PanneauPrincipaleSud, java.awt.BorderLayout.PAGE_END);

        PanneauPrincipaleCentral.setBackground(new java.awt.Color(255, 255, 255));

        Bienvenue.setFont(new java.awt.Font("Segoe Script", 0, 80)); // NOI18N
        Bienvenue.setForeground(new java.awt.Color(4, 66, 114));
        Bienvenue.setText("Bienvenue");

        nomUtilisateur.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        nomUtilisateur.setText("nomUtilisateur ");

        javax.swing.GroupLayout PanneauPrincipaleCentralLayout = new javax.swing.GroupLayout(PanneauPrincipaleCentral);
        PanneauPrincipaleCentral.setLayout(PanneauPrincipaleCentralLayout);
        PanneauPrincipaleCentralLayout.setHorizontalGroup(
            PanneauPrincipaleCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauPrincipaleCentralLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(PanneauPrincipaleCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauPrincipaleCentralLayout.createSequentialGroup()
                        .addComponent(Bienvenue)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanneauPrincipaleCentralLayout.createSequentialGroup()
                        .addComponent(nomUtilisateur)
                        .addGap(176, 176, 176))))
        );
        PanneauPrincipaleCentralLayout.setVerticalGroup(
            PanneauPrincipaleCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanneauPrincipaleCentralLayout.createSequentialGroup()
                .addComponent(Bienvenue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomUtilisateur)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        PanneauPrincipale.add(PanneauPrincipaleCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanneauPrincipale, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPatientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonPatientsActionPerformed

    private void texteNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteNomActionPerformed

    private void BoutonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechercherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonRechercherActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenue;
    private javax.swing.JButton BoutonMedecins;
    private javax.swing.JButton BoutonPatients;
    private javax.swing.JButton BoutonRechercheClinique;
    private javax.swing.JButton BoutonRechercher;
    private javax.swing.JButton BoutonServices;
    private javax.swing.JLabel DateDeNaissance;
    private javax.swing.JButton Deconnexion;
    private javax.swing.JLabel IPP;
    private javax.swing.JLabel Nom;
    private javax.swing.JPanel PanneauDeconnexion;
    private java.awt.Panel PanneauLogo;
    private javax.swing.JPanel PanneauNord;
    private javax.swing.JPanel PanneauOuest;
    private javax.swing.JPanel PanneauPrincipalOuest;
    private javax.swing.JPanel PanneauPrincipale;
    private javax.swing.JPanel PanneauPrincipaleCentral;
    private javax.swing.JPanel PanneauPrincipaleEst;
    private javax.swing.JPanel PanneauPrincipaleNord;
    private javax.swing.JPanel PanneauPrincipaleSud;
    private java.awt.Panel PanneauRecherche;
    private javax.swing.JLabel Prenom;
    private javax.swing.JLabel RechercherUnPatient;
    private javax.swing.JTextField TexteDateDeNaissance;
    private javax.swing.JTextField TexteIPP;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel nomUtilisateur;
    private javax.swing.JTextField texteNom;
    private javax.swing.JTextField textePrenom;
    // End of variables declaration//GEN-END:variables
}
