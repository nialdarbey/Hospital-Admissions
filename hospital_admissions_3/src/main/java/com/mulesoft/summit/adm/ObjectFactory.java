
package com.mulesoft.summit.adm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mulesoft.summit.adm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Episode_QNAME = new QName("http://www.mule-health.com/HospitalInformation/", "Episode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.summit.adm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EpisodeType }
     * 
     */
    public EpisodeType createEpisodeType() {
        return new EpisodeType();
    }

    /**
     * Create an instance of {@link AdmissionResponse }
     * 
     */
    public AdmissionResponse createAdmissionResponse() {
        return new AdmissionResponse();
    }

    /**
     * Create an instance of {@link Insurance }
     * 
     */
    public Insurance createInsurance() {
        return new Insurance();
    }

    /**
     * Create an instance of {@link AdmissionRequest }
     * 
     */
    public AdmissionRequest createAdmissionRequest() {
        return new AdmissionRequest();
    }

    /**
     * Create an instance of {@link Procedure }
     * 
     */
    public Procedure createProcedure() {
        return new Procedure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpisodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mule-health.com/HospitalInformation/", name = "Episode")
    public JAXBElement<EpisodeType> createEpisode(EpisodeType value) {
        return new JAXBElement<EpisodeType>(_Episode_QNAME, EpisodeType.class, null, value);
    }

}
