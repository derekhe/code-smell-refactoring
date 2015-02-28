package com.codemanship.refactoring.switchstatements;

public class LowRiskQuote extends AbstractInsuranceQuote
{

    @Override
    public double calculateInsurancePremium(double insuranceValue)
    {
        return insuranceValue * 0.02;
    }


}
