package fc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        String nom = "Doe";
        String prenom = "John";
        String dateNaissance = "1990-01-03";// La date de naissance est différente.
        // On exécute la requête
        boolean patientExiste = dialogueBD.patientExiste(nom, prenom, dateNaissance);
        System.out.println(patientExiste);
        // Le patient n'existe pas.
        assertFalse(patientExiste);
    }


}


