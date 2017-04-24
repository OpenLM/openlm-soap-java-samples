
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
 *         &lt;element name="AddLicenseInfoResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}AddLicenseInfoResponse" minOccurs="0"/>
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
    "addLicenseInfoResult"
})
@XmlRootElement(name = "AddLicenseInfoResponse")
public class AddLicenseInfoResponse {

    @XmlElementRef(name = "AddLicenseInfoResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse> addLicenseInfoResult;

    /**
     * Gets the value of the addLicenseInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse> getAddLicenseInfoResult() {
        return addLicenseInfoResult;
    }

    /**
     * Sets the value of the addLicenseInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse }{@code >}
     *     
     */
    public void setAddLicenseInfoResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddLicenseInfoResponse> value) {
        this.addLicenseInfoResult = value;
    }

}
