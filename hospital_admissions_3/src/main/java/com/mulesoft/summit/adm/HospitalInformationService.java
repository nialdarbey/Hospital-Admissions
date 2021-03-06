package com.mulesoft.summit.adm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-09-01T12:10:19.565-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.mule-health.com/HospitalInformation/", name = "HospitalInformationService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HospitalInformationService {

    @WebResult(name = "AdmissionResponse", targetNamespace = "http://www.mule-health.com/HospitalInformation/", partName = "admissionResponse")
    @WebMethod(action = "http://www.mule-health.com/HospitalInformation/admit")
    public AdmissionResponse admit(
        @WebParam(partName = "admissionRequest", name = "AdmissionRequest", targetNamespace = "http://www.mule-health.com/HospitalInformation/")
        AdmissionRequest admissionRequest
    );
}
