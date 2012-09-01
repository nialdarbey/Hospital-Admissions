package com.mulesoft.summit.adm;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-31T22:07:32.176-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "HospitalInformationService", 
                  wsdlLocation = "file:/Users/nialdarbey/MuleStudio/workspace/hospital_admissions_3/src/main/resources/HospitalInformationService.wsdl",
                  targetNamespace = "http://www.mule-health.com/HospitalInformation/") 
public class HospitalInformationService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.mule-health.com/HospitalInformation/", "HospitalInformationService");
    public final static QName HospitalInformationSOAP = new QName("http://www.mule-health.com/HospitalInformation/", "HospitalInformationSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/nialdarbey/MuleStudio/workspace/hospital_admissions_3/src/main/resources/HospitalInformationService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HospitalInformationService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/nialdarbey/MuleStudio/workspace/hospital_admissions_3/src/main/resources/HospitalInformationService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HospitalInformationService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HospitalInformationService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HospitalInformationService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns HospitalInformationService
     */
    @WebEndpoint(name = "HospitalInformationSOAP")
    public HospitalInformationService getHospitalInformationSOAP() {
        return super.getPort(HospitalInformationSOAP, HospitalInformationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HospitalInformationService
     */
    @WebEndpoint(name = "HospitalInformationSOAP")
    public HospitalInformationService getHospitalInformationSOAP(WebServiceFeature... features) {
        return super.getPort(HospitalInformationSOAP, HospitalInformationService.class, features);
    }

}