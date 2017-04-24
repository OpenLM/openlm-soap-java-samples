
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.UpdateAction;


/**
 * <p>Java class for RouteInstructionDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteInstructionDisplay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router}RouteInstruction">
 *       &lt;sequence>
 *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsLicensed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateAction" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}UpdateAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInstructionDisplay", propOrder = {
    "applicationName",
    "entityName",
    "isLicensed",
    "updateAction"
})
public class RouteInstructionDisplay
    extends RouteInstruction
{

    @XmlElementRef(name = "ApplicationName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationName;
    @XmlElementRef(name = "EntityName", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElement(name = "IsLicensed")
    protected Boolean isLicensed;
    @XmlElement(name = "UpdateAction")
    @XmlSchemaType(name = "string")
    protected UpdateAction updateAction;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationName(JAXBElement<String> value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the isLicensed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLicensed() {
        return isLicensed;
    }

    /**
     * Sets the value of the isLicensed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLicensed(Boolean value) {
        this.isLicensed = value;
    }

    /**
     * Gets the value of the updateAction property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAction }
     *     
     */
    public UpdateAction getUpdateAction() {
        return updateAction;
    }

    /**
     * Sets the value of the updateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAction }
     *     
     */
    public void setUpdateAction(UpdateAction value) {
        this.updateAction = value;
    }

}
