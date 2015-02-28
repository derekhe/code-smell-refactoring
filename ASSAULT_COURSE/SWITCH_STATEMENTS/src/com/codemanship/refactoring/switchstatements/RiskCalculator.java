package com.codemanship.refactoring.switchstatements;

public class RiskCalculator
{
    public RiskFactor calculateMotoristRisk(Motorist motorist)
    {
        if (motorist.getPointsOnLicense() > 3 || motorist.getAge() < 25) return RiskFactor.HIGH_RISK;

        if (motorist.getPointsOnLicense() > 0) return RiskFactor.MODERATE_RISK;

        return RiskFactor.LOW_RISK;
    }
}