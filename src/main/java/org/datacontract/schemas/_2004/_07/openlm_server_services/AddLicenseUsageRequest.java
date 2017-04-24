
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLicenseUsageRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLicenseUsageRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Denials" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfDenial" minOccurs="0"/>
 *         &lt;element name="LicenseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Sessions" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfLicenseInUse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLicenseUsageRequest", propOrder = {
    "denials",
    "licenseID",
    "sessions"
})
public class AddLicenseUsageRequest
    extends BaseRequest
{

    @XmlElementRef(name = "Denials", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDenial> denials;
    @XmlElement(name = "LicenseID")
    protected Integer licenseID;
    @XmlElementRef(name = "Sessions", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseInUse> sessions;

    /**
     * Gets the value of the denials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDenial }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDenial> getDenials() {
        return denials;
    }

    /**
     * Sets the value of the denials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDenial }{@code >}
     *     
     */
    public void setDenials(JAXBElement<ArrayOfDenial> value) {
        this.denials = value;
    }

    /**
     * Gets the value of the licenseID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicenseID() {
        return licenseID;
    }

    /**
     * Sets the value of the licenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicenseID(Integer value) {
        this.licenseID = value;
    }

    /**
     * Gets the value of the sessions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseInUse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseInUse> getSessions() {
        return sessions;
    }

    /**
     * Sets the value of the sessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseInUse }{@code >}
     *     
     */
    public void setSessions(JAXBElement<ArrayOfLicenseInUse> value) {
        this.sessions = value;
    }

}
