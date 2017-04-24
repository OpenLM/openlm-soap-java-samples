
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddLicenseUsageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLicenseUsageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="DenialsAdded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SessionsAdded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLicenseUsageResponse", propOrder = {
    "denialsAdded",
    "sessionsAdded"
})
public class AddLicenseUsageResponse
    extends BaseResponse
{

    @XmlElement(name = "DenialsAdded")
    protected Integer denialsAdded;
    @XmlElement(name = "SessionsAdded")
    protected Integer sessionsAdded;

    /**
     * Gets the value of the denialsAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDenialsAdded() {
        return denialsAdded;
    }

    /**
     * Sets the value of the denialsAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDenialsAdded(Integer value) {
        this.denialsAdded = value;
    }

    /**
     * Gets the value of the sessionsAdded property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSessionsAdded() {
        return sessionsAdded;
    }

    /**
     * Sets the value of the sessionsAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSessionsAdded(Integer value) {
        this.sessionsAdded = value;
    }

}
