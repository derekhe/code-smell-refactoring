package com.codemanship.refactoring.divergentchange;

public class XmlMessageParser
{
    public String toXml(Account account)
    {
        return "<account><id>" + Integer.toString(account.getAccountNumber()) + "</id>" +
                "<balance>" + Double.toString(account.getBalance()) + "</balance></account>";
    }
}