
package org.datacontract.schemas._2004._07.openlm_server_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDenial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDenial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Denial" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}Denial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDenial", propOrder = {
    "denial"
})
public class ArrayOfDenial {

    @XmlElement(name = "Denial", nillable = true)
    protected List<Denial> denial;

    /**
     * Gets the value of the denial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the denial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDenial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Denial }
     * 
     * 
     */
    public List<Denial> getDenial() {
        if (denial == null) {
            denial = new ArrayList<Denial>();
        }
        return this.denial;
    }

}
