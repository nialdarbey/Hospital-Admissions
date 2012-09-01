
package com.mulesoft.summit.adm;

import javax.xml.bind.annotation.XmlRegistry;


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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mulesoft.summit.adm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdmissionResponse }
     * 
     */
    public AdmissionResponse createAdmissionResponse() {
        return new AdmissionResponse();
    }

    /**
     * Create an instance of {@link EpisodeType }
     * 
     */
    public EpisodeType createEpisodeType() {
        return new EpisodeType();
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

}
