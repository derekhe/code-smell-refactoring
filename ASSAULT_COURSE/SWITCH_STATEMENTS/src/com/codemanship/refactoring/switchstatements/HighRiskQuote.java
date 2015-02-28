package com.codemanship.refactoring.switchstatements;

public class HighRiskQuote extends AbstractInsuranceQuote
{

    @Override
    public double calculateInsurancePremium(double insuranceValue)
    {
        return insuranceValue * 0.06;
    }
}
