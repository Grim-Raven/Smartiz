package fc.hl7;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.OML_O21;
import ca.uhn.hl7v2.model.v24.segment.MSH;
import ca.uhn.hl7v2.model.v24.segment.OBR;
import ca.uhn.hl7v2.model.v24.segment.PID;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;



import java.io.IOException;
import java.net.ConnectException;
import java.util.HashMap;


public class messageHL7{

    // Les informations pour se connecter au serveur HL7
    private static final int port = 8080; // Le port du serveur HL7 de réception
    private static final String expediteur = "Smartiz"; // L'application qui envoie le message
    private static final String destinataire = "VitalWaves"; // L'application à laquelle le message est destiné

    public static Message envoieMessageHL7(Message message) {
        // On crée un contexte HAPI
        HapiContext context = new DefaultHapiContext();
        // On crée une connexion
        Connection connection;
        try {
            // On se connecte au serveur HL7
            connection = context.newClient("localhost", port, false);
            // On envoie le message et on attend la réponse
            return connection.getInitiator().sendAndReceive(message);
        } catch (HL7Exception e) {
            return null;

        } catch (LLPException e) {
            return null;
        } catch (ConnectException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }


    public static Message envoieDemandeRadio(HashMap<String, String> dataDemande) throws HL7Exception, IOException{
        // Création d'un message HL7
        OML_O21 oml = new OML_O21();
        // Récupération des segments du message HL7
        MSH msh = oml.getMSH();
        PID pid = oml.getPATIENT().getPID();
        OBR obr = oml.getORDER_GENERAL().getORDER().getOBSERVATION_REQUEST().getOBR();
        // Remplissage des champs du message HL7
        oml.initQuickstart("OML", "O21", "P");
        msh.getSendingApplication().getNamespaceID().setValue(expediteur);
        msh.getReceivingApplication().getNamespaceID().setValue(destinataire);

        // Remplissage des informations du patient
        pid.getPatientName(0).getFamilyName().getSurname().setValue(dataDemande.get("nom"));
        pid.getPatientName(0).getGivenName().setValue(dataDemande.get("prenom"));
        pid.getPatientIdentifierList(0).getID().setValue(dataDemande.get("idPatient"));
        pid.getDateTimeOfBirth().getTimeOfAnEvent().setValue(dataDemande.get("dateNaissance"));
        pid.getAdministrativeSex().setValue(dataDemande.get("sexe"));
        pid.getPatientAddress(0).getAddressType().setValue(dataDemande.get("adresse"));

        // Remplissage des informations de la demande
        // id de la demande
        obr.getPlacerOrderNumber().getEntityIdentifier().setValue(dataDemande.get("idDemande"));
        // code de la demande (RADIO)
        obr.getUniversalServiceIdentifier().getIdentifier().setValue(dataDemande.get("codeExamen"));
        // nom de la demande (Ex : Radiologie du thorax)
        obr.getUniversalServiceIdentifier().getText().setValue(dataDemande.get("nomExamen"));
        // date de l'examen (date prévue de l'examen, EX : 20240415)
        obr.getObservationDateTime().getTimeOfAnEvent().setValue(dataDemande.get("dateExamen"));
        // commentaire (commentaire du médecin qui crée la demande d'examen)
        obr.getReasonForStudy(0).getText().setValue(dataDemande.get("commentaire"));
        // Envoie du message HL7
        return envoieMessageHL7(oml);
    }
}
