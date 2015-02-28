package com.codemanship.refactor.copyandpaste;

public class SettlementAccount extends Account
{

    private float owing = 0;

    public void credit(float amount)
    {
        executeTransaction(amount);
    }

    public void borrow(float amount)
    {
        owing += amount;
    }

    public void settle()
    {
        balance -= owing;
    }
}
