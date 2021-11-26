package soap.client.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SOAPConnector extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request){
        Object obj = null;
        try{
            obj = getWebServiceTemplate().marshalSendAndReceive(url, request);
        }catch( Exception ex){
            System.out.println(ex.getMessage());
        }

        return obj;
    }
}