package com.codemanship.refactor.comments;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Account {
	
	private float balance = 0;
	
	private List<Transaction> transactions = new ArrayList<Transaction>();

	private String lastDebitDate;
	
	private float owing = 0;

	public float getBalance() {
		return balance;
	}

	public void credit(float amount) {
		balance += amount;
	}

	public void debit(float amount) {
		check(amount);
		settle(amount);
		recordTransaction(amount);

		lastDebitDate = updateLastDebitDate(Calendar.getInstance());
	}

	private void settle(float amount) {balance -= amount;}

	public Transaction getLastTransaction() {
		return transactions.get(transactions.size()  -1);
	}

	public String getLastDebitDate() {
		return lastDebitDate;
	}

	private void check(float amount)
	{
		if(amount > 1000){
			throw new IllegalArgumentException("Maximum debit amount exceeded");
		}
	}

	private String updateLastDebitDate(Calendar calendar)
	{
		return calendar.get(Calendar.DATE) + "/" +
				calendar.get(Calendar.MONTH) + "/" +
				calendar.get(Calendar.YEAR);
	}

	private void recordTransaction(float amount) {transactions.add(new Transaction(true, amount));}
}
