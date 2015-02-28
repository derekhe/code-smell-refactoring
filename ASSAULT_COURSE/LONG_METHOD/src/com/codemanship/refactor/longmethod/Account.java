package com.codemanship.refactor.longmethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.*;

public class Account
{
    private float balance = 0;
    private String lastDebitDate;
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public void credit(float amount)
    {
        balance += amount;
    }

    public void debit(float amount)
    {
        balance -= amount;
        transactions.add(new Transaction(true, amount));
        lastDebitDate = today();
    }

    public float getBalance()
    {
        return balance;
    }

    public String getLastDebitDate()
    {
        return lastDebitDate;
    }

    public Transaction getLastTransaction()
    {
        return transactions.get(transactions.size() - 1);
    }

    private String today()
    {
        Calendar calendar = getInstance();
        return calendar.get(DATE) + "/" +
                calendar.get(MONTH) + "/" +
                calendar.get(YEAR);
    }
}
