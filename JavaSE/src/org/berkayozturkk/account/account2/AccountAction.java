package org.berkayozturkk.account.account2;

import org.berkayozturkk.account.ex.InsufficentBalanceException;

public interface AccountAction {
	public double act(double balance, double amount) throws InsufficentBalanceException;


}
