
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.openlm_server.FileFetchCommand;


/**
 * <p>Java class for FileFetchStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileFetchStatusRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums}FileFetchCommand" minOccurs="0"/>
 *         &lt;element name="TaskId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFetchStatusRequest", propOrder = {
    "command",
    "taskId"
})
public class FileFetchStatusRequest
    extends BaseRequest
{

    @XmlElement(name = "Command")
    @XmlSchemaType(name = "string")
    protected FileFetchCommand command;
    @XmlElement(name = "TaskId")
    protected Integer taskId;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link FileFetchCommand }
     *     
     */
    public FileFetchCommand getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFetchCommand }
     *     
     */
    public void setCommand(FileFetchCommand value) {
        this.command = value;
    }

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskId(Integer value) {
        this.taskId = value;
    }

}
