package fc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DialogueBD {

    Connection connection = null; // La référence vers la connexion à la BD

    /**
     * Méthode de connexion à la base de données
     */
    public void connect() {
        try {
            // Identifiants de connexion
            String username = "zhangca";
            String password = "16dd76cb0c";

            // Chargement du driver
            // Nom de la classe pour le pilote Oracle
            String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
            // URL du serveur IM2AG de gestion de bases de données
            String dbUrl = "jdbc:oracle:thin:@im2ag-oracle.univ-grenoble-alpes.fr:1521:im2ag";

            Class.forName(jdbcDriver);
            // Paramétrage de la limite de temps pour la tentative de connexion (en secondes)
            DriverManager.setLoginTimeout(4);
            // Tentative de connexion
            connection = DriverManager.getConnection(dbUrl, username, password);

        } catch (ClassNotFoundException ex) {
            // En cas de driver introuvable
            Logger.getLogger(DialogueBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // En cas d'erreur SQL au niveau du serveur de la BD
            Logger.getLogger(DialogueBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Méthode d'envoi de requête à la base de données
     * @param requete la requête à envoyer à la base de données
     * @return le résultat de la requête
     */
    public ResultSet requete(String requete) {
        ResultSet resultSet = null;
        Statement statement;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(requete);
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultSet;
    }

    /**
     * Vérifie si un patient existe dans la base de données sur le critère de son nom, prénom et date de naissance
     * (pour éviter les doublons)
     * @param nomText le nom du patient
     * @param prenomText le prénom du patient
     * @param dateNaissanceText la date de naissance du patient
     * @return true si le patient existe, false sinon
     */
    public boolean patientExiste(String nomText, String prenomText, String dateNaissanceText) {
        // On construit la requête avec le nom, le prénom et la date de naissance du patient
        String requete = "SELECT * FROM Patient " +
                "WHERE nom = '" + nomText +
                "' AND prenom = '" + prenomText +
                "' AND dateNaissance = TO_DATE('" + dateNaissanceText + "', 'YYYY-MM-DD')";
        // On exécute la requête
        ResultSet resultSet = requete(requete);
        try {
            // Si le résultat de la requête n'est pas vide, alors le patient existe déjà
            if (resultSet.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName());
    }
        // Sinon, le patient n'existe pas
        return false;
    }

    public void insertPatient(HashMap<String, String> data) throws SQLException {
        ResultSet requetID = requete("SELECT MAX(idPatient) FROM Patient");
        requetID.next();
        int idPatient = requetID.getInt(1) + 1;
        // On construit la requête d'insertion du patient
        String requete = "INSERT INTO Patient (idPatient, nom, prenom, dateNaissance, sexe, adresse, dossierVisible, " +
                "vivant, idLocG, idService, fumeur, alcool, donneesSociales) " +
                "VALUES (" + idPatient + "," + data.get("nom") + "," + data.get("prenom") + "," + "TO_DATE("+data.get("dateNaissance")+",'YYYY-MM-DD')" + "," +
                data.get("sexe") + "," + data.get("adresse") + "," + data.get("dossierVisible") + "," + data.get("vivant") + "," +
                data.get("idLocG") + "," + data.get("idService") + "," + data.get("fumeur") + "," + data.get("alcool") + "," +
                data.get("donneesSociales") + ")";
        // On exécute la requête
        System.out.println(requete);
        requete(requete);
    }
}