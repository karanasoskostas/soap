//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.26 at 09:03:07 AM EET 
//


package soap.client.soapclient.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rgWsPublic2AfmMethodRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rgWsPublic2AfmMethodRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INPUT_REC" type="{http://rgwspublic2/RgWsPublic2}rg_ws_public2_input_rtType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rgWsPublic2AfmMethodRequestType", namespace = "http://rgwspublic2/RgWsPublic2Service", propOrder = {
    "inputrec"
})
public class RgWsPublic2AfmMethodRequestType {

    @XmlElement(name = "INPUT_REC", required = true)
    protected RgWsPublic2InputRtType inputrec;

    /**
     * Gets the value of the inputrec property.
     * 
     * @return
     *     possible object is
     *     {@link RgWsPublic2InputRtType }
     *     
     */
    public RgWsPublic2InputRtType getINPUTREC() {
        return inputrec;
    }

    /**
     * Sets the value of the inputrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RgWsPublic2InputRtType }
     *     
     */
    public void setINPUTREC(RgWsPublic2InputRtType value) {
        this.inputrec = value;
    }

}