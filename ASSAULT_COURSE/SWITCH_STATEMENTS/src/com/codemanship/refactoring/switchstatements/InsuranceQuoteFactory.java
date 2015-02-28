package com.codemanship.refactoring.switchstatements;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class InsuranceQuoteFactory
{
    public static AbstractInsuranceQuote getInsuranceQuote(String dateOfBirth, int pointsOnLicense) throws ParseException
    {
        Motorist motorist = new Motorist(parseDate(dateOfBirth), pointsOnLicense);
        RiskFactor riskFactor = new RiskCalculator().calculateMotoristRisk(motorist);

        switch (riskFactor) {
            case HIGH_RISK:
                return new HighRiskQuote();
            case MODERATE_RISK:
                return new ModerateRiskQuote();
            default:
                return new LowRiskQuote();
        }
    }

    private static Date parseDate(String dateOfBirth) throws ParseException
    {
        return new SimpleDateFormat("yyyy-MM-dd").parse(dateOfBirth);
    }
}
