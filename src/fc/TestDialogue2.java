package fc;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestDialogue2 {

    @Test // Test de la connexion à la base de données
    public void testConnexionDB() {
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On vérifie que la connexion a bien été établie
        assertNotNull(dialogueBD.connection);
    }

    @Test // Test de recherche d'une table
    public void testRechercheTable1Argument() throws SQLException{
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de recherche de bilel dans la table patient
        HashMap<String, String> filtre = new HashMap<>() ;
        String table = "patient";
        String clef = "prenom";
        String valeur = "Bilel";
        filtre.put(clef, valeur);
        // On exécute la requête
        try {
            ResultSet resultat = dialogueBD.rechercheTable(table, filtre);
            assertTrue(resultat.next());
            System.out.println(resultat.getString("nom"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test // Test de recherche d'une table
    public void testRechercheTableSansArgument() throws SQLException{
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de recherche de bilel dans la table patient
        HashMap<String, String> filtre = new HashMap<>() ;
        String table = "patient";
        filtre.put(null, null);
        try {
            // On exécute la requête
            ResultSet resultat = dialogueBD.rechercheTable(table, filtre);
            assertTrue(resultat.next());
            System.out.println(resultat.getString("nom"));
            //Affiche le résultat obtenu
            while(resultat.next()){
                System.out.println(resultat.getString("nom"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test // Test de recherche d'une table
    public void testRechercheTable2Arguments() throws SQLException{
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On crée une requête de recherche de bilel dans la table patient
        HashMap<String, String> filtre = new HashMap<>() ;
        String table = "patient";
        String clef1 = "prenom";
        String valeur1 = "Bilel";
        filtre.put(clef1, valeur1);
        String clef2 = "nom";
        String valeur2 = "mAHIOUZ";
        filtre.put(clef2, valeur2);
        try {
            // On exécute la requête
            ResultSet resultat = dialogueBD.rechercheTable(table, filtre);
            assertTrue(resultat.next());
            //Affiche le résultat obtenu
            System.out.println(resultat.getString("nom"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
