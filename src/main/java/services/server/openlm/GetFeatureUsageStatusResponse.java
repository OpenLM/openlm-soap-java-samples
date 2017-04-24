
package services.server.openlm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server_services.FeatureUsageStatusResponse;


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
 *         &lt;element name="GetFeatureUsageStatusResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}FeatureUsageStatusResponse" minOccurs="0"/>
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
    "getFeatureUsageStatusResult"
})
@XmlRootElement(name = "GetFeatureUsageStatusResponse")
public class GetFeatureUsageStatusResponse {

    @XmlElementRef(name = "GetFeatureUsageStatusResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<FeatureUsageStatusResponse> getFeatureUsageStatusResult;

    /**
     * Gets the value of the getFeatureUsageStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeatureUsageStatusResponse }{@code >}
     *     
     */
    public JAXBElement<FeatureUsageStatusResponse> getGetFeatureUsageStatusResult() {
        return getFeatureUsageStatusResult;
    }

    /**
     * Sets the value of the getFeatureUsageStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeatureUsageStatusResponse }{@code >}
     *     
     */
    public void setGetFeatureUsageStatusResult(JAXBElement<FeatureUsageStatusResponse> value) {
        this.getFeatureUsageStatusResult = value;
    }

}