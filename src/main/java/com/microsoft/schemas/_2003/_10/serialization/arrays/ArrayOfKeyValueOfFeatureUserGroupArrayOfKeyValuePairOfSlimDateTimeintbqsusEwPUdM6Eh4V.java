
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.FeatureUserGroup;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP;


/**
 * <p>Java class for ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureUserGroup"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V", propOrder = {
    "keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V"
})
public class ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V {

    @XmlElement(name = "KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_PUdM6eh4V")
    protected List<ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V;

    /**
     * Gets the value of the keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> getKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V() {
        if (keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V == null) {
            keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V = new ArrayList<ArrayOfKeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V>();
        }
        return this.keyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V;
    }


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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureUserGroup"/>
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfSlimDateTimeintbqsusEw_P"/>
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
        "key",
        "value"
    })
    public static class KeyValueOfFeatureUserGroupArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected FeatureUserGroup key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link FeatureUserGroup }
         *     
         */
        public FeatureUserGroup getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeatureUserGroup }
         *     
         */
        public void setKey(FeatureUserGroup value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }
         *     
         */
        public ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP }
         *     
         */
        public void setValue(ArrayOfKeyValuePairOfSlimDateTimeintbqsusEwP value) {
            this.value = value;
        }

    }

}
