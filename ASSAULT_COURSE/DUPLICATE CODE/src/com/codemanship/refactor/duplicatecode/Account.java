package com.codemanship.refactor.duplicatecode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.*;

public class Account
{
    private float balance = 0;
    private List<Transaction> transactions = new ArrayList<Transaction>();
    private String lastTransactionDate;

    public void credit(float amount)
    {
        balance += amount;
        updateTransactions(amount);
    }

    public void debit(float amount)
    {
        balance -= amount;
        updateTransactions(-amount);
    }

    private void updateTransactions(float amount)
    {
        transactions.add(new Transaction(amount));
        lastTransactionDate = today();
    }

    private String today()
    {
        Calendar calendar = getInstance();
        return calendar.get(DATE) + "/" +
                calendar.get(MONTH) + "/" +
                calendar.get(YEAR);
    }

    public float getBalance()
    {
        return balance;
    }

    public Transaction getLastTransaction()
    {
        return transactions.get(transactions.size() - 1);
    }

    public String getLastTransactionDate()
    {
        return lastTransactionDate;
    }

}
