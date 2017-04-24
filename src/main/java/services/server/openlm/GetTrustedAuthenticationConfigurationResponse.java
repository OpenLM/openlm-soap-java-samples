
package services.server.openlm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server_services.TrustedAuthenticationConfigurationResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTrustedAuthenticationConfigurationResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}TrustedAuthenticationConfigurationResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTrustedAuthenticationConfigurationResult"
})
@XmlRootElement(name = "GetTrustedAuthenticationConfigurationResponse")
public class GetTrustedAuthenticationConfigurationResponse {

    @XmlElementRef(name = "GetTrustedAuthenticationConfigurationResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<TrustedAuthenticationConfigurationResponse> getTrustedAuthenticationConfigurationResult;

    /**
     * Gets the value of the getTrustedAuthenticationConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrustedAuthenticationConfigurationResponse }{@code >}
     *     
     */
    public JAXBElement<TrustedAuthenticationConfigurationResponse> getGetTrustedAuthenticationConfigurationResult() {
        return getTrustedAuthenticationConfigurationResult;
    }

    /**
     * Sets the value of the getTrustedAuthenticationConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrustedAuthenticationConfigurationResponse }{@code >}
     *     
     */
    public void setGetTrustedAuthenticationConfigurationResult(JAXBElement<TrustedAuthenticationConfigurationResponse> value) {
        this.getTrustedAuthenticationConfigurationResult = value;
    }

}
