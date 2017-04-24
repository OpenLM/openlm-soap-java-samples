
package org.datacontract.schemas._2004._07.openlm_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLicenseCheckoutPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseCheckoutPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseCheckoutPolicy" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseCheckoutPolicy" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseCheckoutPolicy", propOrder = {
    "licenseCheckoutPolicy"
})
public class ArrayOfLicenseCheckoutPolicy {

    @XmlElement(name = "LicenseCheckoutPolicy", nillable = true)
    protected List<LicenseCheckoutPolicy> licenseCheckoutPolicy;

    /**
     * Gets the value of the licenseCheckoutPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseCheckoutPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseCheckoutPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseCheckoutPolicy }
     * 
     * 
     */
    public List<LicenseCheckoutPolicy> getLicenseCheckoutPolicy() {
        if (licenseCheckoutPolicy == null) {
            licenseCheckoutPolicy = new ArrayList<LicenseCheckoutPolicy>();
        }
        return this.licenseCheckoutPolicy;
    }

}
