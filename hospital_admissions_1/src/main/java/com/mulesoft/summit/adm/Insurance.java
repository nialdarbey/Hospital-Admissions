
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Insurance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Insurance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plan" type="{http://www.mule-health.com/HospitalInformation/}InsurancePlanType"/>
 *         &lt;element name="caseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Insurance", propOrder = {
    "plan",
    "caseNumber"
})
public class Insurance {

    @XmlElement(required = true)
    protected InsurancePlanType plan;
    @XmlElement(required = true)
    protected String caseNumber;

    /**
     * Gets the value of the plan property.
     * 
     * @return
     *     possible object is
     *     {@link InsurancePlanType }
     *     
     */
    public InsurancePlanType getPlan() {
        return plan;
    }

    /**
     * Sets the value of the plan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurancePlanType }
     *     
     */
    public void setPlan(InsurancePlanType value) {
        this.plan = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

}
