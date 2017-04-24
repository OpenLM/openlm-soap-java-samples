
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for TrustedAuthenticationConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedAuthenticationConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsTrustedAuthenticationSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TrustedDomains" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="UseTrustedAuthentication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedAuthenticationConfiguration", propOrder = {
    "isTrustedAuthenticationSupported",
    "trustedDomains",
    "useTrustedAuthentication"
})
public class TrustedAuthenticationConfiguration {

    @XmlElement(name = "IsTrustedAuthenticationSupported")
    protected Boolean isTrustedAuthenticationSupported;
    @XmlElementRef(name = "TrustedDomains", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> trustedDomains;
    @XmlElement(name = "UseTrustedAuthentication")
    protected Boolean useTrustedAuthentication;

    /**
     * Gets the value of the isTrustedAuthenticationSupported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTrustedAuthenticationSupported() {
        return isTrustedAuthenticationSupported;
    }

    /**
     * Sets the value of the isTrustedAuthenticationSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTrustedAuthenticationSupported(Boolean value) {
        this.isTrustedAuthenticationSupported = value;
    }

    /**
     * Gets the value of the trustedDomains property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getTrustedDomains() {
        return trustedDomains;
    }

    /**
     * Sets the value of the trustedDomains property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setTrustedDomains(JAXBElement<ArrayOfstring> value) {
        this.trustedDomains = value;
    }

    /**
     * Gets the value of the useTrustedAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseTrustedAuthentication() {
        return useTrustedAuthentication;
    }

    /**
     * Sets the value of the useTrustedAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTrustedAuthentication(Boolean value) {
        this.useTrustedAuthentication = value;
    }

}
