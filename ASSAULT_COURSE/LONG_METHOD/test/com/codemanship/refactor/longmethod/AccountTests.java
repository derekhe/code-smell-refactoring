package com.codemanship.refactor.longmethod;

import org.junit.Test;

import java.util.Calendar;

import static java.util.Calendar.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountTests
{

    @Test
    public void debitingAccountShouldDeductAmountFromBalanceRecordTransactionAndUpdateLastdebitDate() throws Exception
    {
        Account account = new Account();

        account.credit(100);
        account.debit(50);

        assertEquals(50, account.getBalance(), 0);
        assertTrue(account.getLastTransaction().isDebit());
        assertEquals(50, account.getLastTransaction().getAmount(), 0);
        assertEquals(today(), account.getLastDebitDate());
    }

    @Test
    public void creditingAccountShouldAddAmountToBalance() throws Exception
    {
        Account account = new Account();

        account.credit(50);

        assertEquals(50, account.getBalance(), 0);
    }

    private String today()
    {
        Calendar calendar = getInstance();
        return calendar.get(DATE) + "/" +
                calendar.get(MONTH) + "/" +
                calendar.get(YEAR);
    }

}
