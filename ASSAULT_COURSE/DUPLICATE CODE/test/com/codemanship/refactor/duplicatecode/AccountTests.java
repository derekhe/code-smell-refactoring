package com.codemanship.refactor.duplicatecode;

import static java.util.Calendar.*;
import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class AccountTests
{
    @Test
    public void debitingAccountShouldDeductAmountFromBalanceRecordTransactionAndUpdateLastDebitDate() throws Exception
    {
        Account account = new Account();

        account.credit(100);
        account.debit(50);

        assertEquals(50, account.getBalance(), 0);
        assertEquals(-50, account.getLastTransaction().getAmount(), 0);
        assertEquals(today(), account.getLastTransactionDate());
    }

    @Test
    public void creditingAccountShouldAddAmountFromBalanceRecordTransactionAndUpdateLastDebitDate() throws Exception
    {
        Account account = new Account();

        account.credit(50);

        assertEquals(50, account.getBalance(), 0);
        assertEquals(50, account.getLastTransaction().getAmount(), 0);
        assertEquals(today(), account.getLastTransactionDate());
    }

    private String today()
    {
        Calendar calendar = getInstance();
        return calendar.get(DATE) + "/" +
                calendar.get(MONTH) + "/" +
                calendar.get(YEAR);
    }

}
