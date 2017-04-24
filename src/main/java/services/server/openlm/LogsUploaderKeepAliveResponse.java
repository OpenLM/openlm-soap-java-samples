
package services.server.openlm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server_services.LogsUploadingBaseResponse;


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
 *         &lt;element name="LogsUploaderKeepAliveResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LogsUploadingBaseResponse" minOccurs="0"/>
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
    "logsUploaderKeepAliveResult"
})
@XmlRootElement(name = "LogsUploaderKeepAliveResponse")
public class LogsUploaderKeepAliveResponse {

    @XmlElementRef(name = "LogsUploaderKeepAliveResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LogsUploadingBaseResponse> logsUploaderKeepAliveResult;

    /**
     * Gets the value of the logsUploaderKeepAliveResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}
     *     
     */
    public JAXBElement<LogsUploadingBaseResponse> getLogsUploaderKeepAliveResult() {
        return logsUploaderKeepAliveResult;
    }

    /**
     * Sets the value of the logsUploaderKeepAliveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}
     *     
     */
    public void setLogsUploaderKeepAliveResult(JAXBElement<LogsUploadingBaseResponse> value) {
        this.logsUploaderKeepAliveResult = value;
    }

}
