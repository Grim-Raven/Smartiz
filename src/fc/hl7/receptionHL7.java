package fc.hl7;


import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.protocol.ReceivingApplication;
import ca.uhn.hl7v2.protocol.ReceivingApplicationException;

import java.util.Map;

public class receptionHL7 implements ReceivingApplication {

    @Override
    public Message processMessage(Message message, Map<String, Object> map) throws ReceivingApplicationException, HL7Exception {

        return null;
    }

    @Override
    public boolean canProcess(Message message) {
        return true;
    }
}
