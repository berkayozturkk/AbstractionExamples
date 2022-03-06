package org.berkayozturkk.account.account2;

import org.berkayozturkk.account.ex.*;

public class Account {
	
	private int id;
	private double balance;

	public void changeBalance(AccountAction action, double amount)
			throws InsufficentBalanceException, NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException(amount);

		balance = action.act(balance, amount);

	}


}
