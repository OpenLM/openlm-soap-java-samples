
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;


/**
 * <p>Java class for ProjectUsageDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectUsageDisplay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDateUTC" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ProjectDisplay" minOccurs="0"/>
 *         &lt;element name="StartDateUTC" type="{http://schemas.datacontract.org/2004/07/OpenLM.Shared.VO}SlimDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProjectUsageDisplay", propOrder = {
    "endDateUTC",
    "project",
    "startDateUTC"
})
public class ProjectUsageDisplay {

    @XmlElementRef(name = "EndDateUTC", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> endDateUTC;
    @XmlElementRef(name = "Project", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectDisplay> project;
    @XmlElementRef(name = "StartDateUTC", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SlimDateTime> startDateUTC;

    /**
     * Gets the value of the endDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getEndDateUTC() {
        return endDateUTC;
    }

    /**
     * Sets the value of the endDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setEndDateUTC(JAXBElement<SlimDateTime> value) {
        this.endDateUTC = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectDisplay }{@code >}
     *     
     */
    public JAXBElement<ProjectDisplay> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectDisplay }{@code >}
     *     
     */
    public void setProject(JAXBElement<ProjectDisplay> value) {
        this.project = value;
    }

    /**
     * Gets the value of the startDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public JAXBElement<SlimDateTime> getStartDateUTC() {
        return startDateUTC;
    }

    /**
     * Sets the value of the startDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}
     *     
     */
    public void setStartDateUTC(JAXBElement<SlimDateTime> value) {
        this.startDateUTC = value;
    }

}
