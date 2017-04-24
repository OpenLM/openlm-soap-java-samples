
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutPolicySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckoutPolicySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="LicenseFile"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Output"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckoutPolicySource")
@XmlEnum
public enum CheckoutPolicySource {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LicenseFile")
    LICENSE_FILE("LicenseFile"),
    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Output")
    OUTPUT("Output");
    private final String value;

    CheckoutPolicySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckoutPolicySource fromValue(String v) {
        for (CheckoutPolicySource c: CheckoutPolicySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
