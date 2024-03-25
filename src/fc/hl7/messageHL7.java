package fc.hl7;
import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.v23.message.ADT_A01;

import java.io.IOException;


public class messageHL7 {

    public static boolean envoiePatient(String info) throws HL7Exception, IOException, LLPException {
        ADT_A01 adt = new ADT_A01();
        adt.initQuickstart("ADT", "A01", "P");
        HapiContext context = new DefaultHapiContext();
        Connection connection = context.newClient("localhost", 8080, false);
        connection.getInitiator().sendAndReceive(adt);
        return true;
    }

}
