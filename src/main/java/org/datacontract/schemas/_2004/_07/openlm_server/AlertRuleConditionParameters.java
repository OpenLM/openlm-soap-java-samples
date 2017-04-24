
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.openlm_shared_public.ArrayOfLicenseTypes;


/**
 * <p>Java class for AlertRuleConditionParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertRuleConditionParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConditionalParams" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfConditionalParameter" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfFeatureVendorServer" minOccurs="0"/>
 *         &lt;element name="LicenseTypes" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}ArrayOfLicenseTypes" minOccurs="0"/>
 *         &lt;element name="Servers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Vendors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertRuleConditionParameters", propOrder = {
    "additionalKey",
    "conditionalParams",
    "features",
    "licenseTypes",
    "servers",
    "users",
    "vendors"
})
public class AlertRuleConditionParameters {

    @XmlElementRef(name = "AdditionalKey", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalKey;
    @XmlElementRef(name = "ConditionalParams", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfConditionalParameter> conditionalParams;
    @XmlElementRef(name = "Features", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFeatureVendorServer> features;
    @XmlElementRef(name = "LicenseTypes", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLicenseTypes> licenseTypes;
    @XmlElementRef(name = "Servers", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> servers;
    @XmlElementRef(name = "Users", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> users;
    @XmlElementRef(name = "Vendors", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> vendors;

    /**
     * Gets the value of the additionalKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalKey() {
        return additionalKey;
    }

    /**
     * Sets the value of the additionalKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalKey(JAXBElement<String> value) {
        this.additionalKey = value;
    }

    /**
     * Gets the value of the conditionalParams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConditionalParameter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfConditionalParameter> getConditionalParams() {
        return conditionalParams;
    }

    /**
     * Sets the value of the conditionalParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfConditionalParameter }{@code >}
     *     
     */
    public void setConditionalParams(JAXBElement<ArrayOfConditionalParameter> value) {
        this.conditionalParams = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFeatureVendorServer> getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}
     *     
     */
    public void setFeatures(JAXBElement<ArrayOfFeatureVendorServer> value) {
        this.features = value;
    }

    /**
     * Gets the value of the licenseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLicenseTypes> getLicenseTypes() {
        return licenseTypes;
    }

    /**
     * Sets the value of the licenseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}
     *     
     */
    public void setLicenseTypes(JAXBElement<ArrayOfLicenseTypes> value) {
        this.licenseTypes = value;
    }

    /**
     * Gets the value of the servers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getServers() {
        return servers;
    }

    /**
     * Sets the value of the servers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setServers(JAXBElement<ArrayOfstring> value) {
        this.servers = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ArrayOfstring> value) {
        this.users = value;
    }

    /**
     * Gets the value of the vendors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getVendors() {
        return vendors;
    }

    /**
     * Sets the value of the vendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setVendors(JAXBElement<ArrayOfstring> value) {
        this.vendors = value;
    }

}
