package com.codemanship.refactor.copyandpaste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public abstract class Account
{
	protected float balance = 0;
	private List transactions = new ArrayList();
	private String lastTransactionDate;

	public float getBalance() {
		return balance;
	}

	public abstract void credit(float amount);

	public void debit(float amount) {
		executeTransaction(-amount);
	}

	protected void executeTransaction(float amount) {
		balance += amount;
		recordTransaction(amount);
		updateLastTransactionDate();
	}

	public Transaction getLastTransaction() {
		return (Transaction)transactions.get(transactions.size()  -1);
	}

	public String getLastTransactionDate() {
		return lastTransactionDate;
	}

	private void recordTransaction(float amount) {
		transactions.add(new Transaction(true, amount));
	}

	private void updateLastTransactionDate() {
		Calendar calendar = Calendar.getInstance();
		lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
		calendar.get(Calendar.MONTH) + "/" +
		calendar.get(Calendar.YEAR);
	}
}
