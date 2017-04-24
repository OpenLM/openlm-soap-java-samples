
package org.datacontract.schemas._2004._07.openlm_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLicenseInUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLicenseInUse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenseInUse" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LicenseInUse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLicenseInUse", propOrder = {
    "licenseInUse"
})
public class ArrayOfLicenseInUse {

    @XmlElement(name = "LicenseInUse", nillable = true)
    protected List<LicenseInUse> licenseInUse;

    /**
     * Gets the value of the licenseInUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseInUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicenseInUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseInUse }
     * 
     * 
     */
    public List<LicenseInUse> getLicenseInUse() {
        if (licenseInUse == null) {
            licenseInUse = new ArrayList<LicenseInUse>();
        }
        return this.licenseInUse;
    }

}
