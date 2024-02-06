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
}
