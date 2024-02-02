package fc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnexionDB {

    Connection connection = null; // La référence vers la connexion à la BD

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
            Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            // En cas d'erreur SQL au niveau du serveur de la BD
            Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void requeteConnection(int idUtilisateur, String motDePasse) {
        if (connection != null) { // La connexion a été établie
            System.out.println("Connexion établie.");

            try {
                // Création de la requête
                Statement statement = connection.createStatement();
                ResultSet resultSet;
                // Exécution de la requête : on récupère le mot de passe associé à l'idUtilisateur
                String s = "SELECT idPersonnelMedical, mdp "
                        + "FROM PersonnelMedical "
                        + "WHERE idPersonnelMedical = " + idUtilisateur + " AND mdp = '" + motDePasse + "'";
                System.out.println(s);
                resultSet = statement.executeQuery(
                        "SELECT idPersonnelMedical, mdp "
                                + "FROM PersonnelMedical "
                                + "WHERE idPersonnelMedical = " + idUtilisateur + " AND mdp = '" + motDePasse + "'");

                // Récupération des résultats
                if (resultSet.next()) {
                    System.out.println("ok vas y");
                } else {
                    System.out.println("nop");
                }

                // Une fois le test terminé, fermeture du flux de résultat, de la requête et de la connexion
                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException ex) {
                System.out.println("Erreur SQL :");
                // En cas d'erreur SQL au niveau du serveur de la BD
                Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }
}