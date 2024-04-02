package fc.hl7;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v24.message.ACK;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class TestHL7 {

    @Test
    public void testEnvoieDemandeRadio() throws HL7Exception, IOException {
            PropertyConfigurator.configure("src/main/resources/log4j.properties");
            HashMap<String, String> dataDemande = new HashMap<>();

            // Remplissage des données de la demande
            // Données du patient
            dataDemande.put("nom", "Doe");
            dataDemande.put("prenom", "John");
            dataDemande.put("idPatient", "123456");
            dataDemande.put("dateNaissance", "19800101");
            dataDemande.put("sexe", "M");
            // Données de la demande
            dataDemande.put("idDemande", "123456");
            dataDemande.put("codeExamen", "RADIO");
            dataDemande.put("nomExamen", "Radiologie du thorax");
            LocalDate dateDuJour = LocalDate.now();
            dataDemande.put("dateExamen", dateDuJour.toString().replace("-", ""));
            dataDemande.put("commentaire", "Faut lui faire la radio svp merci");

            // Envoi de la demande
            Message reponse = messageHL7.envoieDemandeRadio(dataDemande);
            // Vérification de la réponse
            System.out.println(((ACK) reponse).getMSA().getAcknowledgementCode().getValue());
            assertEquals("AA", ((ACK) reponse).getMSA().getAcknowledgementCode().getValue());;

    }




}
