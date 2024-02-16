package fc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestDialogueBD {


    @Test // Test de la connexion à la base de données
    public void testConnexionDB() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On vérifie que la connexion a bien été établie
        assertNotNull(dialogueBD.connection);
    }

    @Test // Test de connexion par un utilisateur du DPI avec un couple id/mdp correct
public void testRequeteConnexionDpiPositive() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de connexion avec un couple id/mdp correct
        String requete = "SELECT idPersonnelMedical, mdp "
                + "FROM PersonnelMedical "
                + "WHERE idPersonnelMedical = " + "1111" + " AND mdp = '" + "mdp" + "'";
        // On exécute la requête
        ResultSet resultSet = dialogueBD.requete(requete);
        // Le couple id/mdp est correct.
        assertNotNull(resultSet);
    }
    @Test // Test de connexion par un utilisateur du DPI avec un couple id/mdp incorrect
public void testRequeteConnexionDpiNegative() throws SQLException {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de connexion avec un couple id/mdp incorrect
        String requete = "SELECT idPersonnelMedical, mdp "
                + "FROM PersonnelMedical "
                + "WHERE idPersonnelMedical = " + "1111" + " AND mdp = '" + "MDP" + "'";
        // On exécute la requête
        ResultSet resultSet = dialogueBD.requete(requete);
        // Le couple id/mdp est incorrect.
        assertFalse(resultSet.next());
    }

    @Test // Test de la vérification de l'existence d'un patient dans la base de données
    public void testPatientExistePositif() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour un patient existant
        String nom = "Dupont";
        String prenom = "Jean";
        String dateNaissance = "1980-01-01";
        // On exécute la requête
        boolean patientExiste = dialogueBD.patientExiste(nom, prenom, dateNaissance);
        System.out.println(patientExiste);
        // Le patient existe.
        assertTrue(patientExiste);
    }

    @Test // Test de la vérification de l'absence d'un patient dans la base de données
    public void testPatientExisteNegatif() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour un patient inexistant
        String nom = "Dupont";
        String prenom = "Henry";
        String dateNaissance = "1980-01-01";// La date de naissance est différente.
        // On exécute la requête
        boolean patientExiste = dialogueBD.patientExiste(nom, prenom, dateNaissance);
        System.out.println(patientExiste);
        // Le patient n'existe pas.
        assertFalse(patientExiste);
    }

    @Test // Test de l'insertion d'un patient dans la base de données
    public void testInsertPatient() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On vérifie que le patient n'existe pas, sinon on le supprime
        if (dialogueBD.patientExiste("Doe", "John", "1990-01-03")) {
            dialogueBD.requete("DELETE FROM Patient WHERE nom = 'Doe' AND prenom = 'John' AND dateNaissance = TO_DATE('1990-01-03', 'YYYY-MM-DD')");
            System.out.println("Patient supprimé");
        }

        // On crée des données pour un patient à insérer
        HashMap<String, String> data = new HashMap<>();
        data.put("nom", "Doe");
        data.put("prenom", "John");
        data.put("dateNaissance", "1990-01-03");
        data.put("sexe", "M");
        data.put("adresse", "1 rue de la Paix");
        data.put("dossierVisible", "Y");
        data.put("vivant", "Y");
        data.put("idLocG", "1");
        data.put("idService", "1");
        data.put("fumeur", "N");
        data.put("alcool", "N");
        data.put("donneesSociales", "Aucune");
        // On exécute la requête
        try {
            String idPatient = dialogueBD.insertPatient(data);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        // On vérifie que le patient a bien été inséré
        assertTrue(dialogueBD.patientExiste("Doe", "John", "1990-01-03"));
    }

    @Test // Test de l'insertion d'une Localisation géographique dans la base de données
    public void testInsertLocG() throws SQLException {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour une localisation géographique à insérer
        HashMap<String, String> data = new HashMap<>();
        data.put("idService", "1");
        data.put("idPiece", "1");
        data.put("idLit", "P");
        // On exécute la requête
        try {
            dialogueBD.insertLocG(data);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        // On vérifie que la localisation géographique a bien été insérée
        assertTrue(dialogueBD.requete("SELECT * FROM LocalisationGeographique WHERE idService = 1 AND idPiece = 1 AND idLit = 'P'").next());
    }
}


