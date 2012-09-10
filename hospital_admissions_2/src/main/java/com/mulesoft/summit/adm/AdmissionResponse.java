
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.mule-health.com/HospitalInformation/}StatusType"/>
 *         &lt;element name="episode" type="{http://www.mule-health.com/HospitalInformation/}EpisodeType" minOccurs="0"/>
 *         &lt;element name="insurance" type="{http://www.mule-health.com/HospitalInformation/}Insurance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "episode",
    "insurance"
})
@XmlRootElement(name = "AdmissionResponse")
public class AdmissionResponse {

    @XmlElement(required = true)
    protected StatusType status;
    protected EpisodeType episode;
    protected Insurance insurance;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the episode property.
     * 
     * @return
     *     possible object is
     *     {@link EpisodeType }
     *     
     */
    public EpisodeType getEpisode() {
        return episode;
    }

    /**
     * Sets the value of the episode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EpisodeType }
     *     
     */
    public void setEpisode(EpisodeType value) {
        this.episode = value;
    }

    /**
     * Gets the value of the insurance property.
     * 
     * @return
     *     possible object is
     *     {@link Insurance }
     *     
     */
    public Insurance getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Insurance }
     *     
     */
    public void setInsurance(Insurance value) {
        this.insurance = value;
    }

}
