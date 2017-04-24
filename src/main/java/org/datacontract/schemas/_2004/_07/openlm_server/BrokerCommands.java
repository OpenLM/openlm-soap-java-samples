
package org.datacontract.schemas._2004._07.openlm_server;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokerCommands.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BrokerCommands">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="data_inquiry"/>
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="reread"/>
 *     &lt;enumeration value="save_option_file"/>
 *     &lt;enumeration value="reset_license_file"/>
 *     &lt;enumeration value="reset_option_file"/>
 *     &lt;enumeration value="fetch_file"/>
 *     &lt;enumeration value="remove_license"/>
 *     &lt;enumeration value="denial"/>
 *     &lt;enumeration value="remove_few_licenses"/>
 *     &lt;enumeration value="upload_license_file"/>
 *     &lt;enumeration value="upload_license_file_reread"/>
 *     &lt;enumeration value="upload_license_file_restart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BrokerCommands", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums")
@XmlEnum
public enum BrokerCommands {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("data_inquiry")
    DATA_INQUIRY("data_inquiry"),
    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("reread")
    REREAD("reread"),
    @XmlEnumValue("save_option_file")
    SAVE_OPTION_FILE("save_option_file"),
    @XmlEnumValue("reset_license_file")
    RESET_LICENSE_FILE("reset_license_file"),
    @XmlEnumValue("reset_option_file")
    RESET_OPTION_FILE("reset_option_file"),
    @XmlEnumValue("fetch_file")
    FETCH_FILE("fetch_file"),
    @XmlEnumValue("remove_license")
    REMOVE_LICENSE("remove_license"),
    @XmlEnumValue("denial")
    DENIAL("denial"),
    @XmlEnumValue("remove_few_licenses")
    REMOVE_FEW_LICENSES("remove_few_licenses"),
    @XmlEnumValue("upload_license_file")
    UPLOAD_LICENSE_FILE("upload_license_file"),
    @XmlEnumValue("upload_license_file_reread")
    UPLOAD_LICENSE_FILE_REREAD("upload_license_file_reread"),
    @XmlEnumValue("upload_license_file_restart")
    UPLOAD_LICENSE_FILE_RESTART("upload_license_file_restart");
    private final String value;

    BrokerCommands(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrokerCommands fromValue(String v) {
        for (BrokerCommands c: BrokerCommands.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
