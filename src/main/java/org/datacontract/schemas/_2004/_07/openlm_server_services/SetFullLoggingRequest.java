
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetFullLoggingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetFullLoggingRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="LoggingPeriodInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetFullLoggingRequest", propOrder = {
    "loggingPeriodInMinutes"
})
public class SetFullLoggingRequest
    extends BaseRequest
{

    @XmlElement(name = "LoggingPeriodInMinutes")
    protected Integer loggingPeriodInMinutes;

    /**
     * Gets the value of the loggingPeriodInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoggingPeriodInMinutes() {
        return loggingPeriodInMinutes;
    }

    /**
     * Sets the value of the loggingPeriodInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoggingPeriodInMinutes(Integer value) {
        this.loggingPeriodInMinutes = value;
    }

}
