package com.bridgeit.serviceimpl;

import com.bridgeit.model.Account;

public class AccountServiceImpl {

	public void updateAccountBalance(Account account, Long amount) {
		System.out.println(" account number "+account.getAccountNumber()+" amount is "+amount);
	}
}
