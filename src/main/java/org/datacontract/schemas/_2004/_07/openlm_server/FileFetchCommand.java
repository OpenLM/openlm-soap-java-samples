
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileFetchCommand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileFetchCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Download"/>
 *     &lt;enumeration value="Upload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileFetchCommand", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum FileFetchCommand {

    @XmlEnumValue("Download")
    DOWNLOAD("Download"),
    @XmlEnumValue("Upload")
    UPLOAD("Upload");
    private final String value;

    FileFetchCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileFetchCommand fromValue(String v) {
        for (FileFetchCommand c: FileFetchCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
