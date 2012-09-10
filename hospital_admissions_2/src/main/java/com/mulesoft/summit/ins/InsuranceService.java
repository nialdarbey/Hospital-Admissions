package com.mulesoft.summit.ins;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-09-01T11:43:47.552-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.mule-insurance.com/Insurance/", name = "InsuranceService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface InsuranceService {

    @WebResult(name = "HospitalCoverResponse", targetNamespace = "http://www.mule-insurance.com/Insurance/", partName = "hospitalCoverResponse")
    @WebMethod(action = "http://www.mule-insurance.com/Insurance/verify")
    public HospitalCoverResponse verify(
        @WebParam(partName = "hospitalCoverRequest", name = "HospitalCoverRequest", targetNamespace = "http://www.mule-insurance.com/Insurance/")
        HospitalCoverRequest hospitalCoverRequest
    );
}
