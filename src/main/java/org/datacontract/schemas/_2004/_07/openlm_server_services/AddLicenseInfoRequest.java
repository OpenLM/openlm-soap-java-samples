
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_shared_public.LicenseTypes;


/**
 * <p>Java class for AddLicenseInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddLicenseInfoRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ComponentsInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDates" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfExpirationDate" minOccurs="0"/>
 *         &lt;element name="FeatureKind" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}FeatureKind" minOccurs="0"/>
 *         &lt;element name="LicenseServetID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LicenseType" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.Public.Enums}LicenseTypes" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLicenseInfoRequest", propOrder = {
    "componentsInfo",
    "expirationDates",
    "featureKind",
    "licenseServetID",
    "licenseType",
    "name",
    "packageID",
    "vendor",
    "version"
})
public class AddLicenseInfoRequest
    extends BaseRequest
{

    @XmlElementRef(name = "ComponentsInfo", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentsInfo;
    @XmlElementRef(name = "ExpirationDates", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExpirationDate> expirationDates;
    @XmlElement(name = "FeatureKind")
    @XmlSchemaType(name = "string")
    protected FeatureKind featureKind;
    @XmlElement(name = "LicenseServetID")
    protected Integer licenseServetID;
    @XmlElement(name = "LicenseType")
    @XmlSchemaType(name = "string")
    protected LicenseTypes licenseType;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PackageID", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> packageID;
    @XmlElementRef(name = "Vendor", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendor;
    @XmlElementRef(name = "Version", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;

    /**
     * Gets the value of the componentsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentsInfo() {
        return componentsInfo;
    }

    /**
     * Sets the value of the componentsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentsInfo(JAXBElement<String> value) {
        this.componentsInfo = value;
    }

    /**
     * Gets the value of the expirationDates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExpirationDate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExpirationDate> getExpirationDates() {
        return expirationDates;
    }

    /**
     * Sets the value of the expirationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExpirationDate }{@code >}
     *     
     */
    public void setExpirationDates(JAXBElement<ArrayOfExpirationDate> value) {
        this.expirationDates = value;
    }

    /**
     * Gets the value of the featureKind property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureKind }
     *     
     */
    public FeatureKind getFeatureKind() {
        return featureKind;
    }

    /**
     * Sets the value of the featureKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureKind }
     *     
     */
    public void setFeatureKind(FeatureKind value) {
        this.featureKind = value;
    }

    /**
     * Gets the value of the licenseServetID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicenseServetID() {
        return licenseServetID;
    }

    /**
     * Sets the value of the licenseServetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicenseServetID(Integer value) {
        this.licenseServetID = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseTypes }
     *     
     */
    public LicenseTypes getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTypes }
     *     
     */
    public void setLicenseType(LicenseTypes value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPackageID() {
        return packageID;
    }

    /**
     * Sets the value of the packageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPackageID(JAXBElement<Integer> value) {
        this.packageID = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendor(JAXBElement<String> value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

}
