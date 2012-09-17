package com.mulesoft.summit.service;

import com.mulesoft.summit.ins.HospitalCoverRequest;
import com.mulesoft.summit.ins.HospitalCoverResponse;
import com.mulesoft.summit.ins.InsuranceService;
import com.mulesoft.summit.ins.PlanType;
import com.mulesoft.summit.ins.StatusType;

public class InsuranceServiceImpl implements InsuranceService {

	@Override
	public HospitalCoverResponse verify(HospitalCoverRequest hospitalCoverRequest) {
		HospitalCoverResponse response = new HospitalCoverResponse();
		response.setCaseNumber("CA-" + hospitalCoverRequest.getInsuranceNumber().substring(2));
		PlanType plan = null;
		if (hospitalCoverRequest.getInsuranceNumber().equals("NA1111")) {
			plan = PlanType.ROYAL;
		} else if (hospitalCoverRequest.getInsuranceNumber().equals("NA2222")) {
			plan = PlanType.PREMIUM;
		} else if (hospitalCoverRequest.getInsuranceNumber().equals("NA3333")) {
			plan = PlanType.BASIC;
		} else {
			response.setStatus(StatusType.NOT_COVERED);
			return response;
		}
		response.setStatus(StatusType.COVERED);
		response.setPlan(plan);
		return response;
	}

}
