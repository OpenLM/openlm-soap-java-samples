
package org.datacontract.schemas._2004._07.openlm_shared_public;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckoutPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="UserAndDisplay"/>
 *     &lt;enumeration value="Host"/>
 *     &lt;enumeration value="UserAndHost"/>
 *     &lt;enumeration value="DisplayAndHost"/>
 *     &lt;enumeration value="UserAndDisplayAndHost"/>
 *     &lt;enumeration value="Vendor"/>
 *     &lt;enumeration value="UserAndVendor"/>
 *     &lt;enumeration value="DisplayAndVendor"/>
 *     &lt;enumeration value="UserAndDisplayAndVendor"/>
 *     &lt;enumeration value="HostAndVendor"/>
 *     &lt;enumeration value="UserAndHostAndVendor"/>
 *     &lt;enumeration value="DisplayAndHostAndVendor"/>
 *     &lt;enumeration value="UserAndDisplayAndHostAndVendor"/>
 *     &lt;enumeration value="Site"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckoutPolicy")
@XmlEnum
public enum CheckoutPolicy {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("UserAndDisplay")
    USER_AND_DISPLAY("UserAndDisplay"),
    @XmlEnumValue("Host")
    HOST("Host"),
    @XmlEnumValue("UserAndHost")
    USER_AND_HOST("UserAndHost"),
    @XmlEnumValue("DisplayAndHost")
    DISPLAY_AND_HOST("DisplayAndHost"),
    @XmlEnumValue("UserAndDisplayAndHost")
    USER_AND_DISPLAY_AND_HOST("UserAndDisplayAndHost"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor"),
    @XmlEnumValue("UserAndVendor")
    USER_AND_VENDOR("UserAndVendor"),
    @XmlEnumValue("DisplayAndVendor")
    DISPLAY_AND_VENDOR("DisplayAndVendor"),
    @XmlEnumValue("UserAndDisplayAndVendor")
    USER_AND_DISPLAY_AND_VENDOR("UserAndDisplayAndVendor"),
    @XmlEnumValue("HostAndVendor")
    HOST_AND_VENDOR("HostAndVendor"),
    @XmlEnumValue("UserAndHostAndVendor")
    USER_AND_HOST_AND_VENDOR("UserAndHostAndVendor"),
    @XmlEnumValue("DisplayAndHostAndVendor")
    DISPLAY_AND_HOST_AND_VENDOR("DisplayAndHostAndVendor"),
    @XmlEnumValue("UserAndDisplayAndHostAndVendor")
    USER_AND_DISPLAY_AND_HOST_AND_VENDOR("UserAndDisplayAndHostAndVendor"),
    @XmlEnumValue("Site")
    SITE("Site");
    private final String value;

    CheckoutPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckoutPolicy fromValue(String v) {
        for (CheckoutPolicy c: CheckoutPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
