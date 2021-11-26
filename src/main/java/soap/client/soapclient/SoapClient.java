package soap.client.soapclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import soap.client.soapclient.client.RgWsPublic2VersionInfoRequestType;
import soap.client.soapclient.client.RgWsPublic2VersionInfoResponseType;

import javax.xml.bind.JAXBElement;

@Service
public class SoapClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;


}


