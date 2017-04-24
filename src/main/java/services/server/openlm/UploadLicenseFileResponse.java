
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
 *         &lt;element name="UploadLicenseFileResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}UploadLicenseFileResponse" minOccurs="0"/>
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
    "uploadLicenseFileResult"
})
@XmlRootElement(name = "UploadLicenseFileResponse")
public class UploadLicenseFileResponse {

    @XmlElementRef(name = "UploadLicenseFileResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse> uploadLicenseFileResult;

    /**
     * Gets the value of the uploadLicenseFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse> getUploadLicenseFileResult() {
        return uploadLicenseFileResult;
    }

    /**
     * Sets the value of the uploadLicenseFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse }{@code >}
     *     
     */
    public void setUploadLicenseFileResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UploadLicenseFileResponse> value) {
        this.uploadLicenseFileResult = value;
    }

}
