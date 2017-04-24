
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateCheckoutPolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCheckoutPolicyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="LicenseCheckoutPolicies" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfLicenseCheckoutPolicy" minOccurs="0"/>
 *         &lt;element name="VendorCheckoutPolicies" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfVendorCheckoutPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCheckoutPolicyRequest", propOrder = {
    "licenseCheckoutPolicies",
    "vendorCheckoutPolicies"
})
public class UpdateCheckoutPolicyRequest
    extends BaseRequest
{

    @XmlElementRef(name = "LicenseCheckoutPolicies", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseCheckoutPolicy> licenseCheckoutPolicies;
    @XmlElementRef(name = "VendorCheckoutPolicies", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVendorCheckoutPolicy> vendorCheckoutPolicies;

    /**
     * Gets the value of the licenseCheckoutPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseCheckoutPolicy }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseCheckoutPolicy> getLicenseCheckoutPolicies() {
        return licenseCheckoutPolicies;
    }

    /**
     * Sets the value of the licenseCheckoutPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseCheckoutPolicy }{@code >}
     *     
     */
    public void setLicenseCheckoutPolicies(JAXBElement<ArrayOfLicenseCheckoutPolicy> value) {
        this.licenseCheckoutPolicies = value;
    }

    /**
     * Gets the value of the vendorCheckoutPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorCheckoutPolicy }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVendorCheckoutPolicy> getVendorCheckoutPolicies() {
        return vendorCheckoutPolicies;
    }

    /**
     * Sets the value of the vendorCheckoutPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVendorCheckoutPolicy }{@code >}
     *     
     */
    public void setVendorCheckoutPolicies(JAXBElement<ArrayOfVendorCheckoutPolicy> value) {
        this.vendorCheckoutPolicies = value;
    }

}
