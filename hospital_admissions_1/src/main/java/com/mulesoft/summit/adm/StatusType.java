
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADMISSABLE"/>
 *     &lt;enumeration value="NOT_ADMISSABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    ADMISSABLE,
    NOT_ADMISSABLE;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
