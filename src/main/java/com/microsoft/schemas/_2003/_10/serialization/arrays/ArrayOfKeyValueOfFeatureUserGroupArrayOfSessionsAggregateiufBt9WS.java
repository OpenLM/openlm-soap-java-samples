
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.ArrayOfSessionsAggregate;
import org.datacontract.schemas._2004._07.openlm_server.FeatureUserGroup;


/**
 * <p>Java class for ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9wS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9wS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9wS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}FeatureUserGroup"/>
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSessionsAggregate"/>
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
@XmlType(name = "ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9wS", propOrder = {
    "keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS"
})
public class ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS {

    @XmlElement(name = "KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9wS")
    protected List<ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS> keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS;

    /**
     * Gets the value of the keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS> getKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS() {
        if (keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS == null) {
            keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS = new ArrayList<ArrayOfKeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS.KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS>();
        }
        return this.keyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS;
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
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.VO}ArrayOfSessionsAggregate"/>
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
    public static class KeyValueOfFeatureUserGroupArrayOfSessionsAggregateiufBt9WS {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected FeatureUserGroup key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfSessionsAggregate value;

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
         *     {@link ArrayOfSessionsAggregate }
         *     
         */
        public ArrayOfSessionsAggregate getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfSessionsAggregate }
         *     
         */
        public void setValue(ArrayOfSessionsAggregate value) {
            this.value = value;
        }

    }

}
