
package com.mulesoft.summit.adm;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Procedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.mule-health.com/HospitalInformation/}ProcedureType"/>
 *         &lt;element name="admission" type="{http://www.mule-health.com/HospitalInformation/}AdmissionType"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "type",
    "admission",
    "department"
})
public class Procedure implements Serializable {

    @XmlElement(required = true)
    protected ProcedureType type;
    @XmlElement(required = true)
    protected AdmissionType admission;
    @XmlElement(required = true)
    protected String department;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureType }
     *     
     */
    public ProcedureType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureType }
     *     
     */
    public void setType(ProcedureType value) {
        this.type = value;
    }

    /**
     * Gets the value of the admission property.
     * 
     * @return
     *     possible object is
     *     {@link AdmissionType }
     *     
     */
    public AdmissionType getAdmission() {
        return admission;
    }

    /**
     * Sets the value of the admission property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdmissionType }
     *     
     */
    public void setAdmission(AdmissionType value) {
        this.admission = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

}
