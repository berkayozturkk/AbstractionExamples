package org.berkayozturkk.account.ex;

public class InsufficentBalanceException extends Exception {
	
	public InsufficentBalanceException(String action, double balace, double amount) {
		
	}
	
	public InsufficentBalanceException(double balance, double amount) {
	
	}

}
