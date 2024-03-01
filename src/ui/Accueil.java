/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import fc.DialogueBD;
import fc.Utilisateur;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Objects;

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
    //L'attribut largeurCentrée correspond à 1/4 de largeur - largeur1
    protected int largeurCentree;
    
    //Code couleur : bleu foncé -> 044272
    //Code couleur : bleu clair -> ecf2fe

    private final DialogueBD dialogueBD;
    private Utilisateur utilisateur;
    private JTable tablePatients;
    private JScrollPane scrollPaneTable;
    public Accueil() {
        //On récupère la taille de l'écran
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        //On stocke la largeur de l'écran dans la variable largeur
        largeur = tailleMoniteur.width;
        //On stocke la hauteur de l'écran dans la variable hauteur 
        hauteur = tailleMoniteur.height;
        //L'attribut largeur1 correspond à 1/5 de la largeur de l'écran
        largeur1 = largeur/5;
        //L'attribut largeurCentrée correspond à 1/4 de (largeur-largeur1)
        largeurCentree = (largeur-largeur1)/4;
        //L'attribut hauteur1 correspond à 4/5 de la hauteur de l'écran
        hauteur1 = hauteur - hauteur2;
        //L'attribut hauteur 2 correspond à 1/5 de la hauteur de l'écran
        hauteur2 = hauteur/5;
        initComponents();

        // On met le logo de l'application
        labelLogo.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/ui/Image/Logo_Smartiz.png"))));
        //Le panneau Ouest prend pour dimension longueur1 et hauteur 
        PanneauOuest.setPreferredSize(new Dimension(largeur1, hauteur1));
        //Le panneau Nord prend pour dimension longueur2 et hauteur2
        PanneauNord.setPreferredSize(new Dimension(largeur, hauteur2));

        this.utilisateur = new Utilisateur("Cot","Harry",true, "Français",1);
        this.dialogueBD = new DialogueBD();
        this.dialogueBD.connect();
        this.setTitle("Bienvenue "+ utilisateur.getPrenom() + " " + utilisateur.getNom());
        // On met la Jframe en plein écran
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // On crée une JTable pour afficher les patients qui seront récupérés par la recherche
        this.tablePatients = new JTable();
        tablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePatientsMouseClicked(evt);
            }
        });
    }

    public Accueil(DialogueBD dialogueBD, Utilisateur utilisateur) {
        //On récupère la taille de l'écran
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        //On stocke la largeur de l'écran dans la variable largeur
        largeur = tailleMoniteur.width;
        //On stocke la hauteur de l'écran dans la variable hauteur
        hauteur = tailleMoniteur.height;
        //L'attribut largeur1 correspond à 1/5 de la largeur de l'écran
        largeur1 = largeur/5;
        //L'attribut largeurCentrÃ© correspond à 1/4 de (largeur-largeur1)
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
        // On affiche le nom de l'utilisateur en Titre de la JFrame
        this.utilisateur = utilisateur;
        this.setTitle("Bienvenue "+ utilisateur.getPrenom() + " " + utilisateur.getNom());
        // On met la Jframe en plein écran
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // On met le logo de l'application
        labelLogo.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/ui/Image/Logo_Smartiz.png")))); // NOI18N
        this.tablePatients = new JTable();
        tablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePatientsMouseClicked(evt);
            }
        });
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
        texteIPP = new javax.swing.JTextField();
        BoutonRechercher = new javax.swing.JButton();
        IPP = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        texteNom = new javax.swing.JTextField();
        Prenom = new javax.swing.JLabel();
        textePrenom = new javax.swing.JTextField();
        DateDeNaissance = new javax.swing.JLabel();
        texteDateNaissance = new javax.swing.JTextField();
        PanneauPrincipale = new javax.swing.JPanel();
        PanneauPrincipaleNord = new javax.swing.JPanel();
        PanneauPrincipalOuest = new javax.swing.JPanel();
        PanneauPrincipaleEst = new javax.swing.JPanel();
        PanneauPrincipaleSud = new javax.swing.JPanel();
        PanneauPrincipaleCentral = new javax.swing.JPanel();
        Bienvenue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                    .addComponent(BoutonMedecins, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        PanneauNord.add(PanneauLogo, java.awt.BorderLayout.WEST);

        PanneauRecherche.setBackground(new java.awt.Color(236, 242, 254));
        PanneauRecherche.setPreferredSize(new Dimension(largeur-largeur1,hauteur2));

        RechercherUnPatient.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RechercherUnPatient.setText(" Rechercher un patient :");
        RechercherUnPatient.setPreferredSize(new Dimension(400,75));

        texteIPP.setName("idPatient"); // NOI18N

        BoutonRechercher.setBackground(new java.awt.Color(4, 66, 114));
        BoutonRechercher.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BoutonRechercher.setForeground(new java.awt.Color(255, 255, 255));
        BoutonRechercher.setText("Rechercher");
        BoutonRechercher.setPreferredSize(new java.awt.Dimension(97, 40));
        BoutonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonRechercherActionPerformed(evt);
            }
        });

        IPP.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        IPP.setText("IPP");

        Nom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Nom.setText("Nom ");

        texteNom.setName("nom"); // NOI18N
        texteNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texteNomActionPerformed(evt);
            }
        });

        Prenom.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Prenom.setText("Prénom");

        textePrenom.setName("prenom"); // NOI18N

        DateDeNaissance.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        DateDeNaissance.setText("Date de Naissance");

        texteDateNaissance.setName("dateNaissance"); // NOI18N

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
                        .addComponent(texteDateNaissance))
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
                            .addComponent(texteIPP, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
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
                    .addComponent(texteIPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(texteDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        PanneauPrincipaleCentral.setLayout(new java.awt.BorderLayout());

        Bienvenue.setFont(new java.awt.Font("Segoe Script", 0, 80)); // NOI18N
        Bienvenue.setForeground(new java.awt.Color(4, 66, 114));
        Bienvenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenue.setText("Bienvenue");
        PanneauPrincipaleCentral.add(Bienvenue, java.awt.BorderLayout.NORTH);

        PanneauPrincipale.add(PanneauPrincipaleCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanneauPrincipale, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablePatientsMouseClicked(java.awt.event.MouseEvent evt) {

        if (evt.getClickCount() == 2) {    // Si l'utilisateur double clique sur une ligne de la JTable
            int selectedRow = tablePatients.getSelectedRow(); // On récupère la ligne sélectionnée
            if (selectedRow != -1) {        // Si une ligne est bien sélectionnée
                // On récupère l'IPP du patient sélectionné
                Object idPatient = tablePatients.getValueAt(selectedRow, 0);
                System.out.println("Selected: " + idPatient);
                // On crée un nouveau panel pour afficher les informations du patient
                AffichagePatient affichagePatient = new AffichagePatient((String) idPatient, utilisateur, dialogueBD);
                // On enlève le panel actuel du panneau principal central
                PanneauPrincipale.remove(scrollPaneTable);
                // On ajoute le nouveau panel au panneau principal central
                PanneauPrincipale.add(affichagePatient, BorderLayout.CENTER);
                // On actualise le panneau principal central
                PanneauPrincipale.revalidate();
                PanneauPrincipale.repaint();


            }
        }
    }
    private void BoutonPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonPatientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonPatientsActionPerformed

    private void texteNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texteNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texteNomActionPerformed

    private void BoutonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonRechercherActionPerformed
        // -------------------- On récupère la liste des patients qui correspondent à la recherche ---------------------
        // On récupère les champs de la recherche dans une HashMap
        HashMap<String,String> dataPatient = new HashMap<>();
        // Pour chaque component, on vérifie si c'est un JTextField, si c'est le cas, on ajoute le contenu du JTextField dans la HashMap
        for(Component component : PanneauRecherche.getComponents()){
            if(component instanceof JTextField){
                JTextField textField = (JTextField) component;
                if(!textField.getText().isEmpty()) { // On vérifie que le JTextField ne soit pas vide
                    dataPatient.put(textField.getName(), textField.getText());
                }
            }
        }
        // On ne veut que les patients du service de l'utilisateur
        dataPatient.put("idService", Integer.toString(utilisateur.getIdService()));
        //On récupère les patients qui correspondent à la recherche
        ResultSet resultSetPatients = dialogueBD.getPatients(dataPatient);


        // ---------------------------- On crée une JTable pour afficher les patients ---------------------------------
        //On crée un modèle de table
        DefaultTableModel modelTable = new DefaultTableModel();
        //On ajoute les colonnes de la table
        modelTable.addColumn("IPP");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Prénom");
        modelTable.addColumn("Date de Naissance");

        // Ajout des patients dans le modèle de table
        try{
            while (resultSetPatients.next()) {
                // On ajoute les informations des patients qui correspondent à la recherche dans le modèle de table
                modelTable.addRow(new Object[]{resultSetPatients.getString("idPatient"),
                                              resultSetPatients.getString("nom").trim(),
                                              resultSetPatients.getString("prenom").trim(),
                                              resultSetPatients.getString("dateNaissance").substring(0,10)});
                System.out.println(resultSetPatients.getString("idPatient") +" - " +
                        resultSetPatients.getString("nom").trim() + " " +
                        resultSetPatients.getString("prenom").trim() + " - " +
                        resultSetPatients.getString("dateNaissance").substring(0,10));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //On crée une JTable avec le modèle de table
        this.tablePatients.setModel(modelTable);
        //On définit la taille de la police de la JTable
        tablePatients.setFont(new java.awt.Font("Times New Roman", 0, 24));
        tablePatients.setRowHeight(30);
        tablePatients.getTableHeader().setPreferredSize(new Dimension(100, 50));
        tablePatients.getTableHeader().setFont(new java.awt.Font("Times New Roman", 1, 24));

        // On change la couleur de fond de l'entête de la JTable
        tablePatients.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setBackground(new Color(4,66,114));
                setForeground(Color.WHITE);
                return this;
            }
        });
        // On empêche l'utilisateur de modifier les données de la JTable
        tablePatients.setDefaultEditor(Object.class, null);
        // On définit un modèle de sélection de la JTable à un seul Patient
        tablePatients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //On crée un JScrollPane avec la JTable
        scrollPaneTable = new JScrollPane(tablePatients);
        // On change la couleur de fond de la JTable et du JScrollPane
        tablePatients.setBackground(new Color(236, 242, 254));
        scrollPaneTable.setBackground(new Color(236, 242, 254));
        scrollPaneTable.getViewport().setBackground(new Color(236, 242, 254));

        // On change la couleur de fond des lignes de la JTable
        tablePatients.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row % 2 == 0) {
                    c.setBackground(new java.awt.Color(236, 242, 254));
                } else {
                    c.setBackground(new java.awt.Color(244, 247, 254));
                }
                if (isSelected) {
                    // En gris si la ligne est sélectionnée
                    c.setBackground(new java.awt.Color(50, 115, 244));
                }
                return c;
            }
        });

        PanneauPrincipale.setBackground(new java.awt.Color(236, 242, 254));
        // On ajoute la JTable au JScrollPane
        scrollPaneTable.setViewportView(tablePatients);

        // ---------------- On affiche la liste des patients qui correspondent à la recherche -----------------------
        //On supprime tous les composants du panneau principal
        for(Component component : PanneauPrincipale.getComponents()){
            PanneauPrincipale.remove(component);
        }
        //On ajoute le JScrollPane au panneau principal
        PanneauPrincipale.add(scrollPaneTable, java.awt.BorderLayout.CENTER);
        //On actualise le panneau principal
        PanneauPrincipale.revalidate();
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
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTextField texteDateNaissance;
    private javax.swing.JTextField texteIPP;
    private javax.swing.JTextField texteNom;
    private javax.swing.JTextField textePrenom;
    // End of variables declaration//GEN-END:variables
}
