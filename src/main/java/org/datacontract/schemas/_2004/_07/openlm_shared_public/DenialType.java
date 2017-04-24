
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DenialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="NoLicenseAvailable"/>
 *     &lt;enumeration value="AllLicensesAreReservedForOthers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DenialType")
@XmlEnum
public enum DenialType {

    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("NoLicenseAvailable")
    NO_LICENSE_AVAILABLE("NoLicenseAvailable"),
    @XmlEnumValue("AllLicensesAreReservedForOthers")
    ALL_LICENSES_ARE_RESERVED_FOR_OTHERS("AllLicensesAreReservedForOthers");
    private final String value;

    DenialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenialType fromValue(String v) {
        for (DenialType c: DenialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
