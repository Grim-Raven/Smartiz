package ui;

import fc.AfficherListePatientsListener;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AfficherListePatients extends javax.swing.JScrollPane {

    private javax.swing.JTable tablePatients;
    private final ArrayList<AfficherListePatientsListener> patientSelectioneListenerList = new ArrayList<>();


    public AfficherListePatients(ResultSet resultSetPatients, String langue) {
        initComponents(resultSetPatients);
        changerLangue(langue);
    }

    private void changerLangue(String langue) {
        if (langue.equals("English")) {
            tablePatients.getColumnModel().getColumn(0).setHeaderValue("IPP");
            tablePatients.getColumnModel().getColumn(1).setHeaderValue("Last Name");
            tablePatients.getColumnModel().getColumn(2).setHeaderValue("First Name");
            tablePatients.getColumnModel().getColumn(3).setHeaderValue("Date of Birth");
        }
    }

    private void initComponents(ResultSet resultSetPatients) {
        // ---------------------------- On crée une JTable pour afficher les patients ---------------------------------
        //On crée un modèle de table
        DefaultTableModel modelTable = new DefaultTableModel();
        //On ajoute les colonnes de la table
        modelTable.addColumn("PPI");
        modelTable.addColumn("Nom");
        modelTable.addColumn("Prénom");
        modelTable.addColumn("Date de Naissance");

        // Ajout des patients dans le modèle de table
        try {
            while (resultSetPatients.next()) {
                // On ajoute les informations des patients qui correspondent à la recherche dans le modèle de table
                modelTable.addRow(new Object[]{resultSetPatients.getString("idPatient"),
                        resultSetPatients.getString("nom").trim(),
                        resultSetPatients.getString("prenom").trim(),
                        resultSetPatients.getString("dateNaissance").substring(0, 10)});
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //On crée une JTable avec le modèle de table
        this.tablePatients = new JTable(modelTable);
        tablePatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePatientsMouseClicked(evt);
            }
        });
        
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
                setBackground(new Color(4, 66, 114));
                setForeground(Color.WHITE);
                return this;
            }
        });
        // On empêche l'utilisateur de modifier les données de la JTable
        tablePatients.setDefaultEditor(Object.class, null);
        // On définit un modèle de sélection de la JTable à un seul Patient
        tablePatients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //On ajoute la JTable dans un JScrollPane
        this.add(tablePatients);
        // On change la couleur de fond de la JTable et du JScrollPane
        tablePatients.setBackground(new Color(236, 242, 254));
        this.setBackground(new Color(236, 242, 254));
        this.getViewport().setBackground(new Color(236, 242, 254));

        // On change la couleur de fond des lignes de la JTable
        tablePatients.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (row % 2 == 0) {
                    c.setBackground(new java.awt.Color(236, 242, 254));
                } else {
                    c.setBackground(new java.awt.Color(244, 247, 254));
                }
                if (isSelected) {
                    // En gris si la ligne est sélectionnée.
                    c.setBackground(new java.awt.Color(50, 115, 244));
                }
                return c;
            }
        });
        this.setViewportView(tablePatients);
    }

    private void tablePatientsMouseClicked(MouseEvent evt) {
        if (evt.getClickCount() == 2) {    // Si l'utilisateur double clique sur une ligne de la JTable
            int selectedRow = tablePatients.getSelectedRow(); // On récupère la ligne sélectionnée
            if (selectedRow != -1) {        // Si une ligne est bien sélectionnée
                // On récupère l'IPP du patient sélectionné
                Object idPatient = tablePatients.getValueAt(selectedRow, 0);
                

                // On prévient tous les listeners que l'utilisateur a sélectionné un patient
                for (AfficherListePatientsListener afficherListePatientsListener : patientSelectioneListenerList) {
                    afficherListePatientsListener.patientSelected((String) idPatient);
                }


            }
        }
    }

    public void addPatientSelectedListener(AfficherListePatientsListener listener) {
        patientSelectioneListenerList.add(listener);
    }
}
