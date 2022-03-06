package org.berkayozturkk.account.account1;

import org.berkayozturkk.account.ex.InsufficentBalanceException;
import org.berkayozturkk.account.ex.NegativeAmountException;

public class Account {
	private int id;
	private double balance;
	
	public void changeBalace(String action, double amount) 	throws InsufficentBalanceException, NegativeAmountException {
		
		if(amount < 0) {
			throw new NegativeAmountException(amount);
		}
		
		if(action.equals("Deposit")) {
			balance += amount;
		} else if (action.equals("Withdraw")) {
			if(balance >= amount)
				balance -= amount;
			else
				throw new InsufficentBalanceException(action,balance,amount);
		}
	}
}
