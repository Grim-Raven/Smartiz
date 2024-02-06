import fc.DialogueBD;
import ui.InterfaceConnexion;

public class Main {
    public static void main(String[] args) {
        // On instancie un objet DialogueBD pour communiquer avec la base de données
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On instancie l'interface de connexion
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConnexion(dialogueBD).setVisible(true);
            }
        });
    }
}