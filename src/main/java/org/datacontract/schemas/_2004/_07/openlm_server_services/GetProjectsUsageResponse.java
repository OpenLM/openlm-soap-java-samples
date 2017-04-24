
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetProjectsUsageResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetProjectsUsageResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ProjectsUsage" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ArrayOfProjectUsageDisplay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProjectsUsageResponse", propOrder = {
    "projectsUsage"
})
public class GetProjectsUsageResponse
    extends BaseResponse
{

    @XmlElementRef(name = "ProjectsUsage", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProjectUsageDisplay> projectsUsage;

    /**
     * Gets the value of the projectsUsage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProjectUsageDisplay }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProjectUsageDisplay> getProjectsUsage() {
        return projectsUsage;
    }

    /**
     * Sets the value of the projectsUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProjectUsageDisplay }{@code >}
     *     
     */
    public void setProjectsUsage(JAXBElement<ArrayOfProjectUsageDisplay> value) {
        this.projectsUsage = value;
    }

}
