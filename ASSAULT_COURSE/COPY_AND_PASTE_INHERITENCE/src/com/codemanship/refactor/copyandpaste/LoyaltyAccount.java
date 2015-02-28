package com.codemanship.refactor.copyandpaste;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class LoyaltyAccount extends Account
{
	private int loyaltyPoints = 0;

	@Override
	public void credit(float amount) {
		executeTransaction(amount);
		loyaltyPoints ++;
	}

}
