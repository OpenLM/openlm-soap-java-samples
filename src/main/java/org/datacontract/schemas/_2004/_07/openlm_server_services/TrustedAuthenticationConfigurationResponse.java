
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.TrustedAuthenticationConfiguration;


/**
 * <p>Java class for TrustedAuthenticationConfigurationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustedAuthenticationConfigurationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Config" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}TrustedAuthenticationConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustedAuthenticationConfigurationResponse", propOrder = {
    "config"
})
public class TrustedAuthenticationConfigurationResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Config", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<TrustedAuthenticationConfiguration> config;

    /**
     * Gets the value of the config property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrustedAuthenticationConfiguration }{@code >}
     *     
     */
    public JAXBElement<TrustedAuthenticationConfiguration> getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrustedAuthenticationConfiguration }{@code >}
     *     
     */
    public void setConfig(JAXBElement<TrustedAuthenticationConfiguration> value) {
        this.config = value;
    }

}
