
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHostPort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHostPort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HostPort" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}HostPort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPort", propOrder = {
    "hostPort"
})
public class ArrayOfHostPort {

    @XmlElement(name = "HostPort", nillable = true)
    protected List<HostPort> hostPort;

    /**
     * Gets the value of the hostPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostPort }
     * 
     * 
     */
    public List<HostPort> getHostPort() {
        if (hostPort == null) {
            hostPort = new ArrayList<HostPort>();
        }
        return this.hostPort;
    }

}
