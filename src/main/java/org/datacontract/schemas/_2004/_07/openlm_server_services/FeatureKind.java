
package org.datacontract.schemas._2004._07.openlm_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeatureKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Feature"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="Component"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeatureKind")
@XmlEnum
public enum FeatureKind {

    @XmlEnumValue("Feature")
    FEATURE("Feature"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("Component")
    COMPONENT("Component");
    private final String value;

    FeatureKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeatureKind fromValue(String v) {
        for (FeatureKind c: FeatureKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
