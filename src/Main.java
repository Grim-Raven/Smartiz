import fc.ConnexionDB;

public class Main {
    public static void main(String[] args) {
        ConnexionDB connexionDB = new ConnexionDB();
        connexionDB.connect();
        connexionDB.requeteConnection(1111, "mdp");
    }
}