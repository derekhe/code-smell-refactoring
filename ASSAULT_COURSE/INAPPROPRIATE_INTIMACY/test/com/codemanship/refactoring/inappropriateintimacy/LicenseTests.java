package com.codemanship.refactoring.inappropriateintimacy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LicenseTests
{


	@Test
	public void motoristWithNoPointsOnLicenseIsLowRisk() {
		assertEquals(RiskFactor.LOW_RISK, createLicense(0).getRiskFactor());
	}
	
	@Test
	public void motoristWithOneToThreePointsOnLicenseIsModerateRisk() {
		assertEquals(RiskFactor.MODERATE_RISK, createLicense(1).getRiskFactor());
	}
	
	@Test
	public void motoristWithMoreThanThreePointsOnLicenseIsHighRisk() {
		assertEquals(RiskFactor.HIGH_RISK, createLicense(4).getRiskFactor());
	}

	@Test
	public void licenseSummaryShouldIncludeLicenseHolderFullNameAndPoints(){
		License license = new License();
		Motorist motorist = new Motorist("Gorman", "Jason", "Mr");
		license.addPoints(3);
		license.setMotorist(motorist);
		
		String summary = license.getSummary();
		
		assertEquals("Mr Jason Gorman, 3 points", summary);
	}

	public License createLicense(int points) {
		License license = new License();
		license.addPoints(points);
		return license;
	}


}
