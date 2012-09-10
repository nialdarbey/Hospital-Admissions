
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdmissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdmissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ELECTIVE"/>
 *     &lt;enumeration value="EMERGENCY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdmissionType")
@XmlEnum
public enum AdmissionType {

    ELECTIVE,
    EMERGENCY;

    public String value() {
        return name();
    }

    public static AdmissionType fromValue(String v) {
        return valueOf(v);
    }

}
