package fc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        // Protection contre les SQL injections
        if (requete.toUpperCase().contains(" OR ")) {
            // un utilisateur ne peut pas rajouter de 'or 1=1' dans la requête pour outrepasser un where
            throw new IllegalArgumentException("Requête non valide");
        }
        // On ne veut pas le mot clé

        System.out.println(requete);
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

    /**
     * Méthode d'insertion dans une table de la base de données
     * @param table la table dans laquelle on veut insérer les données
     * @param valeurClef la valeur de la clé primaire
     * @param nomClef le nom de la clé primaire
     * @param data les données à insérer dans la table
     */
    public void insertTable(String table, String valeurClef, String nomClef, HashMap<String, String> data) throws SQLException {
        // On construit la requête d'insertion dans la table
        // On commence par les colonnes et les valeurs de la clé primaire
        StringBuilder columns = new StringBuilder("INSERT INTO "+table+" ("+nomClef+", ");
        StringBuilder values = new StringBuilder("VALUES ("+valeurClef+", ");

        // On parcourt les données du patient pour les ajouter à la requête
        for (Map.Entry<String, String> entry : data.entrySet()) {
            // Si la valeur n'est pas nulle, on l'ajoute à la requête
            if (entry.getValue() != null) {
                // On ajoute le nom de la colonne et la valeur à la requête
                columns.append(entry.getKey()).append(", ");
                System.out.println("SELECT DATA_TYPE FROM USER_TAB_COLUMNS WHERE table_name = '"+table.toUpperCase()+"' AND column_name = '"+entry.getKey().toUpperCase()+"'");
                ResultSet resultatType = requete("SELECT DATA_TYPE FROM USER_TAB_COLUMNS WHERE table_name = '"+table.toUpperCase()+"' AND column_name = '"+entry.getKey().toUpperCase()+"'");
                
                resultatType.next(); // On se met sur la première ligne du résultat
                // On récupère le type de la colonne
                String typeColonne = resultatType.getString("DATA_TYPE");

                switch (typeColonne) {
                    case "NUMBER":
                        values.append(entry.getValue()).append(", ");
                        break;
                    case "DATE": // Pour les dates, on utilise la fonction TO_DATE
                        values.append("TO_DATE('").append(entry.getValue()).append("', 'YYYY-MM-DD'), ");
                        break;
                    default: // Pour les chaînes de caractères, on ajoute des guillemets simples
                        values.append("'").append(entry.getValue()).append("', ");
                        break;
                }
            }
        }
        // On supprime les ", " à la fin de chaque partie de la requête
        if (columns.length() > 0) {
            columns.setLength(columns.length() - 2); // for last ", "
        }
        if (values.length() > 0) {
            values.setLength(values.length() - 2); // for last ", "
        }

        // On ajoute les parenthèses à la fin de chaque partie de la requête
        columns.append(") ");
        values.append(")");

        String requete = columns.toString() + values;
        // On exécute la requête
        System.out.println(requete);
        requete(requete);
    }

    /**
     * Méthode d'insertion d'un patient dans la base de données
     * @param data les données du patient à insérer
     * @throws SQLException si une erreur SQL survient
     */
    public String insertPatient(HashMap<String, String> data) throws SQLException {
        ResultSet requeteID = requete("SELECT MAX(idPatient) FROM Patient");
        requeteID.next();
        int idPatient = requeteID.getInt(1) + 1;
        insertTable("Patient", String.valueOf(idPatient), "idPatient", data);
        return String.valueOf(idPatient);
    }

    /**
     * Méthode d'insertion d'une étude dans la base de données
     * @param data les données de l'étude à insérer
     * @throws SQLException si une erreur SQL survient
     */
    public String insertEtude(HashMap<String, String> data) throws SQLException {
        ResultSet requeteID = requete("SELECT MAX(idEtude) FROM Etude");
        requeteID.next();
        int idEtude = requeteID.getInt(1) + 1;
        insertTable("Etude", String.valueOf(idEtude), "idEtude", data);
        return String.valueOf(idEtude);
    }

    /**
     * Méthode d'insertion d'un nouveau séjour dans la base de donnée
     *
     * @param data la HashMap contenant les données du séjour
     * @return l'id du séjour créé
     * @throws SQLException Si une erreur liée à SQL survient
     */
    public String insertSejour(HashMap<String, String> data) throws SQLException {
        ResultSet requeteID = requete("SELECT MAX(idSejour) FROM Sejour");
        requeteID.next();
        int idSejour = requeteID.getInt(1) + 1;
        insertTable("Sejour", String.valueOf(idSejour), "idSejour", data);
    return String.valueOf(idSejour);
    }


    /**
     * Méthode d'insertion d'une localisation géographique dans la base de donnée
     * @param data : la HashMap contenant les données de la locG
     * @return l'id de la locG qui vient d'être insérée
     * @throws SQLException Si une erreur liée à SQL survient
     */
    public String insertLocG(HashMap<String, String> data) throws SQLException {
// On récupère le plus grand id pour une locG
        ResultSet requeteID = requete("SELECT MAX(idLocG) FROM LocalisationG");
        requeteID.next();
// On crée un nouvel id en incrémentant de 1 le plus grand id existant
        int idLocG = requeteID.getInt(1) + 1;
        // On insère une nouvelle locG dans la table LOCALISATIONG
        insertTable("LOCALISATIONG", String.valueOf(idLocG), "idLocG", data);
// On retourne l'id de la nouvelle locG créée
        return String.valueOf(idLocG);
    }

    /**
     * Méthode d'ajout d'un nouveau personnel Médical dans la base de données
     * @param data La HashMap contenant les données du nouveau personnel médical
     * @throws SQLException Si une erreur liée à SQL survient
     */
    public void insertPersonnelMedical(HashMap<String, String> data) throws SQLException {
        // On récupère la clef dans la HashMap et on l'enlève
        String idPersonnelMedical = data.get("idPersonnelMedical");
        data.remove("idPersonnelMedical");
        insertTable("PERSONNELMEDICAL", idPersonnelMedical, "IDPERSONNELMEDICAL",data);

    }

    /**
     * Méthode de récupération des noms des services de la base de données
     * @return la liste des noms des services
     */
    public ArrayList<String> getNomServices() {
        // On construit la requête pour récupérer les services
        String requete = "SELECT NOMSERVICE FROM Service";
        // On exécute la requête
        ResultSet resultSet = requete(requete);

        ArrayList<String> services = new ArrayList<>();
        try {
            // On récupère les résultats de la requête
            while (resultSet.next()) {
                // On ajoute le nom du service à la liste des services
                services.add(resultSet.getString("nomService"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName());
        }
        // On retourne la liste des services
        System.out.println(services);
        return services;
    }

    /**
     * Méthode de récupération de l'identifiant d'un service de la base de données
     * @param serviceGeo le nom du service
     * @return l'identifiant du service
     */
    public String getIdService(String serviceGeo) {
        String requete = "SELECT idService FROM Service WHERE nomService = '" + serviceGeo + "'";
        ResultSet resultSet = requete(requete);
        try {
            if (resultSet.next()) {
                return resultSet.getString("idService");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName());
        }
        return null;
    }

    /**
     * Méthode d'insertion d'une prescription dans la base de donnée
     * @param data : la HashMap contenant les données de la prescription
     */
    public String insertActe(HashMap<String, String> data){
        try {
        ResultSet requeteID = requete("SELECT MAX(idActe) FROM ACTE");
        requeteID.next();
        int idActe = requeteID.getInt(1) + 1;
            insertTable("ACTE", String.valueOf(idActe), "idActe", data);
            return String.valueOf(idActe);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Méthode de récupération du nom d'utilisateur via son identifiant
     * @param identifiant l'identifiant de l'utilisateur
     * @return le nom + prénom de l'utilisateur
     */
    public String getNomUtilisateur(String identifiant) {
        // On construit la requête pour récupérer le nom et le prénom de l'utilisateur
        String requete = "SELECT nom, prenom FROM PersonnelMedical WHERE idPersonnelMedical = '" + identifiant + "'";
        ResultSet resultSet = requete(requete);
        try {
            if (resultSet.next()) {
                // On retourne le nom et le prénom de l'utilisateur en enlevant les espaces
                return resultSet.getString("nom").replace(" ", "") + " " + resultSet.getString("prenom").replace(" ", "");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName());
        }
        return null;
    }

    /**
     * Méthode de recherche d'une table dans la base de données
     * @param table la table dque l'on cherche
     * @param data les données avec lesquelles on cherche
     * @throws SQLException si une erreur SQL survient
* HashMap : concept de clé-valeur (requête SQL : SELECT * FROM table WHERE clé = valeur)
    */

    public ResultSet rechercheTable(String table, HashMap<String, String> data, boolean sensibleCasse) throws SQLException{
        // On construit la requête de recherche dans la table
        StringBuilder recherche = new StringBuilder("SELECT * FROM ").append(table).append(" WHERE ");

        // On parcourt les données pour les ajouter à la requête
        for (Map.Entry<String, String> entry : data.entrySet()) {
            // Si la valeur n'est pas nulle, on l'ajoute à la requête 
            if (entry.getValue() != null) {
                //la HashMap n'est pas vide, donc on a des filtres à prendre en compte
                ResultSet resultatType = requete("SELECT DATA_TYPE FROM USER_TAB_COLUMNS WHERE table_name = '"+table.toUpperCase()+"' AND column_name = '"+entry.getKey().toUpperCase()+"'");
                
                // On se met sur la première ligne du résultat
                resultatType.next(); 
                //On récupère la clé
                if(!sensibleCasse){
                    recherche.append("UPPER(").append(entry.getKey()).append(") = ");
                }else{
                recherche.append(entry.getKey()).append("= ");
                }
                // On récupère le type de la colonne
                System.out.println(entry.getKey().toString());
                String typeColonne = resultatType.getString("DATA_TYPE");
                
                switch (typeColonne) {
                    case "NUMBER":
                        recherche.append(entry.getValue()).append(" AND ");
                        break;
                    case "DATE": // Pour les dates, on utilise la fonction TO_DATE
                        recherche.append("TO_DATE('").append(entry.getValue()).append("', 'YYYY-MM-DD') AND ");
                        break;
                    default: // Pour les chaînes de caractères, on ajoute des guillemets simples
                        String charSQL = "'"+entry.getValue()+"'";
                        if(!sensibleCasse){
                            recherche.append("UPPER(").append(charSQL).append(") AND ");
                        }else{
                            recherche.append(charSQL).append(" AND ");
}
                        break;
                }
            }
        }

        // On supprime les "AND " à la fin de chaque partie de la requête
        if (data.size() > 0) {
            recherche.setLength(recherche.length() - 5); // pour le dernier "AND "
        }
        else{
            recherche.setLength(recherche.length() -7); // pour le " WHERE "
        } 
        String requete = recherche.toString();
        // On exécute la requête
        System.out.println(requete);
        return requete(requete);
    }
    
/**
     * Méthode de récupération des patients d'un service de la base de données
     * @param idService l'identifiant du service
     * @return les patients du service
     */
    public ResultSet getPatientsService(String idService){
        // Construction de la requête
        HashMap<String, String> dataService = new HashMap<>();
        dataService.put("idService", idService);
        try {
            return rechercheTable("Patient", dataService, false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Méthode de récupération des patients de la base de données sur le critère de leurs données
     * @param dataPatient les données du patient
     * @return les patients correspondant aux données
     */
    public ResultSet getPatients(HashMap<String, String> dataPatient) {
        try {
            return rechercheTable("Patient", dataPatient, false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Méthode de récupération d'une étude de la base de données sur le critère de leurs données
     * @param dataEtude les données de l'étude
     * @return les études correspondant aux données
     */
    public ResultSet getEtude(HashMap<String, String> dataEtude) {
        try {
            return rechercheTable("etudes", dataEtude, false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Méthode de récupération du nom d'un service via son Id
     * @param idService l'identifiant du service
     * @return Le nom du Service
     */
    public String getNomService(String idService) {
        // On construit la requête pour récupérer le service du personnel médical
        String requete = "SELECT nomService FROM Service WHERE idService = " + idService;
        ResultSet resultSet = requete(requete);
        try {
            if (resultSet.next()) {
                // On retourne le service du personnel médical
                return resultSet.getString("nomService").trim();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBD.class.getName());
        }
        return null;
    }

}