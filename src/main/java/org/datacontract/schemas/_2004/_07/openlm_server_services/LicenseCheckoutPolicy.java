
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_shared_public.CheckoutPolicy;


/**
 * <p>Java class for LicenseCheckoutPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseCheckoutPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckoutPolicy" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}CheckoutPolicy" minOccurs="0"/>
 *         &lt;element name="LicenseID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseCheckoutPolicy", propOrder = {
    "checkoutPolicy",
    "licenseID"
})
public class LicenseCheckoutPolicy {

    @XmlElementRef(name = "CheckoutPolicy", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<CheckoutPolicy> checkoutPolicy;
    @XmlElement(name = "LicenseID")
    protected Integer licenseID;

    /**
     * Gets the value of the checkoutPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckoutPolicy }{@code >}
     *     
     */
    public JAXBElement<CheckoutPolicy> getCheckoutPolicy() {
        return checkoutPolicy;
    }

    /**
     * Sets the value of the checkoutPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckoutPolicy }{@code >}
     *     
     */
    public void setCheckoutPolicy(JAXBElement<CheckoutPolicy> value) {
        this.checkoutPolicy = value;
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

}
