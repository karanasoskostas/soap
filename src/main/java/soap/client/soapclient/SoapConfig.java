package soap.client.soapclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("client");
        return marshaller;
    }

    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
//        client.setDefaultUri("https://www1.gsis.gr/wsaade/RgWsPublic2/RgWsPublic2");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
        return client;
    }

}
