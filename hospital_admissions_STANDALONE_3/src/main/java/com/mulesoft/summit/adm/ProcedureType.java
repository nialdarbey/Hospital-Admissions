
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcedureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcedureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_PATIENT"/>
 *     &lt;enumeration value="DAY_PATIENT"/>
 *     &lt;enumeration value="OUT_PATIENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcedureType")
@XmlEnum
public enum ProcedureType {

    IN_PATIENT,
    DAY_PATIENT,
    OUT_PATIENT;

    public String value() {
        return name();
    }

    public static ProcedureType fromValue(String v) {
        return valueOf(v);
    }

}
