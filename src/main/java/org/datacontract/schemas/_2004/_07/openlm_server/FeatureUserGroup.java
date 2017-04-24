
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server_services.SlimGroup;
import org.datacontract.schemas._2004._07.openlm_server_services.User;


/**
 * <p>Java class for FeatureUserGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureUserGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureVendorServer" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureVendorServer" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}SlimGroup" minOccurs="0"/>
 *         &lt;element name="User" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureUserGroup", propOrder = {
    "featureVendorServer",
    "group",
    "user"
})
public class FeatureUserGroup {

    @XmlElementRef(name = "FeatureVendorServer", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<FeatureVendorServer> featureVendorServer;
    @XmlElementRef(name = "Group", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimGroup> group;
    @XmlElementRef(name = "User", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<User> user;

    /**
     * Gets the value of the featureVendorServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeatureVendorServer }{@code >}
     *     
     */
    public JAXBElement<FeatureVendorServer> getFeatureVendorServer() {
        return featureVendorServer;
    }

    /**
     * Sets the value of the featureVendorServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeatureVendorServer }{@code >}
     *     
     */
    public void setFeatureVendorServer(JAXBElement<FeatureVendorServer> value) {
        this.featureVendorServer = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimGroup }{@code >}
     *     
     */
    public JAXBElement<SlimGroup> getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimGroup }{@code >}
     *     
     */
    public void setGroup(JAXBElement<SlimGroup> value) {
        this.group = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setUser(JAXBElement<User> value) {
        this.user = value;
    }

}
