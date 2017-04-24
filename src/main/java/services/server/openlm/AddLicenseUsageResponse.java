
package services.server.openlm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AddLicenseUsageResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AddLicenseUsageResponse" minOccurs="0"/>
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
    "addLicenseUsageResult"
})
@XmlRootElement(name = "AddLicenseUsageResponse")
public class AddLicenseUsageResponse {

    @XmlElementRef(name = "AddLicenseUsageResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse> addLicenseUsageResult;

    /**
     * Gets the value of the addLicenseUsageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse> getAddLicenseUsageResult() {
        return addLicenseUsageResult;
    }

    /**
     * Sets the value of the addLicenseUsageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse }{@code >}
     *     
     */
    public void setAddLicenseUsageResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseUsageResponse> value) {
        this.addLicenseUsageResult = value;
    }

}
