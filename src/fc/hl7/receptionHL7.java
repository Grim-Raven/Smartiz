package fc.hl7;


import ca.uhn.hl7v2.HL7Exception;
import fc.DialogueBD;

import java.io.IOException;

import ca.uhn.hl7v2.app.SimpleServer;
import ca.uhn.hl7v2.llp.LowerLayerProtocol;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ADT_A01;
import ca.uhn.hl7v2.model.v24.message.MDM_T02;
import ca.uhn.hl7v2.model.v24.message.ORU_R01;
import ca.uhn.hl7v2.model.v24.segment.OBX;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.parser.PipeParser;
import ca.uhn.hl7v2.protocol.ReceivingApplication;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class receptionHL7 implements ReceivingApplication {

    private SimpleServer server;
    private final DialogueBD dialogueBD;

    public receptionHL7(DialogueBD dialogueBD) {
        this.dialogueBD = dialogueBD;
    }

    /**
     * Méthode pour démarrer la réception des messages HL7
     */
    public void startReceiving() {
        int port = 8888; // Le port sur lequel écouter
        // Le parser pour les messages HL7 (c'est un parser qui utilise le caractère | comme séparateur)
        Parser parser = new PipeParser();
        // Le protocole de transport (ici, on utilise le protocole MLLP, basé sur TCP/IP)
        LowerLayerProtocol llp = LowerLayerProtocol.makeLLP();
        // On crée un serveur HL7 avec le port, le protocole de transport et le parser
        server = new SimpleServer(port, llp, parser);

        // On enregistre l'application de réception pour tous les messages
        server.registerApplication("*", "*", this);

        // On démarre le serveur
        server.start();
        
    }

    /**
     * Méthode de traitement des messages HL7
     *
     * @param message Le message HL7 reçu
     * @param map     Une map contenant des informations supplémentaires
     */
    @Override
    public Message processMessage(Message message, Map<String, Object> map) throws HL7Exception {
        // On vérifie que le message est un message MDM_T02
        if (message instanceof MDM_T02) {
            // Réception d'un message MDM_T02 : résultat d'un examen
            MDM_T02 mdm = (MDM_T02) message;
            OBX obx = mdm.getOBX();
            // Récupération des informations : numéro de l'acte et compte-rendu
            String idActe = obx.getObservationIdentifier().getIdentifier().getValue();
            String compteRendu = obx.getObservationResultStatus().getValue();
            HashMap<String, String> dataResultat = new HashMap<>();
            dataResultat.put("idActe", idActe);
            // Si le résultat contient des apostrophes, on les échappe
            String compteRenduEchapee = compteRendu.replace("'", "''");
            dataResultat.put("resultat", compteRenduEchapee);
            dataResultat.put("valide", "Y");
            // Enregistrement du résultat dans la base de données
            try {
                dialogueBD.updateTable("Acte", dataResultat, "idActe", idActe);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            // On renvoie un accusé de réception
            return message.generateACK();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean canProcess(Message message) {
        return true;
    }
}
