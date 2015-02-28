package com.codemanship.refactoring.featureenvy;

import static org.junit.Assert.assertEquals;

public class InsuranceQuote {

	Motorist motorist;

	public InsuranceQuote(Motorist motorist) {
		this.motorist = motorist;
	}

	public double calculateInsurancePremium(double insuranceValue) {
		RiskFactor riskFactor = motorist.calculateMotoristRisk();
		
		switch(riskFactor){
		case LOW_RISK :
			return insuranceValue * 0.02;
		case MODERATE_RISK :
			return insuranceValue * 0.04;
		default :
			return insuranceValue * 0.06;
		}

	}



}
