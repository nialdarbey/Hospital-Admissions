package com.mulesoft.summit.ins;

public class InsuranceServiceImpl implements InsuranceService {

	@Override
	public HospitalCoverResponse verify(HospitalCoverRequest hospitalCoverRequest) {
		HospitalCoverResponse response = new HospitalCoverResponse();
		response.setCaseNumber("CA-9999");
		PlanType plan = null;
		if (hospitalCoverRequest.getInsuranceNumber().equals("NA1111")) {
			plan = PlanType.ROYAL;
		} else if (hospitalCoverRequest.getInsuranceNumber().equals("NA2222")) {
			plan = PlanType.PREMIUM;
		} else {
			plan = PlanType.BASIC;
		}
		response.setStatus(StatusType.COVERED);
		response.setPlan(plan);
		return response;
	}

}
