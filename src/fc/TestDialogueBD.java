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
public void testRequeteConnexionDpiPositive() throws SQLException {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de connexion avec un couple id/mdp correct
        String requete = "SELECT idPersonnelMedical, mdp "
                + "FROM PersonnelMedical "
                + "WHERE idPersonnelMedical = " + "1111" + " AND mdp = '" + Hashage.sha256("mdp") + "'";
        // On exécute la requête
        ResultSet resultSet = dialogueBD.requete(requete);
        resultSet.next();
        // Le couple id/mdp est correct.
        assertEquals("1111", resultSet.getString("idPersonnelMedical"));
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
            dialogueBD.insertPatient(data);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        // On vérifie que le patient a bien été inséré
        assertTrue(dialogueBD.patientExiste("Doe", "John", "1990-01-03"));
    }

    @Test // Test de l'insertion d'une Localisation géographique dans la base de données
    public void testInsertLocG(){
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
            String idLocG = dialogueBD.insertLocG(data);
            // On vérifie que la localisation géographique a bien été insérée
            assertTrue(dialogueBD.requete("SELECT * FROM LocalisationG WHERE idLocG =" + idLocG).next());
            // On supprime la locG qui a été créée
            dialogueBD.requete("DELETE FROM LocalisationG WHERE idLocG ="+idLocG);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Test // Test de l'insertion d'un séjour dans la base de donnée
    public void testInsertSejour(){
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour un séjour à insérer
        HashMap<String, String> data = new HashMap<>();
        data.put("idPatient", "1");
        data.put("dateDebut", "2024-02-16");
        data.put("dateFin", "2024-02-16");
        data.put("consultation", "Y");
        data.put("ouvert", "Y");
        data.put("LettreDeSortie", "lds");
        data.put("idLocG", "1");
        data.put("idMedecinReferent", "1111");

        try {
            String idSejour = dialogueBD.insertSejour(data);
            // On vérifie que la localisation géographique a bien été insérée
            assertTrue(dialogueBD.requete("SELECT * FROM Sejour WHERE idSejour = 1").next());
            // On supprime la locG qui a été créée
            dialogueBD.requete("DELETE FROM Sejour WHERE idSejour ="+idSejour);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Test // Test de l'insertion d'un personnel médical dans la base de données
    public void testInsertPersonnelMedical(){
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour une localisation géographique à insérer
        HashMap<String, String> data = new HashMap<>();
        data.put("idPersonnelMedical", "2222");
        data.put("mdp", Hashage.sha256("mdp"));
        data.put("nom", "Doe");
        data.put("prenom", "John");
        data.put("poste", "medecin");
        data.put("dateFinContrat", "2024-09-16");
        data.put("idService", "1");
        data.put("ARC", "Y");
        // On exécute la requête
        try {
            dialogueBD.insertPersonnelMedical(data);
            // On vérifie que la localisation géographique a bien été insérée
            boolean existe =dialogueBD.requete("SELECT * FROM PersonnelMedical WHERE idPersonnelMedical =2222").next();
            assertTrue(existe);
            // On supprime la locG qui a été créée
            dialogueBD.requete("DELETE FROM PersonnelMedical WHERE idPersonnelMedical =2222");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Test // Test de l'insertion d'une prescription dans la base de données
    public void testInsertPrescription(){
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée des données pour une prescription à insérer
        HashMap<String, String> data = new HashMap<>();
        data.put("nom", "prescription");
        data.put("datePrescription", "2024-02-16");
        data.put("posologie", "Doliprane 8mg Soir  Auricular");
        data.put("commentaire", "commentaire");
        // On exécute la requête
        try {
            String idActe =dialogueBD.insertPrescription(data);
            // On vérifie que la prescription a bien été insérée
            boolean existe =dialogueBD.requete("SELECT * FROM Acte WHERE idActe="+idActe).next();
            assertTrue(existe);
            // On supprime la prescription qui a été créée
            dialogueBD.requete("DELETE FROM Acte WHERE idActe ="+idActe);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Test // Test de la récupération des dossiers patients d'un service
    public void testGetPatientsService(){
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On Cherche les patients qui ont un séjour ouvert dans le service
        ResultSet resultat = dialogueBD.getPatientsService("1");
        // On vérifie si le test est réussi
        try {
            assertTrue(resultat.next());
            // On imprime l'id de tous les patients
            System.out.println(resultat.getString("idPatient"));
            while(resultat.next()){ // Tant qu'il y a des patients
                System.out.println(resultat.getString("idPatient"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test // Test de la récupération des patients par la recherche
    public void testGetPatientsRecherche(){
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée les données de la recherche
        HashMap<String, String> data = new HashMap<>();
        data.put("prenom", "Jean");
        data.put("idService", "1");
        // On fait la requête avec les données
        ResultSet resultat = dialogueBD.getPatients(data);
        // On vérifie si le test est réussi
        try {
            assertTrue(resultat.next());
            // On imprime le nom de tous les patients
            System.out.println(resultat.getString("nom"));
            while(resultat.next()){ // Tant qu'il y a des patients
                System.out.println(resultat.getString("nom"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


