
package org.datacontract.schemas._2004._07.openlm_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProjectUsageDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProjectUsageDisplay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProjectUsageDisplay" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}ProjectUsageDisplay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProjectUsageDisplay", propOrder = {
    "projectUsageDisplay"
})
public class ArrayOfProjectUsageDisplay {

    @XmlElement(name = "ProjectUsageDisplay", nillable = true)
    protected List<ProjectUsageDisplay> projectUsageDisplay;

    /**
     * Gets the value of the projectUsageDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectUsageDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectUsageDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectUsageDisplay }
     * 
     * 
     */
    public List<ProjectUsageDisplay> getProjectUsageDisplay() {
        if (projectUsageDisplay == null) {
            projectUsageDisplay = new ArrayList<ProjectUsageDisplay>();
        }
        return this.projectUsageDisplay;
    }

}
