package com.codemanship.refactoring.switchstatements;

public class ModerateRiskQuote extends AbstractInsuranceQuote
{

    @Override
    public double calculateInsurancePremium(double insuranceValue)
    {
        return insuranceValue * 0.04;
    }
}
