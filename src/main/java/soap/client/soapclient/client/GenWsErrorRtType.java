//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.26 at 09:03:07 AM EET 
//


package soap.client.soapclient.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gen_ws_error_rtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gen_ws_error_rtType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error_descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gen_ws_error_rtType", propOrder = {
    "errorCode",
    "errorDescr"
})
public class GenWsErrorRtType {

    @XmlElementRef(name = "error_code", namespace = "http://rgwspublic2/RgWsPublic2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "error_descr", namespace = "http://rgwspublic2/RgWsPublic2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorDescr;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDescr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorDescr() {
        return errorDescr;
    }

    /**
     * Sets the value of the errorDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorDescr(JAXBElement<String> value) {
        this.errorDescr = value;
    }

}
