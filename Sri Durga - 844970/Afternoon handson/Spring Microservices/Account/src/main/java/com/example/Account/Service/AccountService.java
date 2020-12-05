package com.example.Account.Service;

import org.springframework.stereotype.Service;

import com.example.Account.Model.Account;

@Service
public class AccountService {

	public Account fetchAccountByID(long accountNumber) {
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAmount(new Double(Math.random()*accountNumber).intValue());
		return account;
	}

}
