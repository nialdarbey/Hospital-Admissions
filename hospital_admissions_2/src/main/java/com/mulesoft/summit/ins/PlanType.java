
package com.mulesoft.summit.ins;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="PREMIUM"/>
 *     &lt;enumeration value="ROYAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanType")
@XmlEnum
public enum PlanType {

    BASIC,
    PREMIUM,
    ROYAL;

    public String value() {
        return name();
    }

    public static PlanType fromValue(String v) {
        return valueOf(v);
    }

}
