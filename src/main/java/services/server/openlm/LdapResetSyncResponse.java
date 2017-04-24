
package services.server.openlm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server_services.LDAPResetSyncResponse;


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
 *         &lt;element name="LdapResetSyncResult" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}LDAPResetSyncResponse" minOccurs="0"/>
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
    "ldapResetSyncResult"
})
@XmlRootElement(name = "LdapResetSyncResponse")
public class LdapResetSyncResponse {

    @XmlElementRef(name = "LdapResetSyncResult", namespace = "OpenLM.Server.Services", type = JAXBElement.class, required = false)
    protected JAXBElement<LDAPResetSyncResponse> ldapResetSyncResult;

    /**
     * Gets the value of the ldapResetSyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}
     *     
     */
    public JAXBElement<LDAPResetSyncResponse> getLdapResetSyncResult() {
        return ldapResetSyncResult;
    }

    /**
     * Sets the value of the ldapResetSyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}
     *     
     */
    public void setLdapResetSyncResult(JAXBElement<LDAPResetSyncResponse> value) {
        this.ldapResetSyncResult = value;
    }

}
