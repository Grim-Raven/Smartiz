import fc.DialogueBD;
import fc.hl7.receptionHL7;
import org.apache.log4j.PropertyConfigurator;
import ui.InterfaceConnexion;

public class Main {
    public static void main(String[] args) {
        // On instancie un objet DialogueBD pour communiquer avec la base de données
        DialogueBD dialogueBD = new DialogueBD();
        // On se connecte à la base de données
        dialogueBD.connect();
        // On instancie l'interface de connexion
        PropertyConfigurator.configure("src/main/resources/log4j.properties");

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceConnexion(dialogueBD).setVisible(true);
            }
        });

        // On instancie un objet receptionHL7 pour recevoir des messages HL7
        receptionHL7 hl7Receiver = new receptionHL7(dialogueBD);

        // On crée un nouveau thread pour la réception des messages HL7
        Thread hl7Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                
                hl7Receiver.startReceiving();
            }
        });
        // On démarre le thread
        hl7Thread.start();
    }
}