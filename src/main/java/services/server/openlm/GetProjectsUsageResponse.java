
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
 *         &lt;element name="GetProjectsUsageResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}GetProjectsUsageResponse" minOccurs="0"/>
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
    "getProjectsUsageResult"
})
@XmlRootElement(name = "GetProjectsUsageResponse")
public class GetProjectsUsageResponse {

    @XmlElementRef(name = "GetProjectsUsageResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse> getProjectsUsageResult;

    /**
     * Gets the value of the getProjectsUsageResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse> getGetProjectsUsageResult() {
        return getProjectsUsageResult;
    }

    /**
     * Sets the value of the getProjectsUsageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse }{@code >}
     *     
     */
    public void setGetProjectsUsageResult(JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetProjectsUsageResponse> value) {
        this.getProjectsUsageResult = value;
    }

}
